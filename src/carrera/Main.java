package carrera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double random = Math.random() + 1;
		int intentos = (int) Math.floor(random);

		Carrera c = null;
		int opc = 0;
		int opc1 = 0;
		Coche car;

		do {
			opc1 = Menu.pintaMenu();
			switch (opc1) {
			case 1:

				do {

					for (int i = 0; i < c.getvCoches().length; i++) {
						if (c.getvCoches()[i] != null) {
							car = c.getvCoches()[i];

							car.setEstadoCoche("MARCHA");

							if (car.isHumano()) {
								// Juega humano
								opc = Menu.pintaMenuCarrera();
								switch (opc) {

								case 2:
									car.acelerar();
									System.out.println();
									break;
								case 3:
									car.frenar();
									System.out.println();
									break;
								case 4:
									car.rearrancar(intentos);
									if (intentos > 0) {
										intentos--;
									}
									System.out.println();
									break;
								}
							} else {
								// Juega Maquina aleatorio
								
								double opcma = Math.random() + 1;
								int opcMa = (int) Math.floor(opcma);
								if (car.getEstadoCoche()=="ACCIDENTADO") {
									car.setEstadoCoche("MARCHA");
								}else {
									
									switch (opcMa) {
									
									case 0:
										car.acelerar();
										System.out.println();
										break;
									case 1:
										car.frenar();
										System.out.println();
										break;
									}
								}
								
							}

						}

					}

				} while (!c.carreraTerminada());

				break;
			case 2:
				System.out.println("añadiendo corredor");
				c.rellenarCoche();
				break;
			case 3:
				String nombreCarrera;
				int kilometros;

				System.out.println("añadiendo carrera");
				Scanner leer = new Scanner(System.in);

				System.out.println("dime el nombre de la carrera");
				nombreCarrera = leer.next();

				System.out.println("Dime la distancia de la carrera");
				kilometros = leer.nextInt();

				c = new Carrera(nombreCarrera, kilometros);
				break;
			case 4:
				System.out.println("salir");
				opc1 = 4;
				break;

			default:
				break;
			}
		} while (opc1 != 4);

	}

}
