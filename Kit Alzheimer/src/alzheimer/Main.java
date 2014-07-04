package alzheimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Panel;
import java.awt.Color;

import javax.swing.JCheckBox;

import java.awt.GridLayout;

import net.miginfocom.swing.MigLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.ScrollPane;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JProgressBar;
import javax.swing.BoxLayout;

import java.awt.FlowLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.CardLayout;
import javax.swing.JTable;

public class Main extends JFrame {

	public JPanel contentPane, panelCajas;
	public JScrollPane scrollPane;
	public static Configuracion config;
	public static chart grafica;
	private JPanel grafic;
	private DefaultListModel model;
	public static double[] datosx= new double [20];
	public static double[] datosy=new double[20];
	public static double[] datost = new double [20];
	static JProgressBar barraPlano;
	private static int tipo=1;
	public static Lista lista;
	public static Tabla tabla;
	public static int numeroDato = 0;
	public static double[] datos = new double[20];
	public static double[] tiempo = new double[20];
	public static IOIORecibe recibe;
	public JCheckBox caja;
	private static JTable table;
	public DefaultTableModel miTableModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Main frame = new Main();
					frame.setVisible(true);
					recibe= new IOIORecibe();
				    recibe.start();;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblConfig = new JLabel("Config");
		lblConfig.setBounds(5, 5, 265, 28);
		lblConfig.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(lblConfig);
		
		config = new Configuracion();
		config.setBounds(5, 38, 265, 398);
		JPanel panel = config;
		contentPane.add(panel);
		
		JButton btnMesure = new JButton("Mesure");
		btnMesure.setBounds(276, 13, 67, 23);
		
		btnMesure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IOIORecibe.reinicia = true;

				miTableModel = (DefaultTableModel) table.getModel();
				Object nuevaFila[]= {Boolean.FALSE, "Dato" + (numeroDato+1)};
			    miTableModel.addRow(nuevaFila);
			   
				scrollPane.setViewportView(panelCajas);
				
				new Thread(new EjecucionesMedida()).start();
				numeroDato ++;
				
				
			}
		});
		contentPane.add(btnMesure);
		
		grafica = new chart("Grafica", tipo);
		grafica.setBounds(451, 38, 399, 330);
		grafic = grafica;
		contentPane.add(grafic);
		grafica.setLayout(new GridLayout(1, 0, 0, 0));
	    
		
		tabla = new Tabla();
		tabla.setBounds(451, 373, 399, 200);
		JPanel PanelTable = tabla;
		contentPane.add(PanelTable);
		
		JCheckBox chcPlot = new JCheckBox("Plot");
		chcPlot.setBounds(275, 494, 43, 23);
		contentPane.add(chcPlot);
		
		JCheckBox chcSave = new JCheckBox("Save");
		chcSave.setBounds(275, 522, 49, 23);
		contentPane.add(chcSave);
		
		JCheckBox chcTable = new JCheckBox("Table");
		chcTable.setBounds(275, 550, 51, 23);
		contentPane.add(chcTable);
		

		barraPlano = new JProgressBar();
		barraPlano.setBounds(276, 38, 146, 27);
		barraPlano.setForeground(Color.BLUE);
		contentPane.add(barraPlano);
		barraPlano.setMaximum(20);
		barraPlano.setStringPainted(true);
		
		JButton btnEncenderIoio = new JButton("Encender");
		btnEncenderIoio.setBounds(5, 494, 89, 23);
		btnEncenderIoio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recibe.stop();
				recibe.start();
			}
		});
		contentPane.add(btnEncenderIoio);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBounds(5, 522, 89, 23);
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recibe.stop();
			}
		});
		contentPane.add(btnApagar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(280, 69, 161, 361);
		contentPane.add(scrollPane);
		
		panelCajas = new JPanel();
		scrollPane.setViewportView(panelCajas);
		
		table = new JTable();
		DefaultTableModel miTableModel = (DefaultTableModel) table.getModel();
	    miTableModel.addColumn("Select");
		miTableModel.addColumn("Mesures");
		table = new JTable(miTableModel){
		    	Class[] columnTypes = new Class[] {
						Boolean.class, Object.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					boolean[] columnEditables = new boolean[] {
							true, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
		    };
		table.setShowGrid(false);
		panelCajas.add(table);
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
		}
