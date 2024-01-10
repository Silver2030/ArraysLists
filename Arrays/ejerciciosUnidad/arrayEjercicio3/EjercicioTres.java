package arrayEjercicio3;

public class EjercicioTres {

	public static void main(String[] args) {
		int[] n = {5, 4, 3, 7 , 9 ,12, 34, 56};
		int suma = 0;
		
		for(int i = 0; i < n.length; i++) {
			suma += n[i];
		}
		
		System.out.println("La suma de los números es " + suma);
	}

}
