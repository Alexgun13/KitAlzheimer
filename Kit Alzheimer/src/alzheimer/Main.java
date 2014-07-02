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

public class Main extends JFrame {

	private JPanel contentPane;
	public static Configuracion config;
	public static chart grafica;
	private JPanel grafic;
	private static int tipo=1;

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
		setBounds(100, 100, 955, 614);
		contentPane = new JPanel();
		contentPane.setToolTipText("hola");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		config = new Configuracion();
		JPanel panel = config;
		panel.setBounds(10, 40, 274, 343);
		contentPane.add(panel);
				
		
		
		JLabel lblConfig = new JLabel("Config");
		lblConfig.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblConfig.setBounds(10, 11, 261, 27);
		contentPane.add(lblConfig);
		
		grafica = new chart("Grafica", tipo);
		grafic = grafica;
		grafic.setBounds(483, 40, 398, 267);
		contentPane.add(grafic);
		
		JButton btnMesure = new JButton("Mesure");
		btnMesure.setBounds(384, 40, 89, 23);
		contentPane.add(btnMesure);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(304, 70, 169, 238);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(34, 139, 34));
		panel_2.setBounds(482, 315, 399, 238);
		contentPane.add(panel_2);
	}
}
