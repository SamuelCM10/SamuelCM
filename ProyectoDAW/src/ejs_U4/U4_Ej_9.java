package ejs_U4;

import java.util.Scanner;

public class U4_Ej_9 {

	static Scanner entrada = new Scanner(System.in);
	public static int num;
	
	public static void main(String[] args) {
	
	System.out.println("Introduzca un número:");
	num=entrada.nextInt();	
	cuadrado(num);
	

	}
 private static double cuadrado(int num) {
	
	num=num*num;
	System.out.println(num);
	return num;
	}
}
