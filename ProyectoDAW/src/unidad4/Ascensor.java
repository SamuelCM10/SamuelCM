package unidad4;

import java.util.Scanner;

public class Ascensor {

	public static boolean puertaAbierta=false;
	public static int plantaActual=0;
	public static final int ULTIMA_PLANTA=5;
	public static final int PRIMERA_PLANTA=0;
	
	public static void main(String[] args) {
	
		
		Scanner entrada= new Scanner(System.in);
		
		int option=0;
		int plantaMarcada=0;
		do {
			System.out.println("-----ASCENSOR-----");
			System.out.println("1.Marcar planta");
			System.out.println("2.Abrir puerta");
			System.out.println("3.Cerrar planta");
			System.out.println("4.Apagar");
			
			option=entrada.nextInt();
			if(option==1) {
				System.out.println("Ingrese el número de la planta:");
				plantaMarcada=entrada.nextInt();
				
			while(plantaMarcada!=plantaActual);
				}if(plantaActual<plantaMarcada) {
					plantaActual++;
					System.out.println("Planta: "+plantaActual);
				}else {
					plantaActual--;
					System.out.println("Planta: "+plantaActual);
			}
				
			if(option==2) {
				
			}
			
			
		}while(option==4);
	}

}
