package pruebas.evaluacion1.prueba2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

public static Scanner entrada=new Scanner(System.in);
public static int corredor;
public static int NUM_CORREDORES=10;
public static int[]meta=new int[NUM_CORREDORES];

public static void main(String[] args) {
		
		llegarMeta();
		
		
		
		

	}
private static void llegarMeta() {
	
	System.out.println("Introduzca el dorsal de los corredores:");
	
	do {
		for(int puesto=0;puesto<NUM_CORREDORES;puesto++) {
			corredor=entrada.nextInt();
			meta[puesto]=corredor;
			if(meta[puesto]==-1) {
				NUM_CORREDORES=meta[puesto];
			}
		}
		}while(corredor==-1);
}
}
