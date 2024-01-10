package arrayEjercicio9;

import java.util.Scanner;

public class EjercicioNueve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int [20];
		char respu;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = random();
		}
		
		System.out.println("A: Multiplos de 2");
		System.out.print("B: Multiplos de 5 \n Que quieres resaltar: ");
		respu = Character.toUpperCase(in.next().charAt(0));
		while ((respu != 'A')&&(respu != 'B')){
			System.out.println("A: Multiplos de 2");
			System.out.print("B: Multiplos de 5 \n Respuesta no valida, que quieres resaltar: ");
			respu = Character.toUpperCase(in.next().charAt(0));
		}
		
		if(respu == 'A') {
			for(int i = 0; i < n.length; i++) {
				if(n[i] % 2 == 0) System.out.println("Nº" + i + ") [" + n[i] + "]");
				else System.out.println("Nº" + i + ") " + n[i]);
			}
		}else {
			for(int i = 0; i < n.length; i++) {
				if(n[i] % 5 == 0) System.out.println("Nº" + i + ") [" + n[i] + "]");
				else System.out.println("Nº" + i + ") " + n[i]);
			}	
		}
		

	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(400-0+1)+(0));
		return v;
	}

}
