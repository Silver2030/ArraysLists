package arrayEjercicio5;

public class EjercicioCinco {

	public static void main(String[] args) {
		int[] n = {5, 4, 3, 7 , 9 ,12, 34, 56};
		int par = 0, impar = 0;
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] % 2 == 0) par+= n[i];
			else impar+= n[i];
		}
		
		System.out.println("La suma de los números pares es " + par);
		System.out.println("La suma de los números impares es " + impar);
	}

}
