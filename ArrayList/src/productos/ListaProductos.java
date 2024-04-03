package productos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
				this.listaProductos.add(perece.pedirDatosPerecedero(codigoBuscar));
				System.out.println("Producto Perecedero añadido.");
				System.out.println();
			}else {
				NoPerecedero noPerece = new NoPerecedero();
				this.listaProductos.add(noPerece.pedirDatosNoPerecedero(codigoBuscar));
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
		
		System.out.print("Introduce el tipo de producto (Perecedero o NoPerecedero): ");
		producto = in.nextLine();
		while((!producto.equalsIgnoreCase("Perecedero"))&(!producto.equalsIgnoreCase("NoPerecedero"))) {
			System.out.print("Error, Introduce el tipo de producto (Perecedero o NoPerecedero): ");
			producto = in.nextLine();
		}
		
		return producto;
	}
	
	public void factura(String codigoBuscar, int cantidadCompra) {
		DecimalFormat df = new DecimalFormat("#.00");
		double importe;
		double[] importes = new double[2];
		boolean encontrado = false;
		
		for(Productos prod : this.listaProductos) {
			if(prod.codigo.equalsIgnoreCase(codigoBuscar)) {
				encontrado = true;
				if(prod instanceof NoPerecedero) {
					importe = ((NoPerecedero) prod).calcular(cantidadCompra);
					System.out.println(prod.toString() + "Importe: " + df.format(importe));
					System.out.println();
				}else {
					importes = ((Perecedero) prod).calcular(cantidadCompra);
					System.out.println(prod.toString() + "Importe: " + df.format(importes[0]) + "\n "
									+ "Importe con Descuento: " + df.format(importes[1]));
					System.out.println();
				}
			}
		}
		if(encontrado == false) {
			System.out.println("Producto no encontrado.");
			System.out.println();
		}
	}
	
	public void mostrarProductos() {
		for(Productos prod : this.listaProductos) {
				if(prod instanceof NoPerecedero) {
					System.out.println(prod.toString());
					System.out.println();
				}else {
					System.out.println(prod.toString());
					System.out.println();
				}
		}
		System.out.println();
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
	
	public void guardarFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
		FileWriter archivo = new FileWriter("C:\\Users\\ivanrq\\desktop\\Productos.txt");
			try(BufferedWriter tienda = new BufferedWriter(archivo)) {
				for(Productos prod : this.listaProductos) {
					if(prod instanceof NoPerecedero) {
						archivo.write("NoPerecedero " + prod.getNombre() + " " + prod.getCodigo() + " " + ((NoPerecedero) prod).getTipo() + " " + prod.getPrecio()+ "\n");
					}else {
						archivo.write("Perecedero " + prod.getNombre() + " " + prod.getCodigo() + " " + ((Perecedero) prod).getDiasCaducar() + " " + prod.getPrecio()+ "\n");
					}
				}
			}
			archivo.close();
		}catch (IOException ex) {}
	}
	
	public ArrayList<String> leerFichero(){
		ArrayList<String> datos = new ArrayList<>();
		try {
		FileReader archivo = new FileReader("C:\\Users\\ivanrq\\desktop\\Productos.txt");
		BufferedReader lectura = new BufferedReader(archivo);
		String cadena;
		while((cadena = lectura.readLine()) != null) {
			datos.add(cadena);
		}
		}catch (Exception ex) {}
		return datos;
	}
	
}
