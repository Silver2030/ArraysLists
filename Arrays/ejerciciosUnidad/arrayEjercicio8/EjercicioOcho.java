package arrayEjercicio8;

public class EjercicioOcho {

	public static void main(String[] args) {
		int[] n = new int [20];
		double[] cuadrado = new double [20];
		double[] cubo = new double [20];

		for(int i = 0; i < n.length; i++) {
			n[i] = random();
			cuadrado[i] = Math.pow(n[i], 2);
			cubo[i] = Math.pow(n[i], 3);
			System.out.println("El n�mero es " + n[i] + " el cuadrado de este n�mero es " + cuadrado[i] + " y el cubo es " + cubo[i]);
		}

	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(100-0+1)+(0));
		return v;
	}

}
