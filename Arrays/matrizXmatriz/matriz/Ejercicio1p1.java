package matriz;

import java.util.Scanner;

public class Ejercicio1p1 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][4];
		
		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		
		
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

}
