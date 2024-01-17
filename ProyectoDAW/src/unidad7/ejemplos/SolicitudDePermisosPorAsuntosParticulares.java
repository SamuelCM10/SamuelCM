package unidad7.ejemplos;

import java.util.Scanner;

public class SolicitudDePermisosPorAsuntosParticulares {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Solicitud de permiso por asuntos particulares");
		System.out.println("Registro de entrada");
		System.out.println("Fecha:");
		Boolean resultadoFecha;
		
		do {
		String fecha = entrada.next();
		String formatoFecha = "\\d{2}/\\d{2}/\\d{4}";
		resultadoFecha = fecha.matches(formatoFecha);
		
		if(resultadoFecha) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		}while (!resultadoFecha);
		
	}

}
