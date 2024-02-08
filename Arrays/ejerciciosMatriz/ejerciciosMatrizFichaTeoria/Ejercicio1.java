package ejerciciosMatrizFichaTeoria;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int filas, columnas;
		int [][] matriz = {};
		
		System.out.print("Introduce el número de filas que contiene el array: ");
		filas = in.nextInt();
		System.out.print("Introduce el número de columnas que contiene el array: ");
		columnas = in.nextInt();
		
		matriz = new int [filas][columnas]; /* Crea la matriz en base a los datos previamente solicitados */
		
		matriz = cargarMatriz(matriz); /* Llama al metodo que permite introducir los datos a la matriz */
		mostrarMatriz(matriz); /* Llama al metodo que muestra los datos que contiene la matriz */

	}
	
	public static int[][] cargarMatriz(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				System.out.print("Introduce el valor de la fila nº" + (j+1) + " y columna nº" + (i+1) + ": ");
				matriz[j][i] = in.nextInt();
				}
			}
		return matriz;
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				System.out.println("El valor de la fila nº" + (j+1) + " y columna nº" + (i+1) + " es: " + matriz[j][i]);
				}
			}
	}

}
