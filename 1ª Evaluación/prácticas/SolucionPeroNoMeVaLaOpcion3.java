package prácticas;

import java.util.Scanner;

public class SolucionPeroNoMeVaLaOpcion3 {

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
		
		if(option==1){
			System.out.println("Introduzca la ID:");
			id=entrada.nextInt();
			System.out.println("Introduzca la coordenada x:");
			x=entrada.nextDouble();
			System.out.println("Introduzca la coordenada y:");
			y=entrada.nextDouble();
		}if(option==2) {
			if(id==0) {
				System.out.println("No hay datos");
			}else {
				System.out.println("ID: "+id);
				System.out.println("x: "+x);
				System.out.println("y: "+y);
				System.out.println("Generación diaria: "+gd);
				System.out.print("Estado: "+estado);
			}
			
		}if(option==3) {
			System.out.println("Para activar 'true' y desactivar 'false':");
			estado=entrada.nextBoolean();
		}else if(estado=true) {
				System.out.println("Está activada");
		}else if(estado=false) {
			System.out.println("Está desactivada");
			
		}if(option==4) {
			System.out.println("Introduzca los kWh:");
			kWh=entrada.nextDouble();
			gd=kWh*24;
			System.out.println("La generación diaria es de: "+gd);
		}
		
	}while(option!=5);

	}
}