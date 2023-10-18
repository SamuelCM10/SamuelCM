package ejercicios;

import java.util.Scanner;

public class U3_Ejercicios {

	public static void main(String[] args) {
		
//Ejecicio 1
		int numEj1;
		System.out.println("Introduzca un número:");
		Scanner entrada = new Scanner(System.in);
		numEj1=entrada.nextInt();
		
		if(numEj1%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
	}
}
