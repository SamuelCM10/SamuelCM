package unidad5.tarea3;

import java.util.Scanner;

public class ParkingManager {
	
	public static final int NUM_FILAS=5;
	public static final int NUM_COLUMNAS=5;
	public static char [][] parking=new char[NUM_FILAS][NUM_COLUMNAS];
	public static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
	int option;
	do{
			System.out.println("---------------Menú---------------");
			System.out.println("1.Inicializar parking");
			System.out.println("2.Ocupar plaza");
			System.out.println("3.Liberar plaza");
			System.out.println("4.Ver parking");
			System.out.println("5.Salir");
			
			option=entrada.nextInt();
			
			switch(option){
			case 1:
				inicializarParking(NUM_FILAS,NUM_COLUMNAS);
				break;
			case 2:
				okuparParking(NUM_FILAS,NUM_COLUMNAS);
				break;
			case 3:
				liberarParking(NUM_FILAS,NUM_COLUMNAS);
				break;
			case 4:
				verParking(NUM_FILAS,NUM_COLUMNAS);
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida");
			}
			
		}while(option!=5);
	}
private static void inicializarParking(int NUM_FILAS,int NUM_COLUMNAS) {
	for(int fila=0;fila<NUM_FILAS;fila++) {
		for(int columna=0;columna<NUM_COLUMNAS;columna++) {
			parking[fila][columna]='L';
		}
	}
}
private static void okuparParking(int NUM_FILAS,int NUM_COLUMNAS) {
	
	System.out.println("Escoja la plaza.");

	int fila;
	int columna;
	
	System.out.println("Seleccione la fila:");
	fila=entrada.nextInt();
	System.out.println("Seleccione la columna:");
	columna=entrada.nextInt();
	
	if(parking[fila][columna]=='O') {
		System.out.println("Escoja una plaza que esté libre.");
	}else {
		System.out.println("Plaza ocupada con éxito.");

	}
	parking[fila][columna]='O';
}
private static void liberarParking(int NUM_FILAS,int NUM_COLUMNAS) {
	
	System.out.println("Escoja la plaza.");

	int fila;
	int columna;
	
	System.out.println("Seleccione la fila:");
	fila=entrada.nextInt();
	System.out.println("Seleccione la columna:");
	columna=entrada.nextInt();
	
	if(parking[fila][columna]=='L') {
		System.out.println("Escoja una plaza ocupada.");
	}else {
		System.out.println("Plaza liberada con éxito.");

	}
	parking[fila][columna]='L';
}
private static void verParking(int NUM_FILAS,int NUM_COLUMNAS) {
	
	for(int fila=0;fila<NUM_FILAS;fila++) {
	for(int columna=0;columna<NUM_COLUMNAS;columna++) {
		System.out.print(parking[fila][columna]+" ");
	}
	System.out.println("");
	}
}
}