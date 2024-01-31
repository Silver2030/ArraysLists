package ejerciciosMatrizFichaTeoria;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int [][] matriz = new int [6][10];
		
		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		mostrarMatriz(matriz); /*Muestra los datos dentro de la matriz de forma matricial*/

	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(1000-0+1)+(0));
		return v;
	}
	
	public static int[][] cargarMatriz(int[][] matriz) {
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				matriz[j][i] = random(); /*Da un valor aleatorio entre 0 y 1000 llamando al metodo random (0 y 1000 incluidos)*/
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
					System.out.print(") \n"); /*Marca el final de cada linea con un ) y salta a la siguiente linea*/
					contador = 0;
				}
				else System.out.print(" ");
			}
		}
	}

}
