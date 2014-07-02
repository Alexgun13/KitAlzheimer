package alzheimer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

public class Configuracion extends JPanel {
	
	private JPanel contentPane;
	public static Config_basico basico;

	/**
	 * Create the panel.
	 */
	public Configuracion() {
		
setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 261, 213);
		add(tabbedPane);
		
		
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
		add(Incid);
		
		JLabel incidenc = new JLabel("Incidents");
		incidenc.setBounds(10, 229, 46, 14);
		add(incidenc);

	}

}
