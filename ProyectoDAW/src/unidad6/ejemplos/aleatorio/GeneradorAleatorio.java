package unidad6.ejemplos.aleatorio;

import java.util.Random;

public class GeneradorAleatorio {

	public static void main(String[] args) {

		Random aleatorio = new Random(System.currentTimeMillis());
		int numero = aleatorio.nextInt(10000);
			
		System.out.println("Numero:"+numero);
		}

	}