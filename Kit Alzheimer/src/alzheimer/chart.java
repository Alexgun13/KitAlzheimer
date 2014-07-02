package alzheimer;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.editor.ChartEditorFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BoxLayout;


public class chart extends JPanel {
	static JFreeChart grafica;
	static XYSeriesCollection datos = new XYSeriesCollection();
	String Titulo;
	String tx;
	String ty;
	final static int Lineal=1;
	final static int Log =2;
	
	public chart (String titulo, int tipo){
		
		this.Titulo = Titulo;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		init();
		tipoGrafica(tipo);
		ChartPanel panel = new ChartPanel(grafica);
		add(panel);
	}
	
	public void init() {

        this.setBorder(BorderFactory.createLineBorder(Color.gray));

    }
	
	public void tipoGrafica(int tipo){
		switch(tipo){
		case Lineal:
			grafica = ChartFactory.createXYLineChart(Titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true,true);
			break;
		case Log:
			grafica = ChartFactory.createXYLineChart(Titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true,true);
			XYPlot ejes = new XYPlot();
			NumberAxis rango = new LogarithmicAxis(ty);
			ejes.setRangeAxis(rango);
			break;
			
			
		}
		
		
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
