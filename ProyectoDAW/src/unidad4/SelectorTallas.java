package unidad4;

import java.util.Scanner;

public class SelectorTallas {

	public static void main(String[] args) {
		int numeroTalla = 0;

		char talla;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número de talla:");

		numeroTalla = entrada.nextInt();

		talla = convertirTallaCamiseta(numeroTalla);
		System.out.println("La talla de la camiseta es:" + talla);
		
		entrada.close();
	}

	private static char convertirTallaCamiseta(int tallaNumerica) {

		if (tallaNumerica < 10) {
			return 'S';
		} else if (tallaNumerica < 14) {
			return 'M';
		} else if (tallaNumerica < 18) {
			return 'L';
		} else {
			return 'X';
		}
	}
}