package unidad5.tarea6;

import java.util.Scanner;

public class Tarea6 {
	
	public static Scanner entrada = new Scanner (System.in);
	static final int NUM_VALDAS = 10;
	static final String[] ESTANTERIA_N1 = new String[NUM_VALDAS];
	static final String[] ESTANTERIA_N2 = new String[NUM_VALDAS];
	static final String[] ESTANTERIA_F1 = new String[NUM_VALDAS];
	static final String[] ESTANTERIA_F2 = new String[NUM_VALDAS];
	static final String[] ESTANTERIA_U1 = new String[NUM_VALDAS];
	static final String[] ESTANTERIA_U2 = new String[NUM_VALDAS];
	
	public static void main(String[] args) {
	
		inicializarEstanterias();
		mostrarEstanterias();
		
	}
private static void inicializarEstanterias() {
	int num=000;
	for(int i=0;i<ESTANTERIA_N1.length;i++) {
		ESTANTERIA_N1[i]="N"+num++;
	}
	for(int i=0;i<ESTANTERIA_N2.length;i++) {
		ESTANTERIA_N1[i]="N"+num++;
	}
	
}
private static void mostrarEstanterias() {
	for(int i=0;i<ESTANTERIA_N1.length;i++) {
	System.out.print(ESTANTERIA_N1[i]+"|");
	}
	System.out.println(" ");
	for(int i=0;i<ESTANTERIA_N2.length;i++) {
		System.out.print(ESTANTERIA_N1[i]+"|");
		}
}
}