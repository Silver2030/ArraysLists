package arrayEjercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] n = {5, 4, 3, 7 , 9 ,12, 34, 56, 103, 842};
		
		mostrar(n, pedirpos());
		
	}
	
	public static int pedirpos() {
		Scanner in = new Scanner(System.in);
		int v = 0;
		System.out.print("Introduce la posición que deseas visualizar: ");
		v = in.nextInt();
		return v;
	}
	
	public static void mostrar(int [] z, int x) {
		System.out.print("El valor en la posicion " + x + " es el numº " + z[x]);
	}
}
