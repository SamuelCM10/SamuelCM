package pruebas.evaluacion1.recu1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	static final int TAM_SERIE = 6;
	static final int[] serie1 = new int[TAM_SERIE];
	static final int[] serie2 = new int[TAM_SERIE];
	static final int[] serie3 = new int[12];
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		introducirSerie1();
		orednarSerie1(serie1);
		mostrarSerie1();
		
		introducirSerie2();
		orednarSerie2(serie2);
		mostrarSerie2();
		
		introducirSerie3();
		mostrarSerie3();
		
	}
	
	//Introducir por pantalla los valores de la 1ª serie.
	private static void introducirSerie1() {
		
		System.out.println("Introduzca 6 números enteros:");
		int num=0;
		int contador=0;
		do {
			num = entrada.nextInt();
			serie1[contador]=num;
			contador++;
		}while(contador!=TAM_SERIE);
	
	}
	
	//Introducir por pantalla los valores de la 2ª serie.
	private static void introducirSerie2() {
		
		System.out.println("Introduzca otros 6 números enteros:");
		int num=0;
		int contador=0;
		do {
			num = entrada.nextInt();
			serie2[contador]=num;
			contador++;
		}while(contador!=TAM_SERIE);
	
	}
	
	//Crea la 3ª serie ordenada.
	private static void introducirSerie3() {
		
		for(int i=0;i<6;i++) {
			serie3[i]=serie1[i];
		}
		for(int i=6;i<serie3.length;i++) {
			serie3[i]=serie2[i-6];
		}
			
		int tam = serie3.length;
		int tmp;
		for(int i=0;i<tam-1;i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(serie3[j]>serie3[j+1]) {
					tmp = serie3[j];
					serie3[j]=serie3[j+1];
					serie3[j+1]=tmp;
						
					}
				}
			}
			
		}
	
	//Imprime la 1ª serie.
	private static void mostrarSerie1() {
		
		System.out.println("---Serie 1---");
		
		for(int i=0;i<serie1.length;i++) {
			System.out.print(serie1[i]+" ");
		}
		System.out.println(" ");
	}
	
	//Imprime la 2ª serie.
	private static void mostrarSerie2() {
		
		System.out.println("---Serie 2---");
		
		for(int i=0;i<serie2.length;i++) {
			System.out.print(serie2[i]+" ");
		}
		System.out.println(" ");
	}
	
	//Imprime la 3ª serie.
	private static void mostrarSerie3() {
		
		System.out.println("---Serie 3---");
		
		for(int i=0;i<serie3.length;i++) {
			System.out.print(serie3[i]+" ");
		}
		System.out.println(" ");
	}
	
	//Ordena la 2ª serie.
	private static void orednarSerie2(int[] serie2) {
		
		int tam = serie2.length;
		int tmp;
		for(int i=0;i<tam-1;i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(serie2[j]>serie2[j+1]) {
					tmp = serie2[j];
					serie2[j]=serie2[j+1];
					serie2[j+1]=tmp;
					
				}
			}
		}
		
	}
	
	//Ordena la 1ª serie.
	private static void orednarSerie1(int[] serie1) {
		
		int tam = serie1.length;
		int tmp;
		for(int i=0;i<tam-1;i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(serie1[j]>serie1[j+1]) {
					tmp = serie1[j];
					serie1[j]=serie1[j+1];
					serie1[j+1]=tmp;
					
				}
			}
		}
		
	}
}