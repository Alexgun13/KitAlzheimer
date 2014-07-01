package alzheimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ConfigPanel extends JFrame {

	private JPanel contentPane;
	public static Config_basico basico;

	/**
	 * Launch the application. funciona
	 * 	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigPanel frame = new ConfigPanel();
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
	public ConfigPanel() {
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
		setBounds(100, 100, 297, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 261, 213);
		contentPane.add(tabbedPane);
		
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Basic", null, scrollPane, null);
		
		basico = new Config_basico();
		JPanel panel = basico;
		scrollPane.setViewportView(panel);
		basico.setLayout(null);
		

		
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Advanced", null, scrollPane_1, null);
		
		JTextPane Incid = new JTextPane();
		Incid.setBounds(5, 258, 261, 138);
		Incid.setText("ventana de incidencias");
		contentPane.add(Incid);
		
		JLabel incidenc = new JLabel("Incidents");
		incidenc.setBounds(10, 229, 46, 14);
		contentPane.add(incidenc);
	}
}
