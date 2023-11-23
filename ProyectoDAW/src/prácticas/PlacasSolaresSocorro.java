package prácticas;

import java.util.Scanner;

public class PlacasSolaresSocorro {

	public static int id;
	public static double gd;
	public static  int x;
	public static  int y;
	public static boolean activado=false;
	public static  String ori;
	
	public static final int NUM_PLACAS=8;
	public static final int NUM_X=8;
	public static final int NUM_Y=8;
	
	
	
	public static void main(String[] args) {
		
		
		int option;
		Scanner entrada = new Scanner (System.in);
		int [][] parcela=new int[NUM_X][NUM_Y];
		int[] PLACA=new int[NUM_PLACAS];
		double[] GD=new double[1];
		boolean[] ESTADO=new boolean[1];
		String[] ORI=new String[1];
		
		do{
			System.out.println("---------------Menú---------------");
			System.out.println("1.Registrar un panel solar");
			System.out.println("2.Consultar información del panel solar");
			System.out.println("3.Cambiar estado del panel solar");
			System.out.println("4.Calcular generación diaria total");
			System.out.println("5.Mostrar todas los paneles");
			System.out.println("6.Cambiar orientación de placa solar");
			System.out.println("7.Salir");
			
			option=entrada.nextInt();
			
			switch(option){
			case 1:
				datos1();
				System.out.println("Seleccione la ubicación (1-8):");
				System.out.println("x:");
				x=entrada.nextInt()-1;
				System.out.println("y:");
				y=entrada.nextInt()-1;
				System.out.println("Seleccione un número para identificar la placa (1-8):");
				id=entrada.nextInt();
				System.out.println("Seleccione su orientación (N-S-E-O):");
				ori=entrada.nextLine();
				
				parcela[x][y]=PLACA[id];
				PLACA[id]=gd;
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida");
			}
			
		}while(option!=7);

	}
	private static void datos1(int x, int y, int id) {
		System.out.println("Seleccione la ubicación (1-8):");
		System.out.println("x:");
		x=entrada.nextInt()-1;
		System.out.println("y:");
		y=entrada.nextInt()-1;
		System.out.println("Seleccione un número para identificar la placa (1-8):");
		id=entrada.nextInt();
	}
	private static void datos2() {
		
	}

}
