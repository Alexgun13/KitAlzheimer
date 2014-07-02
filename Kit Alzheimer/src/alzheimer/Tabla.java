package alzheimer;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

public class Tabla extends JPanel {
	private Component comp;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Tabla() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Freq.", "X", "Y", "|Z|", "Phase"
			}
		));
		scrollPane.setViewportView(table);
		
		
	}
}
