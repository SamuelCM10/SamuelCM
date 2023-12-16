package unidad4.ejercicios;

import java.util.Scanner;

public class U4_Ej_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el número de millas");
		int millas = entrada.nextInt();
		milesToKm(millas);
		
	}
	private static double milesToKm(int millas) {
		
		double km=millas*1.60934;
		System.out.println(millas+" milla/s equivalen a "+km+" km.");
		return km;
	}

}
