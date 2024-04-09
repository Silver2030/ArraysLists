package muebles;

import java.util.Scanner;

public class Silla extends Mueble {
	public boolean respaldo;
	public boolean ruedas;
	
	public Silla() {
		super();
	}
	
	public Silla(String idProducto, Double precio, Integer stock, boolean respaldo, boolean ruedas) {
		super(idProducto, precio, stock);
		this.respaldo = respaldo;
		this.ruedas = ruedas;
	}
	
	public Silla(String idProducto, String material, Double precio, Integer stock, boolean respaldo, boolean ruedas) {
		super(idProducto, material, precio, stock);
		this.respaldo = respaldo;
		this.ruedas = ruedas;
	}
	
	public Silla pedirDatos(String idProducto) {
		Scanner in = new Scanner(System.in);
		Silla sillaNueva = new Silla();
		
		sillaNueva.setIdProducto(idProducto);
		System.out.print("Material de la silla: ");
		sillaNueva.setMaterial(in.nextLine());
		System.out.println();
		System.out.print("Precio de la silla: ");
		sillaNueva.setPrecio(in.nextDouble());
		System.out.println();
		System.out.print("Stock de la silla: ");
		sillaNueva.setStock(in.nextInt());
		System.out.println();
		System.out.print("Respaldo de la silla (true/false): ");
		sillaNueva.setRespaldo(in.nextBoolean());
		System.out.println();
		System.out.print("Ruedas de la silla (true/false): ");
		sillaNueva.setRuedas(in.nextBoolean());
		System.out.println();
		
		return sillaNueva;
	}

	public boolean isRespaldo() {
		return respaldo;
	}

	public void setRespaldo(boolean respaldo) {
		this.respaldo = respaldo;
	}

	public boolean isRuedas() {
		return ruedas;
	}

	public void setRuedas(boolean ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Respaldo: " + this.respaldo + "\n" +
				"Ruedas: " + this.ruedas;
	}
	
}
