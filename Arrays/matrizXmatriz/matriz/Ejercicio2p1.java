package matriz;

import java.util.Scanner;

public class Ejercicio2p1 {
	
	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		
		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		filaIgual(matriz);
		System.out.println();
		mostrarMatriz(matriz); /*Muestra los datos dentro de la matriz de forma matricial*/
	}
	
	public static int[][] cargarMatriz(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				System.out.print("Introduce el valor de la fila n�" + (j+1) + " y columna n�" + (i+1) + ": ");
				matriz[j][i] = in.nextInt();
				}
			}
		return matriz;
	}
	
	public static void filaIgual(int [][] matriz) {
		int [] filas = new int [matriz.length];
		int contador = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				filas[i] = matriz[j][i];
				}
			for(int z = 0; z < matriz[j].length; z++) {
				if (filas[z] == filas[0]) contador++; /*Cada vez que encuentra un n�mero igual suma uno al contador*/
				if (contador == matriz.length) System.out.println("Los n�meros de la fila N�" + (j+1) + " son todos iguales"); 
				/*Si el contador iguala a la cantidad de n�meros en fila entrara al ser todos iguales (*/
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
			}
		}
	}

}
