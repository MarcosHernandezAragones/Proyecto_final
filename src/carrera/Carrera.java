package carrera;

import java.util.Scanner;

public class Carrera {
	
	private String nombreCarrera;
	private String nombre;
	private int dorsal;
	private int distancia;
	private int kilometros;
	private boolean comprobarDorsal;
	private static Coche vCoches[];
	
	
	public Carrera(String nombre, int kilometros) {
		this.nombre = nombre;
		this.kilometros = kilometros;
		this.vCoches = new Coche [10];
	}
	
	
	public void rellenarCoche() {
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i]==null) {
				System.out.println("Dime el nombre del Piloto");
				nombre = leer.next();
				
				do {
					
					System.out.println("Dime su dorsal");
					dorsal = leer.nextInt();
					
				} while (comprobarDorsal(dorsal));
				
				
				Coche car = new Coche(nombre, dorsal);
			}
		}
		
		
	}


	private boolean comprobarDorsal(int dorsal) {
		for (Coche coche : vCoches) {
			if (comprobarDorsal==vCoches[]) {
				
			};
		}
		return false;
	}


	public String getNombreCarrera() {
		return nombreCarrera;
	}


	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	public int getKilometros() {
		return kilometros;
	}


	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}


	public static Coche[] getvCoches() {
		return vCoches;
	}


	public static void setvCoches(Coche[] vCoches) {
		Carrera.vCoches = vCoches;
	}
	
	
}
	

