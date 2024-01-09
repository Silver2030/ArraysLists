package arrayEjercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] num = new int [15];
		int pos;
		for(int i = 0; i < num.length; i++) {
			num[i] = random();
		}
		
		mostrar(num);
		
		System.out.println();
		System.out.print("Introduce el nº de la posición del valor que quieras borrar: ");
		pos = in.nextInt();
		
		for(int i = pos; i < num.length-1; i++) {
			num[i] = num[i+1];
			if (14 == i) num[i] = 0;
		}
		System.out.println();
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Posicion nº " + i + " valor: " + num[i]);
		}
		
	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(100-1+1)+(1));
		return v;
	}
	
	public static void mostrar(int [] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.println("Posicion nº " + i + " valor: " + num[i]);
		}
	}

}
