package productos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import tienda.Articulo;
import tienda.Libro;

public class ListaProductos {
	ArrayList <Productos> listaProductos = new ArrayList <Productos>();

	public ListaProductos() {
		super();
	}

	public ListaProductos(ArrayList<Productos> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}
	
	public void cargarDatos() {
		this.listaProductos.add(new NoPerecedero("LataAtun","LT",2.34,"Latas"));
		this.listaProductos.add(new NoPerecedero ("Sopa Vegetal","SP",1.24,"Sobres") );
		this.listaProductos.add(new NoPerecedero ("PastaII","PT",4.34,"Embasado"));
		this.listaProductos.add(new Perecedero("Lubina","LB",16.34,2));
		this.listaProductos.add(new Perecedero("Tomates","TA",11.44,3));
		this.listaProductos.add(new Perecedero("Naranjas","NJ",6.34,1));
		this.listaProductos.add(new Perecedero("Tomates","TM",3.55,4));
	}

	public void agregarProducto(String codigoBuscar) {
		boolean encontrado = buscarCodigo(codigoBuscar);
		String producto;
		
		if(encontrado == false) {
			producto = elegirProducto();
			
			if(producto.equalsIgnoreCase("Perecedero")) {
				Perecedero perece = new Perecedero();
				this.listaProductos.add(perece.pedirDatosPerecedero());
				System.out.println("Producto Perecedero añadido.");
				System.out.println();
			}else {
				NoPerecedero noPerece = new NoPerecedero();
				this.listaProductos.add(noPerece.pedirDatosNoPerecedero());
				System.out.println("Producto NoPerecedero añadido.");
				System.out.println();
			}
		}
	}
	
	public boolean buscarCodigo(String codigoBuscar) {
		boolean encontrado = false;
		
		for(Productos prod : this.listaProductos) {
			if(prod.getCodigo().equalsIgnoreCase(codigoBuscar)) {
				System.out.println("Producto repetido, vuelva a intentarlo con otro.");
				System.out.println();
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	public String elegirProducto() {
		Scanner in = new Scanner(System.in);
		String producto;
		
		System.out.println("Introduce el tipo de producto (Perecedero o NoPerecedero)");
		producto = in.nextLine();
		while((!producto.equalsIgnoreCase("Perecedero"))|(!producto.equalsIgnoreCase("NoPerecedero"))) {
			System.out.println("Error, Introduce el tipo de producto (Perecedero o NoPerecedero)");
			producto = in.nextLine();
		}
		
		return producto;
	}
	
	public void mostrarProductos() {
		double importe;
		double[] importes = new double[2];
		
		for(Productos prod : this.listaProductos) {
			if(prod instanceof NoPerecedero) {
				importe = ((NoPerecedero) prod).calcular(0);
				System.out.println(prod.toString() + "Importe: " + importe);
				System.out.println();
			}else {
				importes = ((Perecedero) prod).calcular(0);
				System.out.println(prod.toString() + "Importe: " + importes[0] + "\n "
								+ "Importe con Descuento: " + importes[1]);
				System.out.println();
			}
		}
	}
	
	public void borrarInterfaz(String codigoBuscar) {
		boolean encontrado = borrarBuscar(codigoBuscar);
		
		if(encontrado == false) {
			System.out.println("Codigo introducido erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}else {
			System.out.println("Borrado realizado.");
			System.out.println();
		}
	}
	
	public boolean borrarBuscar(String codigoBuscar) {
		boolean encontrado = false;
		Productos prod;
		Iterator <Productos> itProd = this.listaProductos.iterator();
		while(itProd.hasNext()) {
			prod = itProd.next();
			if(prod.getCodigo().equalsIgnoreCase(codigoBuscar)) {
				itProd.remove();
				encontrado = true;
			}
		}
		return encontrado;
	}
	
}
