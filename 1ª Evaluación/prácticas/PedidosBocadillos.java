package prácticas;

import java.util.Scanner;

public class PedidosBocadillos {

	//numero de bocadillos
	public static int nBocadillosJamon=0;
	public static int nBocadillosQueso=0;
	public static int nBocadillosMixto=0;
	public static int nBocadillosVegetal=0;
	
	//precios
	public static final double pJamon=3.50;
	public static final double pQueso=3.00;
	public static final double pMixto=4.00;
	public static final double pVegetal=3.50;
	
	
	//precios totales
	public static double ptJamon=0;
	public static double ptQueso=0;
	public static double ptMixto=0;
	public static double ptVegetal=0;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String option;
		
		System.out.println("----- Pedidos Bocadillos -----");
		System.out.println("a. Bocadillo de jamón - 3.50€");
		System.out.println("b. Bocadillo de queso - 3.00€");
		System.out.println("c. Bocadillo mixto - 4.00€");
		System.out.println("d. Bocadillo vegetal - 3.50€");
		System.out.println("e. Salir");
		
		do {
			
			option= entrada.next();
			
			switch(option) {
				case"a":
					System.out.println("Ingrese la cantidad de bocadillos:");
					nBocadillosJamon=entrada.nextInt();
					bocadilloJamon(nBocadillosJamon);
				break;
				case"b":
					System.out.println("Ingrese la cantidad de bocadillos:");
					nBocadillosQueso=entrada.nextInt();
					bocadilloQueso(nBocadillosQueso);
				break;
				case"c":
					System.out.println("Ingrese la cantidad de bocadillos:");
					nBocadillosMixto=entrada.nextInt();
					bocadilloMixto(nBocadillosMixto);
				break;
				case"d":
					System.out.println("Ingrese la cantidad de bocadillos:");
					nBocadillosVegetal=entrada.nextInt();
					bocadilloVegetal(nBocadillosVegetal);
				break;
				case"e":
					factura();
					
				break;
				default:
					System.out.println("Opción no válida.");
				break;
			}
				
			
		}while(option!="e");
		entrada.close();

		
	}
	//Calcular coste de los bocadillos de jamón
	private static void bocadilloJamon(int nBocadillosJamon) {
		ptJamon=nBocadillosJamon*pJamon;
	}
	//Calcular coste de los bocadillos de queso
	
	private static void bocadilloQueso(int nBocadillosQueso) {
		System.out.println("Ingrese la cantidad de bocadillos:");
		ptQueso=nBocadillosQueso*pQueso;
	}
	//Calcular coste de los bocadillos mixtos
	
	private static void bocadilloMixto(int nBocadillosMixto) {
		System.out.println("Ingrese la cantidad de bocadillos:");
		ptMixto=nBocadillosMixto*pMixto;
	}
	//Calcular coste de los bocadillos vegetales
	
	private static void bocadilloVegetal(int nBocadillosVegetal) {
		System.out.println("Ingrese la cantidad de bocadillos:");
		ptVegetal=nBocadillosVegetal*pVegetal;
	}
	//Factura de todos los bocadillos
	private static void factura() {
		System.out.println("Bocadillos de jamón: "+nBocadillosJamon);
		System.out.println("Precio a pagar:"+ptJamon);
		System.out.println("Bocadillos de queso: "+nBocadillosQueso);
		System.out.println("Precio a pagar:"+ptQueso);
		System.out.println("Bocadillos mixtos: "+nBocadillosMixto);
		System.out.println("Precio a pagar:"+ptMixto);
		System.out.println("Bocadillos vegetales: "+nBocadillosVegetal);
		System.out.println("Precio a pagar:"+ptVegetal);
	}
}
