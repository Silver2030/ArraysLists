package matriz;

import java.util.Scanner;

public class MatrizNueva {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] matriz1 = {};
		int [][] matriz2 = {};
		int [][] matriz3 = {};
		int columMat1, filasMat1, columMat2, filasMat2;
		
		System.out.print("Introduce el n�mero de columnas de la matriz n�1: ");
		columMat1 = in.nextInt();
		System.out.print("Introduce el n�mero de filas de la matriz n�1: ");
		filasMat1 = in.nextInt();
		matriz1 = new int [filasMat1][columMat1];
		
		System.out.println();
		
		System.out.print("Introduce el n�mero de columnas de la matriz n�2: ");
		columMat2 = in.nextInt();
		System.out.print("Introduce el n�mero de filas de la matriz n�2: ");
		filasMat2 = in.nextInt();
		matriz2 = new int [filasMat2][columMat2];
		
		matriz3 = new int [filasMat1][columMat2];
		
		System.out.println();
		
		if(columMat1 != filasMat2) System.out.print("Dimensiones introducidas invalidas para realizar un producto, vuelva a intentarlo.");
		else {
			
			System.out.println("Matriz N�1) " + filasMat1 + "*" + columMat1);
			matriz1 = datosMatriz(matriz1, columMat1, filasMat1); /*Metodo con el que se ingresan los datos de la primera matriz*/
			System.out.println();
			mostrarMatriz(matriz1, columMat1, filasMat1); /*Metodo que muestra la primera matriz*/
			System.out.println();
			
			System.out.println("Matriz N�2) " + filasMat2 + "*" + columMat2);
			matriz2 = datosMatriz(matriz2, columMat2, filasMat2); /*Metodo con el que se ingresan los datos de la segunda matriz*/
			System.out.println();
			mostrarMatriz(matriz2, columMat2, filasMat2); /*Metodo que muestra la segunda matriz*/
			System.out.println();
			
			mostrarMatrices(matriz1, matriz2, columMat1, filasMat1, columMat2, filasMat2); 
			/*Metodo que muestra ambas matrices una al lado de la otra*/
			System.out.println();
			
			multiplicacionMatrices(matriz1, matriz2, matriz3, columMat1, filasMat1, columMat2, filasMat2); 
			
			mostrarMatriz(matriz3, columMat2, filasMat1);
			
		}
	
	}
	
	public static int[][] datosMatriz(int [][] matriz, int columnasMatriz, int filasMatriz) {
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < filasMatriz; j++) {
			for(int i = 0; i < columnasMatriz; i++) {
				System.out.print("Introduce el valor de la fila n�" + (j+1) + " y columna n�" + (i+1) + ": ");
				matriz[j][i] = in.nextInt();
			}
		}
		return matriz;
	}
	
	public static void mostrarMatriz(int [][] matriz, int columnasMatriz, int filasMatriz) {
		int contador = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(contador == 0) System.out.print("(");
				contador++;
				System.out.print(matriz[j][i]);
				if(columnasMatriz == contador) {
					System.out.print(") \n"); 
					contador = 0;
				}
				else System.out.print(" ");
				if(i == matriz.length) System.out.println();
			}
		}
	}
	
	public static void mostrarMatrices(int [][] matriz1, int [][] matriz2, int columnasMatriz1, int filasMatriz1, int columnasMatriz2, int filasMatriz2) {
		int contador1 = 0, contador2 = 0;
		for(int z = 0; z < matriz1.length; z++) {
			for(int i = 0; i < matriz1[z].length; i++) {
			if(contador1 == 0) System.out.print("(");
			contador1++;
			System.out.print(matriz1[z][i]);
			if(columnasMatriz1 == contador1) { /*Si llega al limite de la columna1 comienza imprimir la misma fila del array2*/
				System.out.print(")   "); 
				contador1 = 0; 
				for(int x = 0; x < columnasMatriz2; x++) {
					for(int j = 0; j < columnasMatriz2; j++) {
						if(j == 0) System.out.print("(");
						System.out.print(matriz2[j+contador2]);
						if(columnasMatriz2-1 == j) {
							System.out.print(") \n"); /*Primera fila de ambas matrices mostrada, procede a saltar de fila y vuelve a la primera matriz*/
							contador2 = j + contador2 + 1; /*Mantiene valores para cuando reingrese en el for no muestre valores repetidos*/
						}
						else System.out.print(" ");
					}
				}
			}
			else System.out.print(" ");
			if(i == matriz1.length) System.out.println();
			}
		}
	}
	
	public static int[] multiplicacionMatrices(int [] matriz1, int [] matriz2, int[] matriz3, int columnasMatriz1, int filasMatriz1, 
			int columnasMatriz2, int filasMatriz2) {
		int resultado = 0, contador1 = 0, contador2 = 0, contador3 = 1, contador4 = 1;
		boolean entrar1 = true, entrar2 = true;
		for(int i = 0; i < matriz3.length; i++) {
			if(contador3 == columnasMatriz2*filasMatriz2) {
				contador1 = 0;
				i = 2;
				entrar1 = false;
			}
			
			resultado += matriz1[i] * matriz2[contador1];
			
			contador1 += columnasMatriz2;
			if(contador2 == matriz3.length) entrar2 = false;
			if((i == columnasMatriz1-1)&&(entrar1 == true)) {
				matriz3[contador2] = resultado;
				resultado = 0;
				i = -1;
				contador2++;
				contador1 = contador2;
			}
			if((i == matriz1.length)&&(entrar2 == true)) {
				matriz3[contador2] = resultado;
				resultado = 0;
				i = columnasMatriz1;
				contador1+= 1;
				contador2++;
			}
			if(contador1 > matriz2.length-1) {
				contador1 = contador4;
				contador4++;
			}
			contador3++;
		}
		
		return matriz3;
	}
	
}
