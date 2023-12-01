package unidad5.tarea2_U5;

import java.util.Scanner;

public class ControlVendimia2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		final int NUM_DEPOT=2;
		
		double [] Tempranillo=new double[NUM_DEPOT];
		double [] Garnacha=new double[NUM_DEPOT];
		double [] Verdejo=new double[NUM_DEPOT];

		double media=0;
		double depsTempranillo=0;
		double depsGarnacha=0;
		double depsVerdejo=0;
		
		int option;
		
		do{
			System.out.println("---------------Menú---------------");
			System.out.println("1.Añadir litros al depósitos");
			System.out.println("2.Obtener litros de cada uva");
			System.out.println("3.Obtener deposito más lleno");
			System.out.println("4.Obtener media");
			System.out.println("5.Obtener arrobas");
			System.out.println("6.Salir");
			
			option=entrada.nextInt();
			
			switch(option){
			case 1:
				System.out.println("Seleccione el tipo de uva (1-Tempranillo|2-Garnacha|3-Verdejo): ");
				int uva;
				int depot;
				double l;
				uva=entrada.nextInt();
				if(uva==1) {
					System.out.println("Seleccione el depósito (1-2): ");
					depot=entrada.nextInt();
					System.out.println("Introduzca la cantidad a añadir: ");
					l=entrada.nextDouble();
					Tempranillo[depot-1]=l;
				}else if(uva==2) {
					System.out.println("Seleccione el depósito (1-2): ");
					depot=entrada.nextInt();
					System.out.println("Introduzca la cantidad a añadir: ");
					l=entrada.nextDouble();
					Garnacha[depot-1]=l;
				}else if(uva==3) {
					System.out.println("Seleccione el depósito (1-2): ");
					depot=entrada.nextInt();
					System.out.println("Introduzca la cantidad a añadir: ");
					l=entrada.nextDouble();
					Verdejo[depot-1]=l;
				}else {
					System.out.println("Vuelva a seleccionar el tipo de uva.");
				}
				break;
			case 2:
				System.out.println("------Tempranillo------");
				System.out.print("|");
				for(int i=0;i<NUM_DEPOT;i++) {
					System.out.print(Tempranillo[i]+"|");
				}System.out.println(" ");
				System.out.println("------Garnacha------");
				System.out.print("|");
				for(int i=0;i<NUM_DEPOT;i++) {
					System.out.print(Garnacha[i]+"|");
				}System.out.println(" ");
				System.out.println("------Verdejo------");
				System.out.print("|");
				for(int i=0;i<NUM_DEPOT;i++) {
					System.out.print(Verdejo[i]+"|");
				}
				System.out.println(" ");
				break;
			case 3:
				System.out.println("------Tempranillo------");
				if(Tempranillo[0]>Tempranillo[1]) {
					System.out.println("Depóstio 1: "+Tempranillo[0]);
				}else if(Tempranillo[1]>Tempranillo[0]){
					System.out.println("Depóstio 2: "+Tempranillo[1]);
				}else {
					System.out.println("Depósitos igualados.");
				}
				System.out.println("------Garnacha------");
				if(Garnacha[0]>Garnacha[1]) {
					System.out.println("Depóstio 1: "+Garnacha[0]);
				}else if(Garnacha[1]>Garnacha[0]){
					System.out.println("Depóstio 2: "+Garnacha[1]);
				}else {
					System.out.println("Depósitos igualados.");
				}
				System.out.println("------Verdejo------");
				if(Verdejo[0]>Verdejo[1]) {
					System.out.println("Depóstio 1: "+Verdejo[0]);
				}else if(Verdejo[1]>Verdejo[0]){
					System.out.println("Depóstio 2: "+Verdejo[1]);
				}else {
					System.out.println("Depósitos igualados.");
				}
				break;
			case 4:
				depsTempranillo=Tempranillo[0]+Tempranillo[1];
				depsGarnacha=Garnacha[0]+Garnacha[1];
				depsVerdejo=Verdejo[0]+Verdejo[1];
				media=(depsTempranillo+depsGarnacha+depsVerdejo)/3;
				System.out.println("La media de litros de tos los depósitos es: "+media);
				break;
			case 5:
				System.out.println("Seleccione el tipo de uva (1-Tempranillo|2-Garnacha|3-Verdejo): ");
				double arroba=16.133;
				uva=entrada.nextInt();
				if(uva==1) {
					System.out.println(depsTempranillo/arroba);
					
				}else if(uva==2) {
					System.out.println("S");
					
				}else if(uva==3) {
					System.out.println("S");
					
				}else {
					System.out.println("Vuelva a seleccionar el tipo de uva.");
				}
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				
			}
			
		}while(option!=6);

	}
}