package notas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class ListaAlumnos {
	ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	public ListaAlumnos() {
		super();
	}
	
	public void agregarAlumnos() {
		Scanner in = new Scanner(System.in);
		String name = "";
		
		System.out.print("Nombre (FIN para finalizar): ");
		name = in.nextLine();
		System.out.println();
		
		while(!name.equalsIgnoreCase("fin")) {
			Alumno al = new Alumno();
			al.setNombre(name);
			System.out.print("Nota 1: ");
			al.setNota1(in.nextFloat());
			while((al.getNota1() < 0)|(al.getNota1() > 10)){
				System.out.print("Nota 1: ");
				al.setNota1(in.nextFloat());
			}
			System.out.println();
			System.out.print("Nota 2: ");
			al.setNota2(in.nextFloat());
			while((al.getNota2() < 0)|(al.getNota2() > 10)){
				System.out.print("Nota 2: ");
				al.setNota1(in.nextFloat());
			}
			System.out.println();
			System.out.print("Nota 3: ");
			al.setNota3(in.nextFloat());
			while((al.getNota3() < 0)|(al.getNota3() > 10)){
				System.out.print("Nota 3: ");
				al.setNota1(in.nextFloat());
			}
			in.nextLine();
			System.out.println();
			this.listaAlumnos.add(al);
			System.out.println("Alumno agregado.");
			System.out.println();
			System.out.print("Nombre (FIN para finalizar): ");
			name = in.nextLine();
			System.out.println();
			
		};
	}
	
	public void guardarFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Alumnos.dat");
			ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
			tuberia.writeObject(this.listaAlumnos);
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
	
	public void leerFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		DecimalFormat df = new DecimalFormat("#.00");
		ArrayList<AlumnoNotaMedia> aprobados = new ArrayList<>();
		ArrayList<AlumnoNotaMedia> suspensos = new ArrayList<>();
		FileInputStream fis;
		try {
			  fis = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Alumnos.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  ArrayList<Alumno> list = (ArrayList<Alumno>) ois.readObject();
			  ois.close();
			  for(Alumno al : list) {
				  float notaMedia = (al.getNota1() + al.getNota2() + al.getNota3()) / 3;
				  AlumnoNotaMedia alumNotaMedia = new AlumnoNotaMedia(al.getNombre(), notaMedia);
				  System.out.println("Nombre: " + al.getNombre());
				  System.out.println("Nota media: " + df.format(notaMedia));
				  
				  if(notaMedia >= 5) {
					  aprobados.add(alumNotaMedia);
				  }else {
					  suspensos.add(alumNotaMedia);
				  }
				  guardarAprobado(aprobados);
				  guardarSuspenso(suspensos);
				  System.out.println();
			  }
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public void guardarAprobado(ArrayList<AlumnoNotaMedia> al) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Aprobados.dat");
			ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
			tuberia.writeObject(al);
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
	
	public void guardarSuspenso(ArrayList<AlumnoNotaMedia> al) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Suspensos.dat");
			ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
			tuberia.writeObject(al);
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
	
	public void leerAprobados() throws FileNotFoundException, IOException, ClassNotFoundException {
		DecimalFormat df = new DecimalFormat("#.00");
		FileInputStream fis;
		try {
			  fis = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Aprobados.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  ArrayList<AlumnoNotaMedia> list = (ArrayList<AlumnoNotaMedia>) ois.readObject();
			  ois.close();
			  System.out.println("APROBADOS " + list.size());
			  System.out.println();
			  for(AlumnoNotaMedia alMedia : list) {
				  System.out.println("Nombre: " + alMedia.getNombre());
				  System.out.println("Nota media: " + df.format(alMedia.getNotaMedia()));
				  System.out.println();
			  }
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public void leerSuspensos() throws FileNotFoundException, IOException, ClassNotFoundException {
		DecimalFormat df = new DecimalFormat("#.00");
		FileInputStream fis;
		try {
			  fis = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Suspensos.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  ArrayList<AlumnoNotaMedia> list = (ArrayList<AlumnoNotaMedia>) ois.readObject();
			  ois.close();
			  System.out.println("SUSPENSOS "  + list.size());
			  System.out.println();
			  for(AlumnoNotaMedia alMedia : list) {
				  System.out.println("Nombre: " + alMedia.getNombre());
				  System.out.println("Nota media: " + df.format(alMedia.getNotaMedia()));
				  System.out.println();
			  }
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public ListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

}