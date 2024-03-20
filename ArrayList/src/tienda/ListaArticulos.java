package tienda;

import java.util.ArrayList;
import java.util.Iterator;

import persona.Persona;

public class ListaArticulos {
	ArrayList <Articulo> listaArticulos = new ArrayList <Articulo>();
	
	public ListaArticulos() {
		super();
	}

	public ListaArticulos(ArrayList<Articulo> listaArticulos) {
		super();
		this.listaArticulos = listaArticulos;
	}

	public void cargarDatos() {
		
		this.listaArticulos.add(new Libro(100, "Libro Generico", 14.99, "DA1DAS", 93, "Lucas"));
		this.listaArticulos.add(new Libro(150, "Libro Novedoso", 17.99, "OKD19", 138, "Lucia"));
		this.listaArticulos.add(new Dvd(200, "Primer DvD", 5.99, 20, "Samantha"));
		this.listaArticulos.add(new Dvd(86, "Segundo DvD", 5, 15, "Marcos"));
	}
	
	public void agregarLibro(int referenciaBuscar) {
		boolean encontrado = buscarReferencia(referenciaBuscar);
		
		if(encontrado == false) {
			Libro libro = new Libro();
			this.listaArticulos.add(libro.pedirDatosLibro(referenciaBuscar));
			System.out.println("Libro añadido.");
			System.out.println();
		}
	}
	
	public void agregarDvd(int referenciaBuscar) {
		boolean encontrado = buscarReferencia(referenciaBuscar);
		
		if(encontrado == false) {
			Dvd dvd = new Dvd();
			this.listaArticulos.add(dvd.pedirDatosDvd(referenciaBuscar));
			System.out.println("DvD añadido.");
			System.out.println();
		}
	}
	
	public boolean buscarReferencia(int referenciaBuscar) {
		boolean encontrado = false;
		
		for(Articulo art : this.listaArticulos) {
			if(art.getReferencia() == referenciaBuscar) {
				System.out.println("Referencia repetida, vuelva a intentarlo con otra.");
				System.out.println();
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	public void borrarInterfaz(int referenciaBuscar) {
		boolean encontrado = borrarBuscar(referenciaBuscar);
		
		if(encontrado == false) {
			System.out.println("Referencia introducida erronea, por favor vuelta a intentarlo.");
			System.out.println();
		}else {
			System.out.println("Borrado realizado.");
			System.out.println();
		}
	}
	
	public boolean borrarBuscar(int referenciaBuscar) {
		boolean encontrado = false;
		Articulo art;
		Iterator <Articulo> itArt = this.listaArticulos.iterator();
		while(itArt.hasNext()) {
			art = itArt.next();
			if(art.getReferencia() == referenciaBuscar) {
				itArt.remove();
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public void modificarInterfaz(int referenciaBuscar, String artTipo) {
		boolean encontrado = modificarBuscar(referenciaBuscar, artTipo);
		
		if(encontrado == false) {
			System.out.println("Referencia introducida erronea, por favor vuelta a intentarlo.");
			System.out.println();
		}else {
			System.out.println("Modificacion realizada.");
			System.out.println();
		}
	}
	
	public boolean modificarBuscar(int referenciaBuscar, String artTipo) {
		boolean encontrado = false;
		
		for(Articulo art : this.listaArticulos) {
			if(art.getReferencia() == referenciaBuscar) {
				encontrado = true;
				if(artTipo.equals("DVD")) {
					Dvd dvd = new Dvd();
					dvd = dvd.pedirDatosDvd(referenciaBuscar);
					this.listaArticulos.set(this.listaArticulos.indexOf(art), dvd);
				}else {
					Libro libro = new Libro();
					libro = libro.pedirDatosLibro(referenciaBuscar);
					this.listaArticulos.set(this.listaArticulos.indexOf(art), libro);
				}
			}
		}
		return encontrado;
	}
	
	public void mostrarArticulos() {
		for(Articulo articulos : this.listaArticulos) {
			System.out.println(articulos.toString());
		}
		System.out.println();
	}

	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

}