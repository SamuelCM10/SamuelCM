package unidad6.ejemplos;

import java.util.Random;

public class GeneradorAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		//Generar un número entero aleatorio
		int numAleatorio = random.nextInt();
		System.out.println(numAleatorio);
		
		//Generar un número entero aleatorio 0-100
		int numAleatorio2 = random.nextInt(100+1);
		System.out.println(numAleatorio2);
		
		//Generar un número entero aleatorio 0-100
		double numAleatorio3 = random.nextInt(100+1);
		System.out.println(numAleatorio3);
		
	}

}
