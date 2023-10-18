package unidad3;

import java.util.Scanner;

public class Sorteo {

	public static void main(String[] args) {
		int sorteo=10;
		Scanner entrada= new Scanner(System.in);
		int eleccion;
		int contador=1;
		System.out.println("Introduce el número: ");
		eleccion=entrada.nextInt();
		
		while(sorteo!=eleccion) {
			System.out.println("Prueba otra vez: ");
			System.out.println("Llevas "+contador+" intentos");
			contador++;
			eleccion=entrada.nextInt();
		}
		System.out.println("AAAAAAAAAAAAAAAAAHHHHHHHH");
		entrada.close();
	}

}
