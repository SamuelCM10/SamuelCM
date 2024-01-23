package unidad7.ejemplos.tareas;

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
	System.out.println("Fecha(dd/MM/yyyy):");
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
	System.out.println("Hora(hh:mm):");
	Boolean resultadoHora;
	do {
	String hora = entrada.next();
	String formatoHora = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
	resultadoHora = hora.matches(formatoHora);
		
	if(resultadoHora) {
			System.out.println("");
	}else {
		System.out.println("Introduzca una hora válida (hh:mm)");
	}
		}while (!resultadoHora);
	}
}
