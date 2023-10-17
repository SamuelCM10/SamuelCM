package unidad3;

import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {
		
		int edad;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduzca su edad. Gracias");
		edad=entrada.nextInt();
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
			if(edad>=30) {
			System.out.println("Eres un pureta");
			}
		}else {
			System.out.println("Eres menor de edad");
		}
		System.out.println("Enhorabuena bro!");
		
		entrada.close();
	}

}
