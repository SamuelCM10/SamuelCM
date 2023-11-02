package ejs_U3;

import java.util.Scanner;

public class U3_Ej_5 {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		int suma=num1+num2;
		int producto=num1*num2;
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		num1=entrada.nextInt();
		System.out.println("Introduzca otro:");
		num2=entrada.nextInt();
		
		if(num1>num2) {
			System.out.print("La suma es: "+suma);
			System.out.print(" porque "+num1);
			System.out.println(" es mayor.");
		}else {
			System.out.print("El producto es: "+producto);
			System.out.print(" porque "+num2);
			System.out.println(" es mayor.");
		}entrada.close();
	}
}
