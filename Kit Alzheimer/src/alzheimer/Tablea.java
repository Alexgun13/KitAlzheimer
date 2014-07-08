package alzheimer;

public class Tablea {
public static void Tablea(){
	TablaMedidas.Reinicia();
	for (int i=0; i<ArrayListaArray.DatosList.get(CheckLista.row).size();i++){
	TablaMedidas.AgregaDato(ArrayListaArray.DatosList.get(CheckLista.row).get(i));
	}
	
	Main.scrollMedidas.setViewportView(TablaMedidas.tablaMedidas);
}
}
