package partidoFutbol;

import java.util.Scanner;

public class PartidoApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayPartido obj = new ArrayPartido();
		
		obj.insertarPartidos();
		for(int i = 0; i < obj.getPartido().size(); i++) {
			System.out.println(obj.getPartido().get(i).toString());
		}
		System.out.println();
		obj.localesGanadores();
		System.out.println();
		obj.empates();
		System.out.println();
		obj.clasificacion();
		obj.eliminarNoEmpates();
		System.out.println();
		for(int i = 0; i < obj.getPartido().size(); i++) {
			System.out.println(obj.getPartido().get(i).toString());
		}
		
		
	}

}
