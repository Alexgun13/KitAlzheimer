package alzheimer;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.editor.ChartEditorFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class chart extends JPanel {
	static JFreeChart grafica;
	static XYSeriesCollection datos = new XYSeriesCollection();
	String Titulo;
	String tx;
	String ty;
	
	public chart (String titulo){
		
		this.Titulo = Titulo;
		init();
		grafica = ChartFactory.createXYLineChart(Titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true,true);			
	}
	
	public void init() {

        this.setBorder(BorderFactory.createLineBorder(Color.gray));

    }
	
		
	public static void AgregarGraficas(String id, double[] x, double[] y){
		
		XYSeries s = new XYSeries(id);
		int n = x.length;
		for(int i=0;i<n;i++){
			s.add(x[i], y[i]);
		}
		
		datos.addSeries(s);
	}
	
	public static void crearGrafica(String id, double[] x, double[] y){
		datos.removeAllSeries();
		AgregarGraficas(id,x,y);
	}
	
	
	public static JPanel obtieneGrafica(){
		return new ChartPanel(grafica);
		
		
	}
	

}
