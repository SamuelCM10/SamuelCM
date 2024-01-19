package unidad7.ejemplos;

import java.util.Scanner;

public class FormularioAsuntosParticulares {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Solicitud de permiso por asuntos particulares");
		ponerFecha();
		
	}
public static void ponerFecha(){
	
	System.out.println("Registro de entrada");
	//Fecha
	System.out.println("Fecha:");
	Boolean resultadoFecha;
	do {
	String fecha = entrada.next();
	String formatoFecha = "\\d{2}/\\d{2}/\\d{4}";
	resultadoFecha = fecha.matches(formatoFecha);
	
	if(resultadoFecha) {
		System.out.println("");
	}else {
		System.out.println("Introduzca una fecha válida (dd/mm/yyyy)");
	}
		}while (!resultadoFecha);
	//Hora
	System.out.println("Hora:");
	Boolean resultadoHora;
	do {
	String hora = entrada.next();
	String formatoHora = "\\d[0,1]\\d[0,9]:\\d[0,5]\\d[0,9]";
	resultadoHora = hora.matches(formatoHora);
		
	if(resultadoHora) {
			System.out.println("");
	}else {
		System.out.println("Introduzca una hora válida (hh:mm)");
	}
		}while (!resultadoHora);
	}
}
