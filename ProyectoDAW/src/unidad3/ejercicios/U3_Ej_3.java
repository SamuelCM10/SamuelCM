package unidad3.ejercicios;

import java.util.Scanner;

public class U3_Ej_3 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1=entrada.nextInt();
		System.out.println("Introduzca un número");
		num2=entrada.nextInt();
		if(num1>num2) {
			System.out.println(num1+" es mayor");
		}else {
			System.out.println(num2+" es mayor");
		}entrada.close();
	}
}
