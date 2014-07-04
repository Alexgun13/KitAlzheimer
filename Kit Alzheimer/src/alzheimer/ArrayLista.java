package alzheimer;

import java.util.ArrayList;


public class ArrayLista {
	
	static ArrayList<CheckLista> DatosList = new ArrayList<CheckLista>();
	
	public int getSize() {
	return DatosList.size();
	}
	
	public Object getElementAt(int i) {
		return DatosList.get(i);
		}
	
	public static void AgregaDato(CheckLista checklista){
		DatosList.add(checklista);
	}
	
	public void eliminaDato(int n){
		DatosList.remove(n);
	}
	
	public ArrayList getArray(){
		return DatosList;
		
	}
	
}

