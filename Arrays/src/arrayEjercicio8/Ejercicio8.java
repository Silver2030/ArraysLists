package arrayEjercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] num = new int [15];
		int pos = 0, cantidad = 0, veces = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = random();
		}
		
		mostrar(num);
		
		while(pos != 99) {
			
			System.out.println();
			System.out.	print("Introduce el nº de la posición del valor que quieras borrar (99 finalizar programa): ");
			pos = in.nextInt();
			while((pos < 0)&&(pos > num.length-1)){
				System.out.println();
				System.out.print("Nº introducido invalido, introduce el nº de la posición del valor que quieras borrar: ");
				pos = in.nextInt();
			}
			cantidad++;
			veces = num.length - cantidad;
			
			for(int i = pos; i < veces; i++) {
				num[i] = num[i+1];
			}
			System.out.println();
			
			for(int i = 0; i < veces; i++) {
				System.out.println("Posicion nº " + i + " valor: " + num[i]);
			}
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
