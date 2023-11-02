package ejs_U3;

import java.util.Scanner;

public class U3_Ej_2 {

	public static void main(String[] args) {
		
		int num1;
		int num2;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1=entrada.nextInt();
		System.out.println("Introduzca otro número");
		num2=entrada.nextInt();
		if(num1<num2) {
			System.out.println(num2+", "+num1);
		}else {
			System.out.println(num1+", "+num2);
		}entrada.close();
	}
}
