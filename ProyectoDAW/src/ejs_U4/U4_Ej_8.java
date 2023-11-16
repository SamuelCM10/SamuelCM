package ejs_U4;

import java.util.Scanner;

public class U4_Ej_8 {

	static Scanner entrada = new Scanner(System.in);
	public static double num;
	
	public static void main(String[] args) {
	
	System.out.println("Introduzca un número:");
	num=entrada.nextDouble();	
	diezVeces(num);
	

	}
 private static double diezVeces(double num) {
	
	num=num*10;
	System.out.println(num);
	return num;
	}
}
