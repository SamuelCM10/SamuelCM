package unidad4;

import java.util.Scanner;

public class Calculadora_3_Funciones {

	public static void sumar(int num1,int num2) {
		
		int suma= num1+num2;
		imprimirResultadoSumar(suma);
	}
	public static void restar(int num1,int num2) {
		
		int resta= num1-num2;
		imprimirResultadoRestar(resta);
	}
	
	public static void imprimirResultadoSumar(int resultado) {
	
		System.out.println("La suma es: "+resultado);
	}
	
	public static void imprimirResultadoRestar(int resultado) {
		
		System.out.println("La resta es: "+resultado);
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num1=entrada.nextInt();
		System.out.println("Introduzca otro número");
		int num2=entrada.nextInt();
		
		sumar(num1,num2);
		restar(num1,num2);
		/*hay que hacer una 4º en casa con la sobrecarga,
		usar metodos con mismos nombres pero distintos tipos de datos
		*/

	}

}