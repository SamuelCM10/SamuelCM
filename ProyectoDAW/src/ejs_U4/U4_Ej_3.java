package ejs_U4;

import java.util.Scanner;

public class U4_Ej_3 {

	public static double num1=0;
	public static double num2=0;
	public static double resultado;
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escriba un número: ");
		num1=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num2=entrada.nextInt();
	
		multiplica(num1,num2);
		producto(resultado);
		entrada.close();
	}
	private static double multiplica(double num1, double num2) {
		resultado=(num1*num2);
		return resultado;
		
	}
	private static void producto(double resultado) {
		System.out.println(resultado);
	}
}