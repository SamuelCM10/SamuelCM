package unidad6.ejemplos.cadenas;

import java.util.Scanner;

public class ExpresionesRegulares {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		String dato = entrada.next();
		// . = cualquier caracter
		// * = coincide con 0 o más repeticiones
		// + = coincide con 1 o más repeticiones
		// \\d = digitos
		// \\s = espacios en blanco
		// \\w = cualquier caracter de palabra
		// {n} = con {} se aplica el rango, ej:1,2,3...
		String expresionRegular = "[A-Z].b*";
		Boolean resultado = dato.matches(expresionRegular);
		
		if(resultado) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		entrada.close();
		

	}

}
