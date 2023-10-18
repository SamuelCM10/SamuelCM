package ejercicios;

import java.util.Scanner;

public class U3_Ejercicios {

	public static void main(String[] args) {
		
//Ejecicio 1
		int entrada;
		System.out.println("Introduzca un número:");
		Scanner entrada = new Scanner(System.in);
		entrada.nextInt();
		
		if(entrada+2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
	}
}
