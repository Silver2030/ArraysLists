package arrayEjercicio10;

public class EjerciciDiez {

	public static void main(String[] args) {
		int[] n = new int [100];
		int mayor = -1, menor = 501, posmayor = 0, posmenor = 0;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = random();
		}
		
		for(int i = 0; i < n.length; i++) {
			if (n[i] > mayor) {
				mayor = n[i]; 
				posmayor = i;
			}
			if (n[i] < menor) {
				menor = n[i];
				posmenor = i;
			}
		}
		
		for(int i = 0; i < n.length; i++) {
			if ((posmayor == i)|(posmenor == i)) System.out.println("Nº " + i + ") **" + n[i] + "**");
			else System.out.println("Nº " + i + ") " + n[i]);
		}

	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(500-0+1)+(0));
		return v;
	}

}
