package alzheimer;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.BoxLayout;

import java.awt.Panel;
import java.awt.event.MouseEvent;

public class CheckLista{
	
	static JTable TablaDatos;
	static DefaultTableModel miTableModel;
	static JScrollPane panel;
	public static String nombre;

	/**
	 * Create the panel.
	 */
	
	public static void nuevaTabla(){

		miTableModel = (DefaultTableModel) TablaDatos.getModel();
	    miTableModel.addColumn("Select");
		miTableModel.addColumn("Mesures");
		
		
		TablaDatos = new JTable(miTableModel){
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
		TablaDatos.setShowGrid(false);
		TableColumn columna1 = TablaDatos.getColumn("Select");
		columna1.setMaxWidth(85);
		TableColumn columna2 = TablaDatos.getColumn("Mesures");
		columna2.setMaxWidth(55);
		setEventoMouseClicked(TablaDatos);
		
	
	}
	
	public static void AgregaFila(Boolean marca, String str){
		miTableModel = (DefaultTableModel) TablaDatos.getModel();
		Object nuevaFila[]= {marca, str};
	    miTableModel.addRow(nuevaFila);
	}
	
	public static int filas(){
		int filas = miTableModel.getRowCount();
		return filas;
	}
	
	public static boolean ObtenSeleccion(int i){
		boolean seleccion= (Boolean) TablaDatos.getValueAt(i,0);
		return seleccion;
	}
	
	public static String ObtenNombre(int i){
		String nombre= (String) TablaDatos.getValueAt(i,1);
		return nombre;
	}
	public static void Reinicia(){
		DefaultTableModel modelo = (DefaultTableModel) TablaDatos.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
	}
	
	private static void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
 
        @Override
        public void mouseClicked(MouseEvent e) {
        tblEjemploMouseClicked(e);
        }
        });
    }
 
    private static void tblEjemploMouseClicked(java.awt.event.MouseEvent evt) {

 
        int row = TablaDatos.rowAtPoint(evt.getPoint());
        int column = TablaDatos.columnAtPoint(evt.getPoint());
        if (row >= 0 && TablaDatos.isEnabled())
        {
        	nombre = (String)miTableModel.getValueAt(row,column);
        	botonTable.botonTable();
            }
        
    }
}
