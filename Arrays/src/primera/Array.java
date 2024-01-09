package primera;

public class Array {

	public static void main(String[] args) {
		int[] n = new int [4];
		int suma = 0;
		n[0] = 26;
		n[1] = -30;
		n[2] = 0;
		n[3] = 100;
		System.out.println("Los valores de larray n son los siguientes: ");
		for(int i = 0; i < n.length; i++) {
			System.out.println("Posición " + i + " tiene un valor de: " + n[i]);
			suma += n[i];
		}
		System.out.println("\nLa suma de todos los elementos del array es de " + suma);

	}

}
