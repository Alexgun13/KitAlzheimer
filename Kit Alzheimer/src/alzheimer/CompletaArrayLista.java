package alzheimer;

import java.util.ArrayList;

public class CompletaArrayLista {
	
	public static void CompletaArray(){
		ArrayList<double[]> DatosVector = new ArrayList<double[]>();
		double[][]vectordoub = new double[20][13];
		double[]vector = new double[13];
		for(int i=0;i<=19;i++){
	    	
	    	for(int j=0;j<13;j++){
	    
    	vectordoub[i][j]= Math.random();
    	}
	    
	    DatosVector.add(vectordoub[i]);
    	}
    
    ArrayListaArray.AgregaDato(DatosVector);
	}

}
