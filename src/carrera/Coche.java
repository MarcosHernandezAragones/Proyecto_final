package carrera;

public class Coche {
	
	private String nombrePiloto;
	private int dorsal;
	private int distanciaCarrera;
	private String estadoCoche;
	private final int POTENCIA = 50;
	private int velocidad;
	private int kmRecorridos;
	private boolean humano;

	
	
	public Coche(String nombrePiloto, int dorsal) { 
		super();
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.estadoCoche = "PARADO";
		this.velocidad = 0;
		this.kmRecorridos = 0;
		distanciaCarrera = 300; // De momento
	}

	public Coche(String nombrePiloto, int dorsal,int distancia) { 
		super();
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.estadoCoche = "PARADO";
		this.velocidad = 0;
		this.kmRecorridos = 0;
		distanciaCarrera = distancia;
	}
	
	public Coche(String nombrePiloto, int dorsal,int distancia, boolean humano) { 
		super();
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.estadoCoche = "PARADO";
		this.velocidad = 0;
		this.kmRecorridos = 0;
		distanciaCarrera = distancia;
		this.humano = humano;
	}
	
	public boolean isHumano() {
		if (humano==true) {
			return true;
		}
		return false;
	}
	
	public String getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEstadoCoche() {
		return estadoCoche;
	}

	public void setEstadoCoche(String estadoCoche) {
		this.estadoCoche = estadoCoche;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public int getDistanciaCarrera() {
		return distanciaCarrera;
	}

	public int getPotencia() {
		return POTENCIA;
	}

	
	
	public void arrancar() {

		switch (this.estadoCoche) {
		case "PARADO":
			this.setEstadoCoche("MARCHA");
			System.out.println("Has arrancado el coche");
			break;
		case "MARCHA":
			System.out.println("El coche ya esta arrancado, has perdido un turno");
			break;

		case "ACCIDENTADO":
			System.out.println("Tu coche esta accidentado, debes rearrancarlo en el turno siguiente");
			break;

		case "TERMINADO":
			System.out.println("Ya has terminado la carrera");
			break;

		}

	}
	
	

	public void acelerar() {

		switch (this.getEstadoCoche()) {

		case "PARADO":
			System.out.println("Para acelerar, primero debes arrancar el coche en el turno siguiente");
			break;

		case "MARCHA":
			//System.out.println(nombrePiloto);
			double random = Math.random() * this.POTENCIA + 1;
			int acel = (int) Math.floor(random);
			velocidad += acel;
			if (velocidad > 200) {
				estadoCoche = "ACCIDENTADO";
				velocidad = 0;
			} else {
				kmRecorridos += acel;
			}
			System.out.println(toString());
			break;

		case "ACCIDENTADO":
			System.out.println("Estas accidentado espera un turno y luego rearranca el coche");
			break;

		case "TERMINADO":
			System.out.println("Ya has terminado la carrera");
			break;

		}
	}

	public void frenar() {
		switch (this.getEstadoCoche()) {
		case "PARADO":
			System.out.println("Para frenar, primero debes arrancar el coche en el turno siguiente");
			break;

		case "MARCHA":
			double random = Math.random() * this.POTENCIA + 1;
			int acel = (int) Math.floor(random);
			velocidad -= acel;
			if (velocidad < 0) {
				velocidad = 0;
			} else {
				kmRecorridos += acel;
			}
			System.out.println(toString());
			break;

		case "ACCIDENTADO":
			System.out.println("Para poder acelerar, debes rearrancar el coche en el turno siguiente");
			break;

		case "TERMINADO":
			System.out.println("Ya has terminado la carrera");
			break;
			
		}
	}
	
	
	public void rearrancar(int intentos) {
		
		//System.out.println(intentos);
		
		if (this.getEstadoCoche()=="ACCIDENTADO" && intentos==0) {
			this.setEstadoCoche("MARCHA");
			System.out.println("Has rearrancado bien el coche");
		}else {
			System.out.println("No has podido rearrancar bien.");
			
		}
		//System.out.println(intentos);
		System.out.println(getEstadoCoche());
	}

	@Override
	public String toString() {
		return "Coche nombrePiloto " + nombrePiloto + ", dorsal " + dorsal + ", estadoCoche " + estadoCoche 
				+ ", velocidad " + velocidad + ", kmRecorridos " + kmRecorridos;
	}
	
	
	
}
	

