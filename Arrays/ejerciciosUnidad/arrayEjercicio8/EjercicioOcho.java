package arrayEjercicio8;

public class EjercicioOcho {

	public static void main(String[] args) {
		int[] n = new int [19];
		double[] cuadrado = new double [19];
		double[] cubo = new double [19];

		for(int i = 0; i < n.length; i++) {
			n[i] = random();
		}
		
		for(int i = 0; i < n.length; i++) {
			cuadrado[i] = Math.pow(n[i], 2);
		}
		
		for(int i = 0; i < n.length; i++) {
			cubo[i] = Math.pow(n[i], 3);
		}
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("El número es " + n[i] + " el cuadrado de este número es " + cuadrado[i] + " y el cubo es " + cubo[i]);
		}
	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(100-0+1)+(0));
		return v;
	}

}
