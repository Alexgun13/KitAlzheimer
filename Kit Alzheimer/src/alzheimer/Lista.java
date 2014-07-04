package alzheimer;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Lista extends JPanel {
	static JTable table;
	public static DefaultTableModel modelo;
	static JTable table_1;
	/**
	 * Create the panel.
	 */
	public Lista() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		DefaultTableModel modelo = new DefaultTableModel();
		// Cantidad de columnas de la tabla
		table_1 = new JTable(new DefaultTableModel(
			new Object[][] {
				{null, Boolean.FALSE},
			},
			new String[] {
				"Hola", "Hola"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setForeground(Color.WHITE);
		table_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		add(table_1);
	}
	
	
}
