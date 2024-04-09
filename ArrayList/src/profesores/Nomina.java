package profesores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Nomina  implements Serializable  {
	public String idProfesor;
	public Double sueldo;
	
	public Nomina() {
		super();
	}

	public Nomina(String idProfesor, double sueldo) {
		super();
		this.idProfesor = idProfesor;
		this.sueldo = sueldo;
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

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return 	"Id Profesor: " + this.idProfesor + "\n" +
				"Sueldo: " + this.sueldo;
	}

}
