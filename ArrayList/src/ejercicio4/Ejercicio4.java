package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		
		for(int i = 0; i < random(20, 5); i++) {
			temperaturas.add(random(40, -30));
		}
		
		System.out.println(temperaturas);
		System.out.println();
		System.out.println("La temperatura máxima es de " + Collections.max(temperaturas));
		System.out.println();
		System.out.println("La temperatura mínima es de " + Collections.min(temperaturas));
	}
	
	public static int random(int max, int min) {
		int v=(int)Math.floor(Math.random()*(max-min+1)+(min));
		return v;
	}
}
