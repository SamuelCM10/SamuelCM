package unidad3;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		int dia;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduzca el día de la semana.");
		dia=entrada.nextInt();
		
		if(dia==1){
			System.out.println("Es lunes");
		}else if(dia==2){
			System.out.println("Es martes");
		}else if(dia==3){
			System.out.println("Es miércoles");
		}else if(dia==4){
			System.out.println("Es jueves");
		}else if(dia==5){
			System.out.println("Es viernes");
		}else if(dia==6){
			System.out.println("Es sábado");
		}else if(dia==7){
			System.out.println("Es domingo");
		}else{
			System.out.println("Valor no válido");
		}
		entrada.close();
	}
	


}
