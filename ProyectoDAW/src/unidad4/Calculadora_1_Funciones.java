package unidad4;

import java.util.Scanner;

public class Calculadora_1_Funciones {
	
	public static int sumar(int a,int b) {
		
		int suma= a+b;
		return suma;
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num1=entrada.nextInt();
		System.out.println("Introduzca otro número");
		int num2=entrada.nextInt();
		
		int suma=sumar(num1,num2);
		System.out.println("La suma es: "+suma);

	}

}
