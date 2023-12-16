package prácticas;

import java.util.Scanner;

public class PlacasSolares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int id;
		double x;
		double y;
		double gd;
		boolean estado=true;
		int option;
	do{
		System.out.println("---------------Menú---------------");
		System.out.println("1.Registrar Panel Solar");
		System.out.println("2.Consultar información");
		System.out.println("3.Cambiar estado");
		System.out.println("4.Calcular generación diaria");
		System.out.println("5.Salir");
		
		option=entrada.nextInt();
		
		if(option==1){
			System.out.println("Introduzca la ID:");
			id=entrada.nextInt();
			System.out.println("Introduzca la coordenada x:");
			x=entrada.nextDouble();
			System.out.println("Introduzca la coordenada y:");
			y=entrada.nextDouble();
			System.out.println("Introduzca la Generación Diaria:");
			gd=entrada.nextDouble();
		}if(option==2) {
			//if(id=0) {
				System.out.println("No hay datos");
			}
			
		
			
	}while(option!=5);

	}
}
