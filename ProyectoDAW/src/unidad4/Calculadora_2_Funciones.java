package unidad4;

import java.util.Scanner;

public class Calculadora_2_Funciones {

	public static void sumar(int num1,int num2) {
		
		int suma= num1+num2;
		imprimirResultado(suma);
	}
	
	public static void imprimirResultado(int resultado) {
	
		System.out.println("La suma es: "+resultado);
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num1=entrada.nextInt();
		System.out.println("Introduzca otro número");
		int num2=entrada.nextInt();
		
		sumar(num1,num2);
	

	}

}