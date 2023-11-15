package unidad5;

import java.util.Scanner;

public class SolucionControlVendimia {

	static final int NUM_ZONAS=6;
	static Scanner entrada = new Scanner(System.in);
	static double[] zonas= new double[NUM_ZONAS];
	
	public static void main(String[] args) {
		
		int option=0;
		do {
			
			mostrarMenu();
			option=entrada.nextInt();
			operar(option);
			
		}while(option!=5);

	}
	private static void operar(int option) {
		switch(option){
		case 1:
			
			registrarPeso(pedirZona(), pedirPeso());
			
			break;
		case 2:
			
			System.out.println("El peso total es "+obtenerPesoTotal()+" kg.");
			
			break;
		case 3:
			
			cantidadPorZona(pedirZona());
			
			break;
		case 4:
			
			obtenerMediaPeso();
			break;
			
		case 5:
			
			salir();
			
			break;
		default:
			
			break;
		}
	}
	private static void salir() {
		System.out.println("Salien2...");
	}
	private static void obtenerMediaPeso() {
		double mediaPesos=obtenerPesoTotal()/6;
		System.out.println("La media de peso es "+mediaPesos+"kg.");
		
	}
	private static double obtenerPesoTotal() {
		double pesoTotal=0;
		for(int i=0;i<NUM_ZONAS;i++) {
			pesoTotal+=zonas[i];
		}
		return pesoTotal;
	}
	private static void cantidadPorZona(int zona) {
		System.out.println("La zona "+zona+"--->"+zonas[zona-1]);
		}
	
	private static void registrarPeso(int zona, double peso) {
		zonas[zona-1]=zonas[zona-1]+peso;
	}
	private static double pedirPeso() {
		double peso;
		System.out.println("Introduzca el peso:");
		peso=entrada.nextDouble();
		return peso;
	}
	private static int pedirZona() {
		
		boolean zonaCorrecta=false;
		int zona=0;
		
		do {
			
		System.out.println("Introduzca la zona(1-"+NUM_ZONAS+"):");
			
		zona=entrada.nextInt();
			
		if(zona<1||zona>NUM_ZONAS)
			System.out.println("Zona incorrecta");
		else {
			zonaCorrecta=true;
		}
			
		}while(!zonaCorrecta);
		return zona;
	}
	private static void mostrarMenu() {
	
		System.out.println("------------CONTROL VENDIMIA------------");
		System.out.println("1.Añadir cantidad a una zona");
		System.out.println("2.Obtener peso total");
		System.out.println("3.Cantidad por una zona");
		System.out.println("4.Media de peso");
		System.out.println("5.Salir");
}
}
