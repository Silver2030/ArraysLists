package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer digito = 0;
		
		for(int i = 0; i < 20; i++) {
			numeros.add(random(0, 20));
		}
		
		System.out.println(numeros);
		System.out.println();
		System.out.println("Borrando inferiores a 10...");
		System.out.println();
		
		Iterator <Integer> num = numeros.iterator();
		while(num.hasNext()) {
			digito = num.next();
			if(digito < 10) {
				num.remove();
			}
		}
		
		System.out.println(numeros);

	}
	
	public static int random(int max, int min) {
		int v=(int)Math.floor(Math.random()*(max-min+1)+(min));
		return v;
	}
}
