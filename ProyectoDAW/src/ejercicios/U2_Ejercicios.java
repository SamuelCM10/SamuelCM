package ejercicios;

import java.util.Scanner;

public class U2_Ejercicios {

	public static void main(String[] args) {
	
	//Ejercicio 3
		System.out.println("Voy a aprender Java");
		System.out.println("cueste lo que cueste.");
	//Ejercicio 4
		byte hermanos=1;
		byte notaFinal=5;
		long pMundial= 788800000;
		int provinciaEspaña=1000000;
		byte pasajerosBus=64;
		byte puntosGasol=53;
		double priceChorizo= 2.50;
		short mundialEspaña=2010;
		byte cienPies=100;
		double seatPanda=4.500;
	//Ejercicio 5
		//a Si
		//b No, no puede empezar por número.
		//c No, & se reconoce como signo de puntuación.
		//d No, no puede empezar por_.
		//e Si
		//f Si
		//g No, no se pueden usar comillas.
		//h Si
		//i Si
	//Ejercicio 6
		//a byte
		//b float
		//c short
		//d float
		//e char
		//f string
		//g boolean
		//h string
		//i string
	//Ejercicio 7
	//Ejercicio 8
		final byte  EOF= -1;
		
		
		
		
		
		//9
		//21
		double kmDay;
		double priceLiter;
		double kmLiter;
		double parkTaxe;
		double peajeDay;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca los km totales recorridos en un día: ");
		kmDay= entrada.nextDouble();
		System.out.println("Introduzca el coste del litros de gasolina: ");
		priceLiter= entrada.nextDouble();
		System.out.println("Introduzca el promedio de km/l: ");
		kmLiter= entrada.nextDouble();
		System.out.println("Introduzca el coste por tarifas de estacionamiento al día: ");
		parkTaxe= entrada.nextDouble();
		System.out.println("Introduzca el coste por peajes diario: ");
		peajeDay= entrada.nextDouble();
		
		float costeTotal=kmDay*kmLiter*priceLiter+parkTaxe+peajeDay;
		System.out.println("Un viaje diario cuesta:"+costeTotal);
		
		
	
		
		//22
		//23
		
		

		

	}

}
