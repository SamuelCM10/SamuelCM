package unidad6.ejemplos;

import java.security.SecureRandom;

public class GenerarAleatorioSeguro {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int numAleatorio = random.nextInt();
		System.out.println(numAleatorio);
		
	}

}
