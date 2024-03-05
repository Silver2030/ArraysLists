package partidos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPartidos {

	private ArrayList<Partidos> partidoArraylist = new ArrayList<Partidos>();

	public ArrayPartidos() {
		super();
	}

	public ArrayPartidos(ArrayList<Partidos> partidoArraylist) {
		super();
		this.partidoArraylist = partidoArraylist;
	}
	
	public void cargarDatos() {
		Partidos part1 = new Partidos("Valencia", "Real Betis", 1, 0);
		Partidos part2 = new Partidos("Real Betis", "Dep. Osasuna", 1, 0);
		Partidos part3 = new Partidos("Atletico Madrid", "Zaragoza", 0, 0);
		Partidos part4 = new Partidos("Zaragoza", "Valencia", 2, 2);
		Partidos part5 = new Partidos("Mallorca", "Deportivo", 0, 1);
		Partidos part6 = new Partidos("Deportivo", "Atletico Madrid", 1, 0);
		
		this.partidoArraylist.add(part1);
		this.partidoArraylist.add(part2);
		this.partidoArraylist.add(part3);
		this.partidoArraylist.add(part4);
		this.partidoArraylist.add(part5);
		this.partidoArraylist.add(part6);
	}
	
	public void visualizarDatos() { // Muestra todos los partidos
		for(Partidos cadena :this.partidoArraylist) {
			System.out.println(cadena.toString());
		}
		System.out.println();
	}
	
	public void ganadores() {
		System.out.println("EQUIPO LOCALES GANADORES");
		System.out.println(); // Busca cuando golesLocal es superior a golesVisitante y muestra nombre del local
		for(Partidos cadena :this.partidoArraylist) {
			if(cadena.getGolesLocal() > cadena.getGolesVisitante()) {
				System.out.println(cadena.getEquipoLocal());
			}
		}
		System.out.println();
	}
	
	public void empates() {
		System.out.println("PARTIDOS EMPATADOS");
		System.out.println(); // Busca cuando golesLocal y golesVisitante son iguales y muestra todos los datos
		for(Partidos cadena :this.partidoArraylist) {
			if(cadena.getGolesLocal() == cadena.getGolesVisitante()) {
				System.out.println(cadena.toString());
			}
		}
		System.out.println();
	}
	
	public void clasificacion() {
		String[] equipos = {"Valencia", "Real Betis", "Dep. Osasuna", "Atletico Madrid", "Zaragoza", "Mallorca", "Deportivo"};
		int[] puntos = {0, 0, 0, 0, 0, 0, 0};
		for(Partidos cadena :this.partidoArraylist) {
			if(cadena.getGolesLocal() > cadena.getGolesVisitante()) {
				for(int j = 0; j < equipos.length; j++) { // Busca todo local ganador y procede a dar puntos a su posicion en el array
					if(cadena.getEquipoLocal().equals(equipos[j])) puntos[j] += 3;
				}
			}
			else if(cadena.getGolesLocal() < cadena.getGolesVisitante()) {
				for(int j = 0; j < equipos.length; j++) { // Busca todo local visitante y procede a dar puntos a su posicion en el array
					if(cadena.getEquipoVisitante().equals(equipos[j])) puntos[j] += 3;
				}
			}
			else {
				for(int j = 0; j < equipos.length; j++) { // Busca todo empate y procede a dar puntos a ambas posiciones en el array
					if(cadena.getEquipoVisitante().equals(equipos[j])||cadena.getEquipoLocal().equals(equipos[j])) 
						puntos[j] += 1;
				}
			}
		}
		
		tabla(equipos, puntos); // Ordena de mayor a menor
	}
	
	public void tabla(String[] equipos, int[] puntos) {
		int [] puntosOrd = puntos;
		Integer[] posiciones = new Integer[puntos.length];
		for(int i = 0; i < puntos.length; i++) {
			posiciones[i] = i;
		}
		
		Arrays.sort(posiciones, (a, b) -> Integer.compare(puntos[b], puntos[a]));
		
		System.out.println("Equipo" + "\t\t" + "Puntos");
        System.out.println("----------------------");
		for(int j = 0; j < equipos.length; j++) {
			listaClasificacion(equipos[posiciones[j]], puntosOrd[posiciones[j]]);
		}
	}
	
	public void listaClasificacion(String equipos, int puntos) {
    	System.out.println(equipos + "\t" + puntos);
	}

	public ArrayList<Partidos> getPartidoArraylist() {
		return partidoArraylist;
	}

	public void setPartidoArraylist(ArrayList<Partidos> partidoArraylist) {
		this.partidoArraylist = partidoArraylist;
	}
	
}
