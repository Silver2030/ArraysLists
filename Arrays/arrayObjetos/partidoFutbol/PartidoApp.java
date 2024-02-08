package partidoFutbol;

public class PartidoApp {
	
	public static void main(String[] args) {
		ArrayPartido obj = new ArrayPartido();
		
		obj.insertarPartidos(); // Se introducen los datos de los partidos
		obj.mostrarPartidos(); // Muestra todos los partidos
		System.out.println();
		obj.localesGanadores(); // Muestra aquellos equipos que ganaron como locales
		System.out.println();
		obj.empates(); // Muestra solo los partidos con empate
		System.out.println();
		obj.clasificacion(); // Clasificacion de los equipos (Victoria 3 puntos, empate 1 punto)
		obj.eliminarNoEmpates(); // Elimina del arraylist todo partido que no sea empate
		System.out.println();
		obj.mostrarPartidos(); // Muestra todos los partidos
				
	}

}
