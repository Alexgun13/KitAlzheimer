package alzheimer;

import java.awt.Color;
import java.util.Random;

import javax.swing.event.ListDataEvent;

public class EjecucionesMedida implements Runnable{

	public static boolean DONE;
	
	public void run(){// run a loop to demonstrate raising
		Main.barraPlano.setForeground(Color.BLUE);
		for (int i = 0; i <= 20; i++) {
			
	          Main.barraPlano.setValue(i);
	          
	          
	        try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          }
		Main.barraPlano.setForeground(Color.GREEN);
		 
	     Main.datosx = IOIORecibe.obtenDatosx();
	     Main.datosy = IOIORecibe.obtenDatosy();
	     Main.datost = IOIORecibe.obtenDatost();
	     
	     for(int i=0; i<20;i++){
	    	 Main.tiempo[i]=i;
	     }
	     
	    double[][] comprueba = new double[20][2];
	    DONE = true;
	   
	    Main.grafica.crearGrafica("datosx",  Main.tiempo,  Main.datosx);
		Main.grafica.AgregarGraficas("datosy",  Main.tiempo,  Main.datosy);
		Main.grafica.AgregarGraficas("datost",  Main.tiempo,  Main.datost);
}
	  }