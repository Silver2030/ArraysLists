package profesores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

import notas.Alumno;

public class ListaProfesores {
	ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();

	public ListaProfesores() {
		super();
	}

	public ListaProfesores(ArrayList<Profesor> listaProfesores) {
		super();
		this.listaProfesores = listaProfesores;
	}
	
	public void importeNomina() {
		this.listaProfesores.add(new ProfesorInterino("45221887-K", "José", "Hernández López",1789.0));
		this.listaProfesores.add(new ProfesorInterino("72332634-L", "Andrés", "Moltó Parra", 1200.0));
		this.listaProfesores.add(new ProfesorInterino("34998128-M", "José", "Ríos Mesa", 1800.0));
		this.listaProfesores.add(new ProfesorTitular("73-K", "Juan", "Pérez Pérez", 1900.0, 2));
		this.listaProfesores.add(new ProfesorTitular ("88-L", "Alberto", "Centa Mota", 1800.0, 3));
		this.listaProfesores.add(new ProfesorTitular ("81-F", "Maria", "Mota Pérez", 1700.0, 5));
	}
	
	public void imprimirListin() {
		for(Profesor profe : this.listaProfesores) {
			System.out.println(profe.toString());
			System.out.println();
		}
	}
	
	public ArrayList<Nomina> grabarNomina() {
		ArrayList<Nomina> listaNominas = new ArrayList<Nomina>();
		
		for(Profesor profe : this.listaProfesores) {
			if(profe instanceof ProfesorTitular) {
				ProfesorTitular profeTit = (ProfesorTitular)profe;
				listaNominas.add(new Nomina(profeTit.idProfesor, (profeTit.sueldoBase + profeTit.complementoDestino) * profeTit.bonificacionAntiguedad() ));
			}else{
				ProfesorInterino profeInt = (ProfesorInterino)profe;
				listaNominas.add(new Nomina(profeInt.idProfesor, (profeInt.sueldoBase + profeInt.complementoEspecifico)));
			}
		}
		
		return listaNominas;
	}
	
	public void guardarFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fichero = null;
		ArrayList<Nomina> listaNominas = grabarNomina();
		try {
			fichero = new FileOutputStream("C:\\Users\\ivanrq\\desktop\\nominasProfesores.dat");
			ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
			tuberia.writeObject(listaNominas);
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
	
	public void importeTotalNominaProfesorado() throws FileNotFoundException, IOException, ClassNotFoundException {
		int nominaTot = 0;
		FileInputStream fis;
		try {
			  fis = new FileInputStream("C:\\Users\\ivanrq\\desktop\\nominasProfesores.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  ArrayList<Nomina> list = (ArrayList<Nomina>) ois.readObject();
			  ois.close();
			  System.out.println("NOMINA TOTAL - " + list.size() + " PROFESORES");
			  System.out.println();
			  for(Nomina al : list) {
				  nominaTot += al.getSueldo();
			  }
			  System.out.println(nominaTot + "€");
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<Profesor> getListaProfesores() {
		return listaProfesores;
	}

	public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}

}
