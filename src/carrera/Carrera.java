package carrera;

public class Carrera {
	
	private String nombre;
	private int kilometros;
	private int corredores;
	
	public Carrera(String nombre, int kilometros, int corresores) {
		this.nombre = nombre;
		this.kilometros = kilometros;
		this.corredores = corresores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getCorresores() {
		return corredores;
	}

	public void setCorresores(int corresores) {
		this.corredores = corresores;
	}

	
	@Override
	public String toString() {
		return "Carrera nombre " + nombre + ", kilometros " + kilometros + ", corredores " + corredores;
	}
	
}
