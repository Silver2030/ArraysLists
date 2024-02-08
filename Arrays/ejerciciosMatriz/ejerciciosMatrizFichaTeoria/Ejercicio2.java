package ejerciciosMatrizFichaTeoria;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [][] matriz = new int [5][3];

		matriz = cargarMatriz(matriz);
		System.out.println();
		mostrarMatriz(matriz);
		System.out.println();
		notamayor(matriz);
		
	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(10-0+1)+(0));
		return v;
	}

	public static int[][] cargarMatriz(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				matriz[j][i] = random();
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
	
	public static void notamayor(int[][] matriz) {
		int max = -1, min = 11, columnaMax = 0, filaMax = 0, columnaMin = 0, filaMin = 0;
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(matriz[j][i] > max) {
					max = matriz[j][i];
					filaMax = j+1;
					columnaMax = i+1;
				}
				if(matriz[j][i] < min) {
					min = matriz[j][i];
					filaMin = j+1;
					columnaMin = i+1;
				}
			}
		}
		System.out.println("La nota mas alta pertenece a la columna Nº"+ columnaMax + " y fila Nº" + filaMax + " y es " + max);
		System.out.println("La nota mas baja pertenece a la columna Nº"+ columnaMin + " y fila Nº" + filaMin + " y es " + min);
		
	}
}

