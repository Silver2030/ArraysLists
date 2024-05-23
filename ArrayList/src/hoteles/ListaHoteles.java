package hoteles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ListaHoteles {

	
	
	
	
	public void leerFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		DecimalFormat df = new DecimalFormat( "#.##" );
		String[] hoteles = {"NH", "PRINCESS", "CAD-RIU", "MELIA", "H10", "PLAYA"};
		int[] reservasHoteles = {0, 0, 0, 0, 0, 0};
		double[] importeHoteles = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		FileInputStream fis;
		try {
			  fis = new FileInputStream("hoteles.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  ArrayList<Reserva> list = (ArrayList<Reserva>) ois.readObject();
			  ois.close();
			  for(Reserva reserva : list) {
					for(int i = 0; i < hoteles.length ; i++) {
						if(reserva instanceof ReservaHotel) {
							if(((ReservaHotel) reserva).getNombreHotel().equalsIgnoreCase(hoteles[i])) {
								reservasHoteles[i] += reserva.getNumeroPersonas();
								importeHoteles[i] += reserva.getPrecioBase() * reserva.getNumeroDias();
								
							}
						}
					}
			  }
			  
			  for(int i = 0; i < hoteles.length ; i++) {
					System.out.println(hoteles[i] + " Total reservas: " + reservasHoteles[i] + " Total Importe:" + df.format(importeHoteles[i]));
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
}
