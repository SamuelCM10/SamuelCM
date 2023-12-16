package unidad3.ejercicios;

import java.util.Scanner;

public class U3_Ej_1 {

	public static void main(String[] args) {
		
		int num1;
				
		System.out.println("Introduzca un número:");
		Scanner entrada = new Scanner(System.in);
		
		num1=entrada.nextInt();
				
		if(num1%2==0) {
			System.out.println("Es par");
		
		}else {
			System.out.println("Es impar");
		}entrada.close();
	}
}
