package alzheimer;

import java.awt.Color;

public class EjecucionesMedida implements Runnable{

	public void run(){// run a loop to demonstrate raising
		Main.barraPlano.setForeground(Color.BLUE);
		for (int i = 0; i <= 20; i++) {
			
	          Main.barraPlano.setValue(i);
	          System.out.println("Pinto barra" +i);
	          
	        try {
				Thread.sleep(1010);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          }
		Main.barraPlano.setForeground(Color.GREEN);
		 
	     Main.datosx = IOIORecibe.obtenDatosx();
	     Main.datosy = IOIORecibe.obtenDatosy();
	     Main.datost = IOIORecibe.obtenDatost();
	     
	    double[][] comprueba = new double[20][2];
	    for(int i=0;i<=19;i++){
	    	Main.tiempo[i] = i;
	    	comprueba[i][0]=Main.tiempo[i];
	    	comprueba[i][1] =Main.datosx[i];
	    	System.out.println(comprueba[i][0]+" "+comprueba[i][1]);
	    	
	    }
	    
	    
		Main.grafica.crearGrafica("datosx",  Main.tiempo,  Main.datosx);
		Main.grafica.AgregarGraficas("datosy",  Main.tiempo,  Main.datosy);
		Main.grafica.AgregarGraficas("datost",  Main.tiempo,  Main.datost);
		
		
		
	    }
	  }