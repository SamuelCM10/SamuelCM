package prácticas;

import java.util.Scanner;

public class ReservaDeVehículosEláctricos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int option;
		
		double numHbici=0;
		double numHpatin=0;
		double numHmoto=0;
		
		boolean bonoBici=false;
		boolean bonoPatin=false;
		boolean bonoMoto=false;
		
		int prBici=4;
		int prPatin=3;
		int prMoto=9;
		
		int desBici=2;
		double desPatin=1.5;
		int desMoto=5;
		
	do{
		System.out.println("---------------Menú---------------");
		System.out.println("1.Reservar bicicleta");
		System.out.println("2.Comprar bono bicicleta");
		System.out.println("3.Cancelar bono bicicleta");
		System.out.println("4.Reservar patinete");
		System.out.println("5.Comprar bono patinete");
		System.out.println("6.Cancelar bono patinete");
		System.out.println("7.Reservar moto");
		System.out.println("8.Comprar bono moto");
		System.out.println("9.Cancelar bono moto");
		System.out.println("10.Salir");
		
		option=entrada.nextInt();
		
		switch(option){
		case 1:
			System.out.println("¿Cuántas horas quiere reservar?");
			numHbici=entrada.nextDouble();
			
			if(bonoBici==false) {
				System.out.println("No tiene bono.");
				System.out.println("Ha reservado la bici.");
				System.out.println("Número de horas: "+numHbici);
				System.out.println("El coste del alquiler será: "+numHbici*prBici);
			}else {
				System.out.println("Tiene bono.");
				System.out.println("Ha reservado la bici.");
				System.out.println("Número de horas: "+numHbici);
				System.out.println("El coste del alquiler será: "+numHbici*desBici);
			}
			
		break;
		
		case 2:
			
			bonoBici=!bonoBici;
				System.out.println("Ha comprado el bono para bicicletas.");
		break;
		
		case 3:
			
			bonoBici=!bonoBici;
			System.out.println("Ha cancelado el bono para bicicletas.");
		break;
		
		case 4:
			System.out.println("¿Cuántas horas quiere reservar?");
			numHpatin=entrada.nextDouble();
			
			if(bonoPatin==false) {
				System.out.println("No tiene bono.");
				System.out.println("Ha reservado el patinete.");
				System.out.println("Número de horas: "+numHpatin);
				System.out.println("El coste del alquiler será: "+numHpatin*prPatin);
			}else {
				System.out.println("Tiene bono.");
				System.out.println("Ha reservado el patinete.");
				System.out.println("Número de horas: "+numHpatin);
				System.out.println("El coste del alquiler será: "+numHpatin*desPatin);
			}
			
		break;
		
		case 5:
			
			bonoPatin=!bonoPatin;
				System.out.println("Ha comprado el bono para patinetes.");
		break;
		
		case 6:
			
			bonoPatin=!bonoPatin;
				System.out.println("Ha canceladoel bono para patinetes.");
		break;
		
		case 7:
			System.out.println("¿Cuántas horas quiere reservar?");
			numHmoto=entrada.nextDouble();
			
			if(bonoMoto==false) {
				System.out.println("No tiene bono.");
				System.out.println("Ha reservado la moto.");
				System.out.println("Número de horas: "+numHmoto);
				System.out.println("El coste del alquiler será: "+numHmoto*prMoto);
			}else {
				System.out.println("Tiene bono.");
				System.out.println("Ha reservado la moto.");
				System.out.println("Número de horas: "+numHmoto);
				System.out.println("El coste del alquiler será: "+numHmoto*desMoto);
			}
			
		break;
		
		case 8:
			
			bonoMoto=!bonoMoto;
				System.out.println("Ha comprado el bono para motos.");
		break;
		
		case 9:
	
			bonoMoto=!bonoMoto;
			System.out.println("Ha cancelado el bono para motos.");
			
		break;
		
		case 10:
			System.out.println("Cerrando programa...");
			entrada.close();
		
		break;
			
		default:
			System.out.println("Opción inválida");
		}
		
	}while(option!=10);

	}

}
