package unidad4.ejercicios;

import java.util.Scanner;

public class U4_Ej_4 {

	public static int edad=0;
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escriba un número: ");
		edad=entrada.nextInt();
		esMayorEdad(edad);
		
		entrada.close();
	}
	private static boolean esMayorEdad(int edad) {
	
		if(edad>=18) {
		System.out.println("Es mayor de edad");
		return true;
		
		}else {
			System.out.println("No es mayor de edad");
			return false;
		}
	}
}