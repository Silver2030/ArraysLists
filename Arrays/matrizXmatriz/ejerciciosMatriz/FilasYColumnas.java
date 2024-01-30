package ejerciciosMatriz;

public class FilasYColumnas {
	
	public static void main(String[] args) {
		int [][] matriz1 = new int [3][2];
		matriz1[0][0] = 100;
		matriz1[0][1] = 200;
		matriz1[1][0] = 300;
		matriz1[1][1] = 400;
		matriz1[2][0] = 500;
		matriz1[2][1] = 600;
		
		for(int j = 0; j < matriz1.length; j++) {
			for(int i = 0; i < matriz1[j].length; i++) {
				System.out.print("La matriz [" + j + "]" + "[" + i + "] vale " + matriz1[j][i] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("La matriz tiene un total de " + matriz1.length + " filas y un total de " + matriz1[0].length + " columnas");
	}

}
