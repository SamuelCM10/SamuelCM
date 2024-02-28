package pruebas.evaluacion1.recu1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner entrada = new Scanner (System.in);
	
	static final int NUM_DEPOT=3;
	static final int NUM_LECT=2;
	
	static final double [][] bodegaDia1 = new double[NUM_DEPOT][NUM_LECT];
	static final double [][] bodegaDia2 = new double[NUM_DEPOT][NUM_LECT];
	static final double [][] bodegaDia3 = new double[NUM_DEPOT][NUM_LECT];
	
	public static void main(String[] args) {
		
	int option;

		do{
			System.out.println("---------------Menú---------------");
			System.out.println("1.Recoger Datos");
			System.out.println("2.Calcular Medias");
			System.out.println("3.Mostrar Resultados");
			System.out.println("4.Salir");
			
			option=entrada.nextInt();
			
			switch(option){
			case 1:
				ingresarDatos();
				break;
			case 2:
			
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				
			}
			
		}while(option!=4);
		
	}
	
	private static void ingresarDatos() {
	
		int dia;
		
		System.out.println("Seleccione el día de la lectura: (1-3)");
		dia=entrada.nextInt();
	
		if(dia==1) {//Lecturas del día 1
			
			System.out.println("Ingrese temperatura Depósito 1:");
			double temp;
			temp=entrada.nextDouble();
			bodegaDia1[0][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 1: (70-80)");
			double hmd;
			hmd=entrada.nextDouble();
			bodegaDia1[0][1]=hmd;
			
			System.out.println("Ingrese temperatura Depósito 2:");
			temp=entrada.nextDouble();
			bodegaDia1[1][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 2: (70-80)");
			hmd=entrada.nextDouble();
			bodegaDia1[1][1]=hmd;
			
			System.out.println("Ingrese temperatura Depósito 3:");
			temp=entrada.nextDouble();
			bodegaDia1[2][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 3: (70-80)");
			hmd=entrada.nextDouble();
			bodegaDia1[2][1]=hmd;
			
		}else if(dia==2) {//Lecturas del día 2
			
			System.out.println("Ingrese temperatura Depósito 1:");
			double temp;
			temp=entrada.nextDouble();
			bodegaDia2[0][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 1: (70-80)");
			double hmd;
			hmd=entrada.nextDouble();
			bodegaDia2[0][1]=hmd;
			
			System.out.println("Ingrese temperatura Depósito 2:");
			temp=entrada.nextDouble();
			bodegaDia2[1][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 2: (70-80)");
			hmd=entrada.nextDouble();
			bodegaDia2[1][1]=hmd;
			
			System.out.println("Ingrese temperatura Depósito 3:");
			temp=entrada.nextDouble();
			bodegaDia2[2][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 3: (70-80)");
			hmd=entrada.nextDouble();
			bodegaDia2[2][1]=hmd;
			
		}else if(dia==3) {//Lecturas del día 3
			
			System.out.println("Ingrese temperatura Depósito 1:");
			double temp;
			temp=entrada.nextDouble();
			bodegaDia3[0][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 1: (70-80)");
			double hmd;
			hmd=entrada.nextDouble();
			bodegaDia3[0][1]=hmd;
			
			System.out.println("Ingrese temperatura Depósito 2:");
			temp=entrada.nextDouble();
			bodegaDia3[1][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 2: (70-80)");
			hmd=entrada.nextDouble();
			bodegaDia3[1][1]=hmd;
			
			System.out.println("Ingrese temperatura Depósito 3:");
			temp=entrada.nextDouble();
			bodegaDia3[2][0]=temp;
			
			System.out.println("Ingrese la humedadDepósito 3: (70-80)");
			hmd=entrada.nextDouble();
			bodegaDia3[2][1]=hmd;
			
		}else {
			System.out.println("Seleccione un día válido.");
		}
	
}

}