package carrera;

import java.util.Scanner;

public class Carrera {

	private String nombreCarrera;
	private int kilometros;
	private Coche vCoches[];

	public Carrera(String nombreCarrera, int kilometros) {
		this.nombreCarrera = nombreCarrera;
		this.kilometros = kilometros;
		this.vCoches = new Coche[10];
	}

	
		
	public void rellenarCoche() {
		Scanner leer = new Scanner(System.in);
		String nombre;
		boolean humano;
		int dorsal;
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i] == null) {
				System.out.println("Dime el nombre del Piloto");
				nombre = leer.next();

				do {

					System.out.println("Dime su dorsal");
					dorsal = leer.nextInt();

				} while (!comprobarDorsal(dorsal));
				
					
					System.out.println("Es humano");
					humano = leer.nextBoolean();
				
				
				vCoches[i] = new Coche(nombre,dorsal,this.kilometros,humano);
				
				
				break;
			}
		}

	}

	private boolean comprobarDorsal(int dorsal) {
		for (Coche coche : vCoches) {
			if (coche!=null && dorsal == coche.getDorsal()) {
				return false;
			}
		}
		return true;
	}

	public boolean poderRearrancar() {

		for (Coche coche : vCoches) {

			if (coche != null && coche.getEstadoCoche().equalsIgnoreCase("MARCHA")) {
				return false;
			}

		}
		return true;
	}
	
	

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	

	

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public  Coche[] getvCoches() {
		return vCoches;
	}

	public void setvCoches(Coche[] vCoches) {
		this.vCoches = vCoches;
	}


	public boolean carreraTerminada() {
		for (Coche coche : vCoches) {
			if (coche!=null && coche.getEstadoCoche().equalsIgnoreCase("MARCHA")) {
				return false;
			}
		}
		return true;
	}

}
