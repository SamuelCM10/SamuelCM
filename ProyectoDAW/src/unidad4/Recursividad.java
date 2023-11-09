package unidad4;

import java.util.Scanner;

public class Recursividad {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		System.out.println("Pon las veces que quieres que te saluden:");
		int numVeces=entrada.nextInt();	
		System.out.println("Saludo con bucle:");
		saludar(numVeces);
		System.out.println("Saludo con recursividad:");
		saludarRecursiva(numVeces);
		entrada.close();
	}
	private static void saludar(int veces) {
		for(int i=0;i<veces;i++) {
			System.out.println("Hola");
		}
	}
	private static void saludarRecursiva(int veces) {
		if(veces>0) {
			System.out.println("Adiós");
			saludarRecursiva(veces-1);
			
		}
	}
}
