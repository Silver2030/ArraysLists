package muebles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ListaMuebles {
	ArrayList<Mueble> listaMuebles = new ArrayList<Mueble>();

	public ListaMuebles() {
		super();
	}

	public ListaMuebles(ArrayList<Mueble> listaMuebles) {
		super();
		this.listaMuebles = listaMuebles;
	}
	
	public void generarDatos() {
		this.listaMuebles.add(new Cama("D123", "Madera", 149.99, 20, "Individual"));
		this.listaMuebles.add(new Cama("13J5", "Bambu", 300.0, 5, "Matrimonio"));
		this.listaMuebles.add(new Mesa("KDA3", "Vidrio", 119.99, 450));
		this.listaMuebles.add(new Mesa("PR7E", "Madera", 85.0, 500));
		this.listaMuebles.add(new Silla("4812", "Plastico", 50.0, 2000, true, true));
		this.listaMuebles.add(new Silla("DO89", "Hierro", 49.99, 300, false, false));
	}
	
	public void muebleNuevo() {
		
	}
	
	public void imprimirDatos() {
		for(Mueble mueb : this.listaMuebles) {
			System.out.println(mueb.toString());
			System.out.println();
		}
	}
	
	public ArrayList<Mueble> objetosGuardar(){
		ArrayList<Mueble> guardarMuebles = new ArrayList<Mueble>();
		
		for(Mueble mueb : this.listaMuebles) {
			if(mueb instanceof Cama) {
				Mueble aniadir = new Mueble(mueb.getIdProducto(), mueb.getPrecio() + ((Cama) mueb).precioExtra(), mueb.getStock());
				guardarMuebles.add(aniadir);
			}else {
				Mueble aniadir = new Mueble(mueb.getIdProducto(), mueb.getPrecio(), mueb.getStock());
				guardarMuebles.add(aniadir);
			}
		}
		
		return guardarMuebles;
	}
	
	public void guardarFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fichero = null;
		ArrayList<Mueble> guardarMuebles = objetosGuardar();
		try {
			fichero = new FileOutputStream("C:\\Users\\ivanrq\\desktop\\muebles.dat");
			ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
			tuberia.writeObject(guardarMuebles);
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				fichero.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void muebleMasCaro() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis;
		try {
			  Mueble muebleMasCaro = new Mueble(" ", 0.0, 0);
			  fis = new FileInputStream("C:\\Users\\ivanrq\\desktop\\muebles.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  ArrayList<Mueble> list = (ArrayList<Mueble>) ois.readObject();
			  ois.close();
			  System.out.println("DATOS MUEBLE MAS CARO");
			  System.out.println();
			  for(Mueble al : list) {
				  if(al.getPrecio() > muebleMasCaro.getPrecio()) muebleMasCaro = al;		  
			  }
			  System.out.println(muebleMasCaro.toString());
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<Mueble> getListaMuebles() {
		return listaMuebles;
	}

	public void setListaMuebles(ArrayList<Mueble> listaMuebles) {
		this.listaMuebles = listaMuebles;
	}

}
