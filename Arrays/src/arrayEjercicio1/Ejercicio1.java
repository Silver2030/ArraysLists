package arrayEjercicio1;

import java.util.Arrays;

public class Ejercicio1 {
	
	private int[] n = {5, 4, 3, 7 , 9 ,12, 34, 56};

	public Ejercicio1() {
		super();
	}

	public Ejercicio1(int[] n) {
		super();
		this.n = n;
	}
	
	public int par(){
		int par = 0;
		for(int i = 0; i < this.n.length; i++) {
			if ( i % 2 == 0) par += this.n[i];
		}
		return par;
	}
	
	public int impar(){
		int impar = 0;
		for(int i = 0; i < this.n.length; i++) {
			if ( i % 2 != 0) impar += this.n[i];
		}
		return impar;
	}

	public int[] getN() {
		return n;
	}

	public void setN(int[] n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "Ejercicio1 [n=" + Arrays.toString(n) + "]";
	} 
	
	

}
