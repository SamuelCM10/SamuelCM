package unidad4.ejercicios;

import java.util.Scanner;

public class U4_Ej_13 {

		static double inversion;
		static double tipoInteres;
		static int numAños;
		public static Scanner entrada=new Scanner(System.in);
		
	public static void main(String[] args) {
		
		/*
		inversion=pedirInversion();
		tipoInteres=pedirInteres();
		numAños=pedirNumAños();
		
		Con return para que devuelva los datos, con double o int
		Para modificar, se modifica cada función*/
		
		pedirDatos();
		//recoger 3 datos a la vez, con void
		//se toca menos código
		
		/*
		pedirInversion2();
		pedirInteres2();
		pedirNumAños2();
		
		soo actualizan el dato, no hacen NADA MAS
		
		pedirDatos2();
		
		actualiza funciones con el 2*/
	}
	private static void pedirDatos() {
		
		System.out.println();
		inversion=entrada.nextDouble();
		System.out.println();
		tipoInteres=entrada.nextDouble();
		System.out.println();
		numAños=entrada.nextInt();
		
	}
	private static int pedirNumAños() {
		
		int numAños=0;
		System.out.println();
		numAños=entrada.nextInt();
		return numAños;
		
	}
	private static double pedirInteres() {
		
		double tipoInteres=0;
		System.out.println();
		tipoInteres=entrada.nextInt();
		return tipoInteres;
		
	}
	private static double pedirInversion() {
	
		double inversion=0;
		System.out.println();
		inversion=entrada.nextInt();
		return inversion;
	
	}
	private static void pedirInversion2() {
		System.out.println("");
		inversion=entrada.nextInt();
		
	}
	private static void pedirInteres2() {
		System.out.println("");
		tipoInteres=entrada.nextInt();
		
	}
	private static void pedirNumAños2() {
		System.out.println("");
		numAños=entrada.nextInt();
		
	}
	private static void pedirDatos2() {
		
		pedirInversion2();
		pedirInteres2();
		pedirNumAños2();
	}
}
