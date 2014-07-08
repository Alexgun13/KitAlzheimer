package alzheimer;

import java.util.ArrayList;


public class ArrayListaArray{
	
	static ArrayList<ArrayList<double[]>> DatosList = new ArrayList<ArrayList<double[]>>();
	
	public static int getSize() {
	return DatosList.size();
	}
	
	public static ArrayList<double[]> getElementAt(int i) {
		return DatosList.get(i);
		}
	
	public static void  AgregaDato(ArrayList dato){
		DatosList.add(dato);
	}
	
	public static void eliminaDato(int n){
		DatosList.remove(n);
	}
	
	public static ArrayList getArray(){
		return DatosList;
		
	}
	
	public static void Reinicia(){
		while(DatosList.size()>0)DatosList.remove(0);
	}
	
}

