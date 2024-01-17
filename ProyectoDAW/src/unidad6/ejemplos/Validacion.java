package unidad6.ejemplos;

import java.util.Scanner;

public class Validacion {
	public static void main(String[] args) {
		// obtiene la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba el primer nombre:");
		String primerNombre = scanner.nextLine();
		System.out.println("Escriba el apellido paterno:");
		String apellidoPaterno = scanner.nextLine();
		System.out.println("Escriba la direccion:");
		String direccion = scanner.nextLine();
		System.out.println("Escriba la ciudad:");
		String ciudad = scanner.nextLine();
		System.out.println("Escriba el estado:");
		String estado = scanner.nextLine();
		System.out.println("Escriba el codigo postal:");
		String cp = scanner.nextLine();
		System.out.println("Escriba el telefono:");
		String telefono = scanner.nextLine();

		// valida la entrada del usuario y muestra mensaje de errorr
		System.out.println("\nValidar resultado:");

		if (!ValidacionEntrada.validarPrimerNombre(primerNombre))
			System.out.println("Primer nombre invalido");
		else if (!ValidacionEntrada.validarApellidoPaterno(apellidoPaterno))
			System.out.println("Apellido paterno invalido");
		else if (!ValidacionEntrada.validarDireccion(direccion))
			System.out.println("Direccion invalida");
		else if (!ValidacionEntrada.validarCiudad(ciudad))
			System.out.println("Ciudad invalida");
		else if (!ValidacionEntrada.validarEstado(estado))
			System.out.println("Estado invalido");
		else if (!ValidacionEntrada.validarCP(cp))
			System.out.println("Codigo postal invalido");
		else if (!ValidacionEntrada.validarTelefono(telefono))
			System.out.println("Numero telefonico invalido");
		else
			System.out.println("La entrada es valida. Gracias.");
	} // fin de main
} // fin de la clase Validacion