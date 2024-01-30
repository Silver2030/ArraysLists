package matriz;

import java.util.Scanner;

public class Ejercicio1p1 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][4];
		int [] columnas = new int [4];
		int [] filas = new int [3];
		
		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		filas = filaSuma(matriz, filas); /*Muestra la suma de los valores de cada fila*/
		System.out.println();
		columnas = columnaSuma(matriz, columnas); /*Muestra la suma de los valores de cada columna*/
		System.out.println();
		mostrarArrays(columnas, filas);
		System.out.println();
		mostrarMatriz(matriz); /*Muestra la matriz*/
		
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
	
	public static void mostrarMatriz(int [][] matriz) {
		int contador = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(contador == 0) System.out.print("("); /*Marca el inicio de cada linea con un (*/
				contador++;
				System.out.print(matriz[j][i]);
				if(matriz[j].length == contador) {
					System.out.print(") \n");  /*Marca el final de cada linea con un ) y salta a la siguiente linea*/
					contador = 0;
				}
				else System.out.print(" ");
				if(i == matriz[j].length) System.out.println();
			}
		}
	}
	
	public static int[] filaSuma(int [][] matriz, int [] filas) {
		int filaSuma = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				filaSuma += matriz[j][i];
				}
			filas[j] = filaSuma;
			filaSuma = 0;
			}
		return filas;
	}
	
	public static int[] columnaSuma(int [][] matriz, int [] columnas) {
		int columnaSuma = 0;
		for(int j = 0; j < matriz[0].length; j++) {
			for(int i = 0; i < matriz.length; i++) {
				columnaSuma += matriz[i][j];
				}
			columnas[j] = columnaSuma;
			columnaSuma = 0;
			}
		return columnas;
	}
	
	public static void mostrarArrays(int [] columnas, int [] filas) {
		
			for(int i = 0; i < columnas.length; i++) {
				System.out.println("La suma de los números de la columna " + (i+1) + " es " + columnas[i]);
			}
			System.out.println();
			for(int i = 0; i < filas.length; i++) {
				System.out.println("La suma de los números de la fila " + (i+1) + " es " + filas[i]);
			}
	}

}
