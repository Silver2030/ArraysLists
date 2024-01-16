package arrayEjercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		int [] resul = new int [100];
		for(int i = 0; i < resul.length; i++) {
			resul[dado()]++;
		}
		
		resultados(resul);

	}
	
	public static int dado() {
		int v=(int)Math.floor(Math.random()*(5-0+1)+(0));
		return v;
	}
	
	public static void resultados(int [] num) {
		System.out.println("Salio uno un total de " + num[0] + " veces");
		System.out.println("Salio dos un total de " + num[1] + " veces");
		System.out.println("Salio tres un total de " + num[2] + " veces");
		System.out.println("Salio cuatro un total de " + num[3] + " veces");
		System.out.println("Salio cinco un total de " + num[4] + " veces");
		System.out.println("Salio seis un total de " + num[5] + " veces");
	}
	
}
