package unidad4.ejercicios;

import java.util.Scanner;

public class U4_Ej_13_1 {

		static double inversion=1000;
		static double tipoInteres=10;
		static int numAños=1;
		public static Scanner entrada=new Scanner(System.in);
		
	public static void main(String[] args) {
		
		imprimirVF();		
		
	}
	private static void imprimirVF() {
		int i;
		for (i=0;i<5; i++) {
			System.out.print(inversion);
			System.out.print(", ");
			System.out.print(tipoInteres);
			System.out.print(", ");
			System.out.print(numAños);
			System.out.print(".");
			numAños++;
			i++;
		}
	}	
	private static void calcularVF() {
		double valorFinal;
		
	}
}
