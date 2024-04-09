package notas;

import java.util.Scanner;

public class NotasApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaAlumnos obj = new ListaAlumnos();
		
		try {
			obj.agregarAlumnos();
			obj.guardarFichero();
			obj.leerFichero();
			obj.leerAprobados();
			obj.leerSuspensos();
		}catch(Exception ex){
			System.out.println();
			System.out.println("Error: " + ex.getMessage());
			System.out.println();
			main(args);
		}

	}
}
