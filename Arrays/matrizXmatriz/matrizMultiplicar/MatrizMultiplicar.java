package matrizMultiplicar;

import java.util.Scanner;

public class MatrizMultiplicar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] matriz1 = {};
		int [][] matriz2 = {};
		int [][] matriz3 = {};
		int columMat1, filasMat1, columMat2, filasMat2;
		
		System.out.print("Introduce el número de columnas de la matriz nº1: ");
		columMat1 = in.nextInt();
		System.out.print("Introduce el número de filas de la matriz nº1: ");
		filasMat1 = in.nextInt();
		matriz1 = new int [filasMat1][columMat1];
		
		System.out.println();
		
		System.out.print("Introduce el número de columnas de la matriz nº2: ");
		columMat2 = in.nextInt();
		System.out.print("Introduce el número de filas de la matriz nº2: ");
		filasMat2 = in.nextInt();
		matriz2 = new int [filasMat2][columMat2];
		
		matriz3 = new int [filasMat1][columMat2];
		
		System.out.println();
		
		if(columMat1 != filasMat2) System.out.print("Dimensiones introducidas invalidas para realizar un producto, vuelva a intentarlo.");
		else {
			
			System.out.println("Matriz Nº1) " + filasMat1 + "*" + columMat1 + "\n");
			matriz1 = datosMatriz(matriz1); /*Metodo con el que se ingresan los datos de la primera matriz*/
			System.out.println();
			mostrarMatriz(matriz1); /*Metodo que muestra la primera matriz*/
			System.out.println();
			
			System.out.println("Matriz Nº2) " + filasMat2 + "*" + columMat2 + "\n");
			matriz2 = datosMatriz(matriz2); /*Metodo con el que se ingresan los datos de la segunda matriz*/
			System.out.println();
			mostrarMatriz(matriz2); /*Metodo que muestra la segunda matriz*/
			System.out.println();
			multiplicacionMatrices(matriz1, matriz2, matriz3); /*Metodo genera datos de la matriz3 multiplicando la 1 y la 2*/
			System.out.println("Resultado multiplicacion matriz1 * matriz2 \n");
			mostrarMatriz(matriz3); /*Metodo que muestra la tercera matriz*/
		}
	
	}
	
	public static int[][] datosMatriz(int [][] matriz) {
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				System.out.print("Introduce el valor de la fila nº" + (j+1) + " y columna nº" + (i+1) + ": ");
				matriz[j][i] = in.nextInt(); /*Doble for que recorre todos los valores del array 2d para darle valor a cada posición*/
			}
		}
		return matriz;
	}
	
	public static void mostrarMatriz(int [][] matriz) {
		int contador = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(contador == 0) System.out.print("(");
				contador++;
				System.out.print(matriz[j][i]);
				if(matriz[j].length == contador) {
					System.out.print(") \n"); 
					contador = 0;
				}
				else System.out.print(" ");
			}
		}
	}
	
	public static void multiplicacionMatrices(int [][] matriz1, int [][] matriz2, int[][] matriz3) {
		int resultados = 0, contador = 0;
		for(int x = 0; x < matriz3[0].length; x++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				for(int i = 0; i < matriz2.length; i++) {
					resultados += matriz1[contador][i] * matriz2[i][j];
				}
				matriz3[x][j] = resultados;
				resultados = 0;
			}
			contador++;
		}
		
	}
	
	
}

