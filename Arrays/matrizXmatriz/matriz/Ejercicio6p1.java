package matriz;

import java.util.Scanner;

public class Ejercicio6p1 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		
		cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		mostrarMatriz(matriz); /*Muestra los datos dentro de la matriz de forma matricial*/
	}
	
	public static int[][] cargarMatriz(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		int valor = 1, fila = 0, columna = 0;
			for(int i = 0; i < (matriz[0].length*matriz.length); i++) {
				System.out.println("Elige que a que coordenada quieres dar el valor " + valor);
				System.out.print("Introduce la fila deseada (0-2): ");
				fila = in.nextInt();
				System.out.print("Introduce la columna deseada (0-2): ");
				columna = in.nextInt();
					while(matriz[fila][columna] != 0) {
						System.out.println("Posicion no valida (ya fue elegida previamente)");
						System.out.print("Introduce la fila deseada (0-2): ");
						fila = in.nextInt();
						System.out.print("Introduce la columna deseada (0-2): ");
						columna = in.nextInt();
					}
				matriz[fila][columna] = valor;
				valor++;
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
				if(i == matriz[j].length) System.out.println();
			}
		}
	}

}
