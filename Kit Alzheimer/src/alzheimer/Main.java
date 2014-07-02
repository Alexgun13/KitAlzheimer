package alzheimer;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
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

public class Main extends JFrame {

	private JPanel contentPane;
	public static Configuracion config;
	public static chart grafica;
	private JPanel grafic;
	private static int tipo=1;
	public static Lista lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
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
		contentPane.setToolTipText("hola");
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
		btnMesure.setBounds(275, 38, 67, 23);
		contentPane.add(btnMesure);
		
		grafica = new chart("Grafica", tipo);
		grafica.setBounds(451, 38, 399, 330);
		grafic = grafica;
		contentPane.add(grafic);
		grafica.setLayout(new GridLayout(1, 0, 0, 0));
		
		lista = new Lista();
		JScrollPane panelList = new JScrollPane(lista);
		panelList.setBounds(274, 64, 167, 425);
		contentPane.add(panelList);
		
		JPanel PanelTable = new JPanel();
		PanelTable.setBounds(451, 373, 399, 116);
		PanelTable.setBackground(new Color(34, 139, 34));
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
		
		
	}
}
