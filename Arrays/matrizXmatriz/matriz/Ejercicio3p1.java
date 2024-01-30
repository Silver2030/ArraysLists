package matriz;

import java.util.Scanner;

public class Ejercicio3p1 {
	
	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		
		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		columnaIgual(matriz);
		System.out.println();
		mostrarMatriz(matriz); /*Muestra los datos dentro de la matriz de forma matricial*/
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
	
	public static void columnaIgual(int [][] matriz) {
		int [] columna = new int [matriz.length];
		int contador = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				columna[i] = matriz[i][j];
				}
			for(int z = 0; z < matriz[j].length; z++) {
				if (columna[z] == columna[0]) contador++; /*Cada vez que encuentra un número igual suma uno al contador*/
				if (contador == matriz.length) System.out.println("Los números de la fila Nº" + (j+1) + " son todos iguales"); 
				/*Si el contador iguala a la cantidad de números en fila entrara al ser todos iguales (*/
				}
			contador = 0;
		}
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

}
