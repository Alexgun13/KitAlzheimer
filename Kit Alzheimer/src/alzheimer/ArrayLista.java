package alzheimer;

import java.util.ArrayList;

public class ArrayLista {
	
	ArrayList<CheckLista> DatosList = new ArrayList<CheckLista>();

 
	public void AgregaDato(CheckLista checklista){
		DatosList.add(checklista);
	}
	
	public void eliminaDato(int n){
		DatosList.remove(n);
	}
	
	public ArrayList getArray(){
		return DatosList;
		
	}
	
}

