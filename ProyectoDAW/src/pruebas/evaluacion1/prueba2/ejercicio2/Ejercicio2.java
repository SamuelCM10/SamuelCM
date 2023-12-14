package pruebas.evaluacion1.prueba2.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

public static Scanner entrada=new Scanner(System.in);
//Cantidad de numeros que tendrán los boletos
public static int NUM_CASILLAS=6;
//La combinación ganadora
public static int primitiva[]= {1,2,3,4,5,6};
//El boleto que tengo
public static int[]boleto=new int[NUM_CASILLAS];

	public static void main(String[] args) {
		
		comprarBoleto();
		//comprarBoleto() sirve para establecer la combinación de mi boleto
		int aciertos=comprobarBoleto();
		//comprobarBoleto() compara mi boleto con la combinación ganadora
		//También me da el número de aciertos y los números acertados
		double recaudacion=pedirRecaudacion();
		//pedirRecaudacion() pide la cantidad que se ha recaudado para el sorteo
		premio(aciertos, recaudacion);
		//premio() da el resultado del sorteo en función del boleto que tengas
	}
	private static void comprarBoleto() {
		System.out.println("Introduzca los números de su boleto:");
		int numero;
		for(int casilla=0;casilla<NUM_CASILLAS;casilla++) {
			numero=entrada.nextInt();
			boleto[casilla]=numero;
		}
	}
	private static int comprobarBoleto() {
		int aciertos=0;
		for(int casilla=0;casilla<NUM_CASILLAS;casilla++) {
			if(boleto[casilla]==primitiva[casilla]) {
				aciertos++;
			}
		}
		System.out.println("Número de aciertos: "+aciertos);
		for(int casilla=0;casilla<NUM_CASILLAS;casilla++) {
			if(boleto[casilla]==primitiva[casilla]) {
				System.out.print(boleto[casilla]+"|");
			}
		}System.out.println(" ");
		return aciertos;
	}
	private static double pedirRecaudacion() {
		double recaudacion=0;
		System.out.println("Introduzca la recaudación del sorteo:");
		recaudacion=entrada.nextDouble();
	
		return recaudacion;
	}
	private static double premio(int aciertos,double recaudacion) {
		double resultado=0;
		double dedicadoPremios=(recaudacion*55)/100;
		if(aciertos<2) {
			System.out.println("Prueba otro año.");
		}else if(aciertos==3) {
			resultado=(dedicadoPremios*5)/100;
			System.out.println("Ha ganado: "+resultado+"€");
		}else if(aciertos==4) {
			resultado=(dedicadoPremios*15)/100;
			System.out.println("Ha ganado: "+resultado+"€");
		}else if(aciertos==5) {
			resultado=(dedicadoPremios*25)/100;
			System.out.println("Ha ganado: "+resultado+"€");
		}else if(aciertos==6) {
			resultado=(dedicadoPremios*50)/100;
			System.out.println("Ha ganado: "+resultado+"€");
		}
		return resultado;
	}
}
