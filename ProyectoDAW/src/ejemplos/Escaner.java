package ejemplos;

import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		System.out.println("Escribe un número entero:");
		Scanner entrada = new Scanner(System.in);
		num1= entrada.nextInt();
		System.out.println(num1+" es entro.");
		System.out.println("Dame otro:");
		num2= entrada.nextInt();
		int suma= num1+num2;
		System.out.println("Pues su suma es: "+suma);

		entrada.close();
	}

}
