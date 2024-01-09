package arrayEjercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String[] n = new String [4];
		int[] lo = new int [4];
		
		nomapell(n);
		System.out.println();
		mostrar(n);
		System.out.println();
		longitud(n, lo);
		System.out.println();
		for(int i = 0; i < lo.length; i++) {
			System.out.println("Longitud de la posicion " + i + " es " + lo[i] );
		}
	}
	
	public static void nomapell(String [] z) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < z.length; i++) {
			System.out.print("Introduce el nombre y apellidos de la persona numº " + i + ": " );
			z[i] = in.nextLine();
		}
	}
	
	public static void mostrar(String [] z) {
		for(int i = 0; i < z.length; i++) {
			System.out.println("El nombre y apellidos de la posicion " + i + " es " + z[i] );
		}
	}
	
	public static void longitud(String [] z, int [] x) {
		for(int i = 0; i < z.length; i++) {
			x[i] = z[i].length();
		}
	}

}
