package matriz;

public class Ejercicio10p1 {

	public static void main(String[] args) {
		int [][] matriz = new int [5][5];

		matriz = cargarMatriz(matriz); /*Genera los datos dentro de la matriz*/
		System.out.println();
		mostrarMatriz(matriz); /*Muestra los datos dentro de la matriz de forma matricial*/
		System.out.println();
		sumaDiagonalPrincipal(matriz);
		System.out.println();
		sumaDiagonalSecundaria(matriz);
	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(9-0+1)+(0));
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
				if(i == matriz[j].length) System.out.println();
			}
		}
	}
	
	public static void sumaDiagonalPrincipal(int [][] matriz) {
	int sumaDigPrincp = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(i == j) sumaDigPrincp += matriz[j][i]; /*Acumula todas los valores cuya columna y fila compartan el mismo número*/
			}		
		}
		System.out.println("La suma de los valores de la diagonal principal da como resultado " + sumaDigPrincp);
	}
	
	public static void sumaDiagonalSecundaria(int [][] matriz) {
		int sumaDigSecund = 0;
			for(int j = 0; j < matriz.length; j++) {
				for(int i = 0; i < matriz[j].length; i++) {
					if(i + j == (matriz[j].length-1)) sumaDigSecund += matriz[j][i]; /*Acumula todas los valores cuya columna y fila sumada den como resultado el número de columnas
					de la matriz (-1)*/
				}		
			}
			System.out.println("La suma de los valores de la diagonal secundaria da como resultado " + sumaDigSecund);
		}

}
