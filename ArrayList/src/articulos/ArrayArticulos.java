package articulos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayArticulos {
	
	private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();

	public ArrayArticulos() {
		super();
	}
	
	public void cargarDatos() {
		Articulo articulo1 = new Articulo("222","Libro", 30.5, 40.0 ,50);
		Articulo articulo2 = new Articulo("555","Revista", 5.5, 7.5 ,10);
		Articulo articulo3 = new Articulo("111","Boligrafo", 15.5, 17.5 ,60);
		Articulo articulo4 = new Articulo("666","Lapiz", 1.5, 2.5 ,50);
		Articulo articulo5 = new Articulo("333","Libreta", 11.5, 12.5 ,40);

		this.listaArticulos.add(articulo1);
		this.listaArticulos.add(articulo2);
		this.listaArticulos.add(articulo3);
		this.listaArticulos.add(articulo4);
		this.listaArticulos.add(articulo5);
	}
	
	public void visualizarDatos() {
		String[] codigosDescuento = {"111", "333", "555", "777", "999"};
		Double aux = 0.0;
		for (Articulo articulo : this.listaArticulos) {
			aux = articulo.getPrecioDeVenta();
			for(int i = 0; i < codigosDescuento.length; i++) {
				if(articulo.getCodigo().equals(codigosDescuento[i])) {
					articulo.setPrecioDeVenta(articulo.getPrecioDeVenta() * 0.9);
				}
			}
			System.out.println(articulo.toString());
			System.out.println();
			articulo.setPrecioDeVenta(aux);
		}
	}
	
	public String pedirCodigo() {
		Scanner in = new Scanner(System.in);
		String codigoBuscar;
		
		System.out.print("Introduce el codigo del articulo: ");
		codigoBuscar = in.nextLine();
		System.out.println();
		
		return codigoBuscar;
	}
	
	public void agregarArticulo(String codigoNuevo) {
		boolean encontrado = buscarCodigo(codigoNuevo);
		
		if(encontrado == true) {
			System.out.println("El codigo introducido ya se encuentra registrado.");
			System.out.println();
		}else {
			Articulo articulo = pedirDatos(codigoNuevo);
			this.listaArticulos.add(articulo);
			System.out.println("Articulo añadido.");
			System.out.println();
		}
	}
	
	public Articulo pedirDatos(String codigo) {
		Scanner in = new Scanner(System.in);
		Articulo articulo = new Articulo();
		
		articulo.setCodigo(codigo);
		System.out.print("Nombre Articulo: ");
		articulo.setDescripcion(in.nextLine());
		System.out.print("Precio de Compra: ");
		articulo.setPrecioDeCompra(in.nextDouble());
		System.out.print("Precio de Venta: ");
		articulo.setPrecioDeVenta(in.nextDouble());
		System.out.print("Stock: ");
		articulo.setStock(in.nextInt());
		System.out.println();
		
		return articulo;
	}
	
	public boolean buscarCodigo(String codigoBuscar) {
		boolean encontrado = false;
		
		for (Articulo articulo : this.listaArticulos) {
			if(articulo.getCodigo().equals(codigoBuscar)) encontrado = true;
		}
		
		return encontrado;
	}
	
	public void borrarArticulo(String codigo) {
		boolean encontrado = buscarCodigo(codigo);
		
		if(encontrado == false) {
			System.out.println("El codigo introducido no se encuentra registrado.");
			System.out.println();
		}else {
			codigoBorrar(codigo);
			System.out.println("Articulo borrado.");
			System.out.println();
		}
	}
		
	public boolean codigoBorrar(String codigoBuscar) {
		boolean encontrado = false;
		Articulo articulo = new Articulo();
		
		Iterator <Articulo> it = this.listaArticulos.iterator();
		while(it.hasNext()) {
			articulo = it.next();
			if(articulo.getCodigo().equals(codigoBuscar)) {
				encontrado = true;
				it.remove();
			}
		}
			
		return encontrado;
	}
	
	public void modificarInterfaz(String codigo) {
		boolean encontrado = modificarBuscar(codigo);
		
		if(encontrado == false) {
			System.out.println("Codigo introducido erroneo.");
			System.out.println();
		}else {
			System.out.println("Modificacion realizada.");
			System.out.println();
		}
	}
	
	public boolean modificarBuscar(String codigoBuscar) {
		boolean encontrado = false;
		
		for(Articulo articulo : this.listaArticulos) {
			if(articulo.getCodigo().equals(codigoBuscar)) {
				encontrado = true;
				Articulo nuevosDatos = pedirDatos(codigoBuscar);
				articulo.setDescripcion(nuevosDatos.getDescripcion());
				articulo.setPrecioDeCompra(nuevosDatos.getPrecioDeCompra());
				articulo.setPrecioDeVenta(nuevosDatos.getPrecioDeVenta());
				articulo.setStock(nuevosDatos.getStock());
			}
		}
		
		return encontrado;
	}
	
	public void aumentarStockInterfaz(String codigo) {
		boolean encontrado = aumentarStockBuscar(codigo);
		
		if(encontrado == false) {
			System.out.println("Codigo introducido erroneo.");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("Stock actualizado.");
			System.out.println();
		}
	}
	
	public boolean aumentarStockBuscar(String codigoBuscar) {
		boolean encontrado = false;
		int stockSumar = 0;
		
		for(Articulo articulo : this.listaArticulos) {
			if(articulo.getCodigo().equals(codigoBuscar)) {
				encontrado = true;
				stockSumar = modificarStock();
				articulo.setStock(articulo.getStock() + stockSumar);
			}
		}
		
		return encontrado;
	}
	
	public void ventaStockInterfaz(String codigo) {
		boolean encontrado = ventaStockBuscar(codigo);
		
		if(encontrado == false) {
			System.out.println("Codigo introducido erroneo/stock insuficiente.");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("Stock actualizado.");
			System.out.println();
		}
	}
	
	public boolean ventaStockBuscar(String codigoBuscar) {
		boolean encontrado = false;
		int stockRestar = 0;
		
		for(Articulo articulo : this.listaArticulos) {
			if(articulo.getCodigo().equals(codigoBuscar)) {
				encontrado = true;
				stockRestar = modificarStock();
				if(articulo.getStock() < stockRestar) encontrado = false;
				else articulo.setStock(articulo.getStock() - stockRestar);
			}
		}
		
		return encontrado;
	}
	
	public int modificarStock() {
		Scanner in = new Scanner(System.in);
		int stock = 0;
		
		System.out.print("Introduce entrada/salida de mercancia: ");
		stock = in.nextInt();
		while(stock < 0) {
			System.out.println();
			System.out.print("Cantidad introducida erronea, introduce entrada de mercancia: ");
			stock = in.nextInt();
		}
		
		return stock;
	}

	public ArrayArticulos(ArrayList<Articulo> listaArticulos) {
		super();
		this.listaArticulos = listaArticulos;
	}

	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
	
}