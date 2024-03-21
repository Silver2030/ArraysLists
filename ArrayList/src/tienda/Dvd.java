package tienda;

import java.util.Scanner;

public class Dvd extends Articulo{
	public int duracion;
	public String realizador;
	
	public Dvd() {
		super();
	}
	
	public Dvd(int referencia, String nombre, double precio, int duracion, String realizador) {
		super(referencia, nombre, precio);
		this.duracion = duracion;
		this.realizador = realizador;
		
	}
	
	public Dvd pedirDatosDvd(int referencia) {
		Scanner in = new Scanner(System.in);
		Dvd dvd = new Dvd();
		
		dvd.setReferencia(referencia);
		System.out.print("Nombre: ");
		dvd.setNombre(in.nextLine());
		System.out.print("Precio: ");
		dvd.setPrecio(in.nextInt());
		System.out.print("Duracion: ");
		dvd.setDuracion(in.nextInt());
		in.nextLine();
		System.out.print("Realizador: ");
		dvd.setRealizador(in.nextLine());
		System.out.println();
		
		return dvd;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getRealizador() {
		return realizador;
	}

	public void setRealizador(String realizador) {
		this.realizador = realizador;
	}

	@Override
	public String toString() {
		return 	"DvD\n" +
				super.toString() + "\n" +
				"Duracion: " + this.duracion + "\n" +
				"Realizador: " + this.realizador + "\n";
	}
	
}