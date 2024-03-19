package tienda;

import java.util.ArrayList;

public class ListaArticulos {
	ArrayList <Dvd> listaDvd;
	ArrayList <Libro> listaLibro;
	
	public ListaArticulos() {
		super();
	}

	public ListaArticulos(ArrayList<Dvd> listaDvd, ArrayList<Libro> listaLibro) {
		super();
		this.listaDvd = listaDvd;
		this.listaLibro = listaLibro;
	}

	public ArrayList<Dvd> getListaDvd() {
		return listaDvd;
	}

	public void setListaDvd(ArrayList<Dvd> listaDvd) {
		this.listaDvd = listaDvd;
	}

	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

}