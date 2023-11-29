package unidad3.ejercicios;

import java.util.Scanner;

public class U3_Ej_6 {

	public static void main(String[] args) {
		
		int num1=0;
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número entre el 1 y el 99:");
		num1=entrada.nextInt();
		if(num1<10) {
			System.out.println("El número es de 1 dígito");
		}else if(num1>=10&&num1<=99) {
			System.out.println("El número es de 2 dígitos");
		}else if(num1>99) {
			System.out.println("El número es de más de dos dígitos");
		}entrada.close();
	}
}
