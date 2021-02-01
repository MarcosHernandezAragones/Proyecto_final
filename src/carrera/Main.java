package carrera;

import java.util.Scanner;

public class Main {
	
	public static int pintaMenu() {
		int opc =0;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Pulsa 1 para arrancar");
			System.out.println("Pulsa 2 para acelerar");
			System.out.println("Pulsa 3 para frenar");
			System.out.println("Pulsa 4 para rearrancar");
			opc = leer.nextInt();
		} while (opc<1 || opc>4);
		return opc;
	}

	public static void main(String[] args) {
	
		
		
	double random = Math.random() + 1;
	int intentos = (int) Math.floor(random);
	
	Carrera c = new Carrera("Juan", 100);
	int opc=0; 
	Coche car;
		
		do {
			opc=pintaMenu();
			car=c.getvCoches()[0];
			switch (opc) {
		
			case 1:
				car.arrancar();
				System.out.println();
				break;
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
				if (intentos>0) {
					intentos--;
				}
				System.out.println();
				break;
			}
			
		} while (car.getKmRecorridos()<=car.getDistanciaCarrera());
		
	}

}
