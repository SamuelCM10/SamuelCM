package ejemplos;

import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		double num3;
		String name;
		String nameMama;
		
		System.out.println("Escribe un número entero:");
		Scanner entrada = new Scanner(System.in);
		num1= entrada.nextInt();
		System.out.println(num1+" es entero.");
		System.out.println("Dame otro:");
		num2= entrada.nextInt();
		int suma= num1+num2;
		System.out.println("Pues su suma es: "+suma);
		System.out.println("Introduzca su saldo");
		num3= entrada.nextDouble();
		System.out.println("Su saldo es: "+num3);
		entrada.nextLine();
		System.out.println("Tu nombre: ");
		name= entrada.nextLine();
		System.out.println("Ahora el de tu madre: ");
		nameMama=entrada.nextLine();
		System.out.println("Okis");
		//Vaciar buffer con entrada.nextLine() para pasar de pedir números a cadenas.
		entrada.close();
	}

}
