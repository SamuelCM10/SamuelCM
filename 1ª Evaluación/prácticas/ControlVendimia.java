package prácticas;

import java.util.Scanner;

public class ControlVendimia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int Tam_Zonas=6;
		
		int [] zonas=new int[Tam_Zonas];
		zonas[0]=0;
		zonas[1]=0;
		zonas[2]=0;
		zonas[3]=0;
		zonas[4]=0;
		zonas[5]=0;
		
		int kg_T=0;
		
		int option;
		int zona;
	do{
		System.out.println("---------------Menú---------------");
		System.out.println("1.Añadir cantidad a una zona");
		System.out.println("2.Obtener peso total");
		System.out.println("3.Cantidad por una zona");
		System.out.println("4.Media de peso");
		System.out.println("5.Salir");
		
		option=entrada.nextInt();
		
		if(option==1){
			
			do {
				
				System.out.println("Seleccione una zona:");
				System.out.println("1.Zona 1");
				System.out.println("2.Zona 2");
				System.out.println("3.Zona 3");
				System.out.println("4.Zona 4");
				System.out.println("5.Zona 5");
				System.out.println("6.Zona 6");
				System.out.println("7.Salir");
			
				zona=entrada.nextInt();
				
				if(zona==1) {
					System.out.println("Ingrese los kilogramos de la zona 1:");
					zonas[0]=entrada.nextInt();
				}
				if(zona==2) {
					System.out.println("Ingrese los kilogramos de la zona 2:");
					zonas[1]=entrada.nextInt();
				}
				if(zona==3) {
					System.out.println("Ingrese los kilogramos de la zona 3:");
					zonas[2]=entrada.nextInt();
				}
				if(zona==4) {
					System.out.println("Ingrese los kilogramos de la zona 4:");
					zonas[3]=entrada.nextInt();
				}
				if(zona==5) {
					System.out.println("Ingrese los kilogramos de la zona 5:");
					zonas[4]=entrada.nextInt();
				}
				if(zona==6) {
					System.out.println("Ingrese los kilogramos de la zona 6:");
					zonas[5]=entrada.nextInt();
				}
				}while(zona!=7);
			
			
		}if(option==2) {
			kg_T=zonas[0]+zonas[1]+zonas[2]+zonas[3]+zonas[4]+zonas[5];
			System.out.println("Los kilogramos de todas las zonas son: "+kg_T+"kg");
			}
		if(option==3) {
			
			do {
				
				System.out.println("Seleccione una zona:");
				System.out.println("1.Zona 1");
				System.out.println("2.Zona 2");
				System.out.println("3.Zona 3");
				System.out.println("4.Zona 4");
				System.out.println("5.Zona 5");
				System.out.println("6.Zona 6");
				System.out.println("7.Salir");
			
				zona=entrada.nextInt();
				
				if(zona==1) {
					System.out.println("La zona 1 tiene: "+zonas[0]+"kg");
					
				}
				if(zona==2) {
					System.out.println("La zona 2 tiene: "+zonas[1]+"kg");
					
				}
				if(zona==3) {
					System.out.println("La zona 3 tiene: "+zonas[2]+"kg");
					
				}
				if(zona==4) {
					System.out.println("La zona 4 tiene: "+zonas[3]+"kg");
					
				}
				if(zona==5) {
					System.out.println("La zona 5 tiene: "+zonas[4]+"kg");

				}
				if(zona==6) {
					System.out.println("La zona 6 tiene: "+zonas[5]+"kg");
					
				}
				}while(zona!=7);
		}
		if(option==4) {
			double media=kg_T/6;
			System.out.println("La media de peso de todas las parcelas es de: "+media+"kg");
		}
	}while(option!=5);

	}
}
