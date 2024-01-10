package arrayEjercicio10;

public class EjercicioDiez {

	public static void main(String[] args) {
		int[] n = new int [99];
		int mayor = -1, menor = 501;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = random();
		}
		
		for(int i = 0; i < n.length; i++) {
			if (n[i] > mayor) mayor = n[i];
			if (n[i] < menor) menor = n[i];
		}
		
		for(int i = 0; i < n.length; i++) {
			if ((mayor == n[i])|(menor == n[i])) System.out.println("**" + n[i] + "**");
			else System.out.println(n[i]);
		}

	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(500-0+1)+(0));
		return v;
	}

}
