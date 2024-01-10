package arrayEjercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] num;
		int n; 
		double media;
		
		System.out.print("Introduce la cantidad de alumnos a registrar: ");
		n = in.nextInt();
		
		num = new int [n];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Introduce la nota del alumno nº " + (i+1) + ": ");
			num[i] = in.nextInt();
		}
		
		media = calculoMedia(num);
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > media) System.out.println("El alumno nº " + (i+1) + " tiene una nota superior a la media: " + num[i]);
		}

	}
	public static double calculoMedia(int [] notas) {
		int suma = 0;
		double media;
		for(int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		media = suma / notas.length;
		return media;
	}

}
