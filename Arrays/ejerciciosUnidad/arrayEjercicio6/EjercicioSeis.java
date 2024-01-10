package arrayEjercicio6;

import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int [4];
		double suma = 0;
		
		for(int i = 0; i < n.length; i++) {
			System.out.print("Introduzca la nota nº" + (i+1) + " del alumno: ");
			n[i] = in.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			suma+= n[i];
		}
		
		System.out.println();
		System.out.print("La media del alumno es " + (suma/n.length));

	}

}
