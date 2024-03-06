package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> notas = new ArrayList<Integer>();
		Integer contador = 0, media = 0;
		
		for(int i = 0; i < random(20, 5); i++) {
			notas.add(random(1, 10));
		}
		
		System.out.println(notas);
		System.out.println();
		
		for(Integer nota : notas) {
			media += nota;
			contador++;
		}
		
		media /= contador;
		System.out.println("Hay un total de " + contador + " notas y la nota media es de " + media);

	}
	
	public static int random(int max, int min) {
		int v=(int)Math.floor(Math.random()*(max-min+1)+(min));
		return v;
	}
}
