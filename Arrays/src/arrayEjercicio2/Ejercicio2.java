package arrayEjercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n, m;
		int v;
		n = new int [4];
		m = new int [4];
		
		rellenar(n);
		System.out.println();
		rellenar(m);
		System.out.println();
		mostrar(n);
		System.out.println();
		mostrar(m);

	}
	public static void rellenar(int[] z) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < z.length; i++) {
			System.out.print("Introduce un valor para el número de la posicion " + i + ": " );
			z[i] = in.nextInt();
		}
	}
	
	public static void mostrar(int [] z) {
		for(int i = 0; i < z.length; i++) {
			System.out.println("El valor que se encuentre en la posicion " + i + " es " + z[i] );
		}
	}

}
