package arrayEjercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[] n = new int [20];
		
		for(int i = 0; i < n.length; i++) {
			n[i] = generaNumeroAleatorio();
		}
		System.out.println();
		for(int i = 0; i < n.length; i++) {
			System.out.println("El valor que se encuentre en la posicion " + i + " es " + n[i] );
		}

	}
	
	public static int generaNumeroAleatorio(){
		int num=(int)Math.floor(Math.random()*(100-0+1)+(0));
		return num;
	}

}
