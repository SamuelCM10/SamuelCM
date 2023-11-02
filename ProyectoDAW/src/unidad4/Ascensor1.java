package unidad4;

import java.util.Scanner;

public class Ascensor1 {

	public static boolean puertaAbierta=false;
	public static int plantaActual=0;
	public static final int ULTIMA_PLANTA=5;
	public static final int PRIMERA_PLANTA=0;
	
	public static void main(String[] args) {
	
		
		Scanner entrada= new Scanner(System.in);
		
		int option=0;
		do {
			System.out.println("-----ASCENSOR-----");
			System.out.println("1.Marcar planta");
			System.out.println("2.Abrir puerta");
			System.out.println("3.Cerrar planta");
			System.out.println("4.Apagar");
			
			option=entrada.nextInt();
			
			if(option==1) {
				System.out.println("Ingrese el número de la planta:");
				int plantaMarcada=entrada.nextInt();
				while(plantaMarcada!=plantaActual) {
					if(plantaActual<plantaMarcada) {
						plantaActual++;
						System.out.println("Planta: "+plantaActual);
					}else {
						plantaActual--;
						System.out.println("Planta: "+plantaActual);
				}
			}
		}
			else if(option==2) {
				System.out.println("Abriendo puerta");
				puertaAbierta=true;
				System.out.println("Puerta abierta");
			}
			else if(option==3) {
				System.out.println("Cerrando puerta");
				puertaAbierta=false;
				System.out.println("Puerta cerrada");
			}else if(option==4) {
				System.out.println("Apagando...");
			}else {
				System.out.println("Opción no válida");
			}
			
		}while(option==4);
		entrada.close();
		}
	}
