package productos;

import java.io.Serializable;
import java.util.Scanner;

public class NoPerecedero extends Productos implements Serializable{
	public String tipo;

	public NoPerecedero() {
		super();
	}

	public NoPerecedero(String nombre, String codigo, double precio, String tipo) {
		super(nombre, codigo, precio);
		this.tipo = tipo;
	}
	
	public double calcular(int cantidad) {
		double importe; 
		
		importe = precio * cantidad;
		
		return importe;
	}
	
	public NoPerecedero pedirDatosNoPerecedero(String codigoBuscar) {
		Scanner in = new Scanner(System.in);
		NoPerecedero noPerece = new NoPerecedero();
		
		System.out.print("Nombre: ");
		noPerece.setNombre(in.nextLine());
		noPerece.setCodigo(codigoBuscar);
		System.out.print("Precio: ");
		noPerece.setPrecio(in.nextDouble());
		in.nextLine();
		System.out.print("Tipo: ");
		noPerece.setTipo(in.nextLine());
		
		return noPerece;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Tipo: " + this.tipo;
	}
	
}