package profesores;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProfesoresApp {

	public static void main(String[] args) {
		ListaProfesores obj = new ListaProfesores();
		Nomina nom = new Nomina();
		
		try {
		obj.importeNomina();
		obj.imprimirListin();
		obj.guardarFichero();
		nom.importeTotalNominaProfesorado();
		
		}catch(FileNotFoundException ex) {
		ex.printStackTrace();
		}catch(IOException ex) {
		ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
		ex.printStackTrace();
		}

	}

}
