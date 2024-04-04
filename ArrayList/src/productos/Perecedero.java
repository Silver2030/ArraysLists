package productos;

import java.io.Serializable;
import java.util.Scanner;

public class Perecedero extends Productos implements Serializable{
	public int diasCaducar;

	public Perecedero() {
		super();
	}

	public Perecedero(String nombre, String codigo, double precio, int diasCaducar) {
		super(nombre, codigo, precio);
		this.diasCaducar = diasCaducar;
	}
	
	public double[] calcular(int cantidad) {
		double[] importes = new double[2]; 
		
		importes[0] = precio * cantidad;
		
		switch(this.diasCaducar) {
		case 1:
			importes[1] = importes[0] * 0.96;
			break;
		case 2:
			importes[1] = importes[0] * 0.965;
			break;
		case 3:
			importes[1] = importes[0] * 0.97;
			break;
		case 4:
			importes[1] = importes[0] * 0.975;
			break;
		case 5:
			importes[1] = importes[0] * 0.98;
			break;
		}
		
		return importes;
	}
	
	public Perecedero pedirDatosPerecedero(String codigoBuscar) {
		Scanner in = new Scanner(System.in);
		Perecedero perece = new Perecedero();
		
		System.out.print("Nombre: ");
		perece.setNombre(in.nextLine());
		perece.setCodigo(codigoBuscar);
		System.out.print("Precio: ");
		perece.setPrecio(in.nextDouble());
		in.nextLine();
		System.out.print("Dias para Caducar: ");
		perece.setDiasCaducar(in.nextInt());
		
		return perece;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Dias caducar: " + this.diasCaducar;
	}

}
