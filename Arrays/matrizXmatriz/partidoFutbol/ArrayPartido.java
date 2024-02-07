package partidoFutbol;

import java.util.ArrayList;

public class ArrayPartido {

		private ArrayList<Partido> partido = new ArrayList<>();

		public ArrayPartido() {
			super();
		}

		public ArrayPartido(ArrayList<Partido> partido) {
			super();
			this.partido = partido;
		}
		
		public void insertarPartidos() {
			Partido partido1 = new Partido("Valencia", "Real Betis", 1, 0);
			Partido partido2 = new Partido("Real Betis", "Dep. Osasuna", 1, 0);
			Partido partido3 = new Partido("Atletico Madrid", "Zaragoza", 0, 0);
			Partido partido4 = new Partido("Zaragoza", "Valencia", 2, 2);
			Partido partido5 = new Partido("Mallorca", "Deportivo", 0, 1);
			Partido partido6 = new Partido("Deportivo", "Atletico Madrid", 1, 0);
					
			partido.add(partido1);
			partido.add(partido2);
			partido.add(partido3);
			partido.add(partido4);
			partido.add(partido5);
			partido.add(partido6);
		}
		
		public void localesGanadores() {
			System.out.println("EQUIPOS LOCALES GANADORES");
			System.out.println();
			for(int i = 0; i < this.partido.size(); i++) {
				if(this.partido.get(i).getGolesLocal() > this.partido.get(i).getGolesVisitante()) {
					System.out.println(this.partido.get(i).getEquipoLocal());
				}
			}
		}
		
		public void empates() {
			System.out.println("PARTIDOS EMPATADOS");
			System.out.println();
			for(int i = 0; i < this.partido.size(); i++) {
				if(this.partido.get(i).getGolesLocal() == this.partido.get(i).getGolesVisitante()) {
					System.out.println(this.partido.get(i).getEquipoLocal()+ "\t" + this.partido.get(i).getEquipoVisitante() + "\n" + 
										this.partido.get(i).getGolesLocal() + "\t\t" + this.partido.get(i).getGolesVisitante());
				}
			}
		}
		
		public void clasificacion() {
			String[] equipos = {"Valencia", "Real Betis", "Dep. Osasuna", "Atletico Madrid", "Zaragoza", "Mallorca", "Deportivo"};
			int[] puntos = new int[7];
			for(int i = 0; i < this.partido.size(); i++) {
				if(this.partido.get(i).getGolesLocal() > this.partido.get(i).getGolesVisitante()) {
					for(int j = 0; j < equipos.length; j++) {
						if(this.partido.get(i).getEquipoLocal().equals(equipos[j])) puntos[j] += 3;
					}
				}
				else if(this.partido.get(i).getGolesLocal() < this.partido.get(i).getGolesVisitante()) {
					for(int j = 0; j < equipos.length; j++) {
						if(this.partido.get(i).getEquipoVisitante().equals(equipos[j])) puntos[j] += 3;
					}
				}
				else {
					for(int j = 0; j < equipos.length; j++) {
						if(this.partido.get(i).getEquipoVisitante().equals(equipos[j])||this.partido.get(i).getEquipoLocal().equals(equipos[j])) 
							puntos[j] += 1;
					}
				}
			}
			
			Ordenar(equipos, puntos);
	        
			listaClasificacion(equipos, puntos);
		}
		
		public void Ordenar(String[] equipos, int[] puntos) {
			for(int i=0; i < puntos.length-1; i++){
	        	int auxInt = 0;
	        	String auxString = "";
	               for(int j=0; j < (puntos.length-1-i); j++){ 
	                    if(puntos[j] < puntos[j+1]){ 
	                    		auxInt = puntos[j];                
	                            puntos[j] = puntos[j+1];          
	                            puntos[j+1] = auxInt;
	                            auxString = equipos[j];
	                            equipos[j] = equipos[j + 1];
	                            equipos[j+1] = auxString;
	                     }   
	               }
	         }
		}
		
		public void listaClasificacion(String[] equipos, int[] puntos) {
			System.out.println("Equipo" + "\t\t" + "Puntos");
	        System.out.println("----------------------");
	        for(int i=0; i < puntos.length; i++){
	        	System.out.println(equipos[i] + "\t" + puntos[i]);
	        }
		}
		
		public void eliminarNoEmpates() {
			for(int i = 0; i < this.partido.size(); i++) {
				if(this.partido.get(i).getGolesLocal() != this.partido.get(i).getGolesVisitante()) {
					this.partido.remove(i);
				}
			}
		}

		public ArrayList<Partido> getPartido() {
			return partido;
		}

		public void setPartido(ArrayList<Partido> partido) {
			this.partido = partido;
		}
		
}
