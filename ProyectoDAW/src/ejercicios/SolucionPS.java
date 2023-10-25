package ejercicios;

import java.util.Scanner;

public class SolucionPS {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int id=0;
		double x=0;
		double y=0;
		double kWh=0;
		double gd=0;
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
		
		switch(option){
		case 1:
			System.out.println("1.Registrar Panel Solar");
			System.out.println("Introduzca la ID:");
			id=entrada.nextInt();
			System.out.println("Introduzca la coordenada x:");
			x=entrada.nextDouble();
			System.out.println("Introduzca la coordenada y:");
			y=entrada.nextDouble();
			
			break;
		case 2:
			if(id==0) {
				System.out.println("No hay datos");
			}else {
			System.out.println("2.Consultar información");
			System.out.println("ID: "+id);
			System.out.println("x: "+x);
			System.out.println("y: "+y);
			System.out.println("Generación diaria: "+gd);
			if(estado) {
				System.out.println("Estado: Activado");
			}else {
				System.out.println("Estado: Desactivado");
			}
			}
			break;
		case 3:
			System.out.println("3.Cambiar estado");
			estado=!estado;
			System.out.println("Estado actualizado");
			break;
		case 4:
			System.out.println("4.Calcular generación diaria");
			System.out.println("Introduzca los kWh:");
			kWh=entrada.nextDouble();
			gd=kWh*24;
			System.out.println("La generación diaria es de: "+gd);
			break;
		case 5:
			System.out.println("5.Salir");
			entrada.close();
			break;
		default:
			System.out.println("Opción inválida");
		}
		
	}while(option!=5);

	}
}