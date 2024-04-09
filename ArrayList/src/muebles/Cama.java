package muebles;

import java.util.Scanner;

public class Cama extends Mueble {
	public String tamanio;
	
	public Cama() {
		super();
	}
	
	public Cama(String idProducto, Double precio, Integer stock, String tamanio) {
		super(idProducto, precio, stock);
		this.tamanio = tamanio;
	}
	
	public Cama(String idProducto, String material, Double precio, Integer stock, String tamanio) {
		super(idProducto, material, precio, stock);
		this.tamanio = tamanio;
	}
	
	public Cama pedirDatos(String idProducto) {
		Scanner in = new Scanner(System.in);
		Cama camaNueva = new Cama();
		
		camaNueva.setIdProducto(idProducto);
		System.out.print("Material de la cama: ");
		camaNueva.setMaterial(in.nextLine());
		System.out.println();
		System.out.print("Precio de la cama: ");
		camaNueva.setPrecio(in.nextDouble());
		System.out.println();
		System.out.print("Stock de la cama: ");
		camaNueva.setStock(in.nextInt());
		System.out.println();
		System.out.print("Tamaño de la cama (Matrimonio/Individual): ");
		camaNueva.setTamanio(in.nextLine());
		while((!camaNueva.getTamanio().equalsIgnoreCase("Matrimonio"))&&(!camaNueva.getTamanio().equalsIgnoreCase("Matrimonio"))) {
			System.out.print("Tamaño de la cama (Matrimonio/Individual): ");
			camaNueva.setTamanio(in.nextLine());
		}
		System.out.println();
		
		return camaNueva;
	}
	
	public int precioExtra() {
		int coste = 0;
		
		if(this.tamanio.equalsIgnoreCase("Matrimonio")) coste = 100;
		else coste = 50;
		
		return coste;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Tamaño: " + this.tamanio; 
	}


}
