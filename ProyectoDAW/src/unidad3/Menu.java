package unidad3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int option;
		int anio;
		do {

		System.out.println("---------------Menú---------------");
		System.out.println("1.Calcular si el año es bisiesto");
		System.out.println("2.Salir");
		
		option=entrada.nextInt();
		
		if(option==1){
			System.out.println("Introduzca un año.");
			anio=entrada.nextInt();
			if((anio%4==0&&anio%100!=0)||anio%400==0){
				System.out.println("Es bisieto");
			}else {
				System.out.println("No es bisiesto");
			}
			
		}else if(option==2) {
			System.out.println("Gracias, hasta la próxima.");
		}else {
			System.out.println("La opción no es válida, inténtelo de nuevo.");
		}
		}while(option!=2);
	}
}
