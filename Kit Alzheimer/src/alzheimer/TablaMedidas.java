package alzheimer;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

public class TablaMedidas extends JPanel {
	private Component comp;
	private JTable table;
	static JTable tablaMedidas;
	static DefaultTableModel miTableModel;
	static JScrollPane panel;


	/**
	 * Create the panel.
	 */
	
	public static void nuevaTabla(){
		
		DefaultTableModel miTableModel = (DefaultTableModel) tablaMedidas.getModel();
		miTableModel.addColumn("Medida");
	    miTableModel.addColumn("freq");
		miTableModel.addColumn("U1");
		miTableModel.addColumn("U2");
		miTableModel.addColumn("U3");
		miTableModel.addColumn("U4");
		miTableModel.addColumn("Xr");
		miTableModel.addColumn("Yr");
		miTableModel.addColumn("|Z|r");
		miTableModel.addColumn("Phaser");
		miTableModel.addColumn("Xc");
		miTableModel.addColumn("Yc");
		miTableModel.addColumn("|Z|c");
		miTableModel.addColumn("Phasec");
		tablaMedidas = new JTable(miTableModel){
		    	Class[] columnTypes = new Class[] {
						Object.class,Double.class, Double.class,Double.class,Double.class,Double.class,Double.class,Double.class,Double.class,Double.class,Double.class,Double.class,Double.class,Double.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					boolean[] columnEditables = new boolean[] {
							false,false,false,false,false,false,false,false,false,false,false,false,false,false,
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
		    };
		tablaMedidas.setShowGrid(true);
		
		TableColumn columna1 = tablaMedidas.getColumn("Medida");
		columna1.setMinWidth(85);
		TableColumn columna2 = tablaMedidas.getColumn("freq");
		columna2.setMinWidth(85);
		TableColumn columna3 = tablaMedidas.getColumn("Phaser");
		columna3.setMinWidth(85);
		TableColumn columna4 = tablaMedidas.getColumn("Phasec");
		columna4.setMinWidth(85);
		
	}
	public static void AgregaDato(double[] vector){
			miTableModel = (DefaultTableModel) tablaMedidas.getModel();
		Object nuevaFila[]= {vector[0], vector[1], vector[2], vector[3], vector[4], vector[5], vector[6], vector[7], vector[8], vector[9], vector[10], vector[11], vector[12]};
	    miTableModel.addRow(nuevaFila);
	}
	
	public static int filas(){
		int filas = tablaMedidas.getRowCount();
		return filas;
	}
	
	public static boolean ObtenDato(int i, int j){
		boolean dato= (Boolean) tablaMedidas.getValueAt(i,j);
		return dato;
	}
	
	public static void Reinicia(){
		DefaultTableModel modelo = (DefaultTableModel) tablaMedidas.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
	}
		
		
	}
