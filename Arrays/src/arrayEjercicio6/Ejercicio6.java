package arrayEjercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		int [] resul = new int [10];
		for(int i = 0; i < resul.length; i++) {
			resul[i] = moneda();
		}
		System.out.println("Salio cara un total de " + cara(resul) + " veces");
		System.out.println("Salio cruz un total de " + cruz(resul) + " veces");
	}
	
	public static int moneda() {
		int v=(int)Math.floor(Math.random()*(1-0+1)+(0));
		return v;
	}
	
	public static int cara(int [] num) {
		int cara = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 1) cara++;
		}
		return cara;
	}
	
	public static int cruz(int [] num) {
		int cruz = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 0) cruz++;
		}
		return cruz;
	}

}
