package alzheimer;

public class botonTable {
public static void botonTable(){
	TablaMedidas.Reinicia();
	TablaMedidas.AgregaDato(CheckLista.nombre,0,0,0,0,0,0,0,0,0,0,0,0, 0);
	Main.scrollMedidas.setViewportView(TablaMedidas.tablaMedidas);
}
}
