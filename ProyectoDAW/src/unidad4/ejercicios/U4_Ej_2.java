package unidad4.ejercicios;

import java.util.Scanner;

public class U4_Ej_2 {

	public static double num1=0;
	public static double num2=0;
	public static double num3=0;
	public static double media;
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escriba un número: ");
		num1=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num2=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num3=entrada.nextInt();
	
		calcularMedia(num1,num2,num3);
		entrada.close();
	}
	private static void calcularMedia(double num1, double num2, double num3) {
		media=(num1+num2+num3)/3;
		System.out.println(media);
		
	}
}