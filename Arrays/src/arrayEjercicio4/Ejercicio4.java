package arrayEjercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String[] n = new String [4];
		int[] lo = new int [4];
		
		nomApell(n);
		System.out.println();
		mostrar(n);
		
	}
	
	public static void nomApell(String [] z) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < z.length; i++) {
			System.out.print("Introduce el nombre y apellidos de la persona numº " + i + ": " );
			z[i] = in.nextLine();
		}
	}
	
	public static void mostrar(String [] z) {
		for(int i = 0; i < z.length; i++) {
			System.out.println("El nombre y apellidos de la posicion " + i + " es " + z[i] + " y tiene una longitud de " + z[i].length() );
		}
	}

}
