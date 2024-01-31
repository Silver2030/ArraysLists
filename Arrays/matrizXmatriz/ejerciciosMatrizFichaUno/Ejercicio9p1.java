package ejerciciosMatrizFichaUno;

public class Ejercicio9p1 {

	public static void main(String[] args) {
		int [][] matriz = new int [10][10];

		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		mostrarMatriz(matriz); /*Muestra los datos dentro de la matriz de forma matricial*/
	}
	
	public static int[][] cargarMatriz(int[][] matriz) {
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(j == i) matriz[j][i] = 1; /*Da valor de 1 en caso de que tanto la columna como fila sean el mismo número*/
				else matriz[j][i] = 0; /*De no cumplirse lo de arriba le dara un valor de 0*/
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
