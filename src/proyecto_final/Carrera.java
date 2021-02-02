package proyecto_final;

public class Carrera {
	
	private String nombre;
	private int kilometros;
	private int corresores;
	
	public Carrera(String nombre, int kilometros, int corresores) {
		this.nombre = nombre;
		this.kilometros = kilometros;
		this.corresores = corresores;
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
		return corresores;
	}

	public void setCorresores(int corresores) {
		this.corresores = corresores;
	}

	
	@Override
	public String toString() {
		return "Carrera nombre " + nombre + ", kilometros " + kilometros + ", corresores " + corresores+" hola";
	}
	
	
	
	
	
}
