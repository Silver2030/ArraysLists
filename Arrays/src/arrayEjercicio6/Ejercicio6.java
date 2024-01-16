package arrayEjercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		Boolean [] resul = new Boolean [20];
		int trueCount = 0, falseCount = 0;
		for(int i = 0; i < resul.length; i++) {
			resul[i] = caraCruz(moneda());
		}
		for (int i = 0; i < resul.length; i++) {
		    if (resul[i] == true) trueCount++;
		    else falseCount++;
		}
		System.out.println("Salio cara un total de " + trueCount + " veces");
		System.out.println("Salio cruz un total de " + falseCount + " veces");
	}
	
	public static int moneda() {
		int v=(int)Math.floor(Math.random()*(1-0+1)+(0));
		return v;
	}
	
	public static boolean caraCruz(int num) {
		if (num == 1) return true;
		return false;
	}

}
