package ejs_U2;

import java.util.Scanner;

public class U2_Ejercicios {

	public static void main(String[] args) {
	
	//Ejercicio 3
		System.out.println("Voy a aprender Java");
		System.out.println("cueste lo que cueste.");
	System.out.println("-------------------------");
	//Ejercicio 4
		//byte
		//byte
		//long
		//int
		//byte
		//byte
		//double
		//short
		//byte
		//double
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
	//Ejercicio 8
		final byte EOF=-1;
		final byte MAXIMO=99;
		final byte CIERTO=1;
		final byte FALSO=0;
		final char ULTIMA_LETRA='z';
		final float PI=3.14159F;
		final String MENSAJE="Error en la entrada de datos";
	//Ejercicio 9
	//A)
		int n1 = 50;
		int n2 = 30;
    	int suma = 0;
    	int n3=10;

    	suma = n1 + n2;
    	System.out.print("La suma es " + suma);
    	suma = suma + n3;
    	System.out.println(" y la segunda suma es "+suma);
    //B)
		n1=5;
		n2=6;
    	suma=n1+n2;

    	System.out.println("La suma es: "+suma);
    //C
		int n=8;
    	int cuad=n*n;

    	System.out.println("El cuadrado de " +n+ " es: " + cuad);
    System.out.println("-------------------------");
	//Ejercicio 10
    	final byte n1Ej10=6;
    	final byte n2Ej10=9;
    	byte sumaEj10= n1Ej10+n2Ej10;
    	System.out.println(sumaEj10);
    System.out.println("-------------------------");
    //Ejercicio 11
    	byte nota1=8;
    	byte nota2=5;
    	byte nota3=6;
    	float promedio=((nota1+nota2+nota3)/3);
    	System.out.println(promedio);
    System.out.println("-------------------------");
    	
    	
		//21
		double kmDay;
		double priceLiter;
		double kmLiter;
		double parkTaxe;
		double peajeDay;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca los km totales recorridos en un día: ");
		kmDay= entrada.nextDouble();
		System.out.println("Introduzca el coste de un litro de gasolina: ");
		priceLiter= entrada.nextDouble();
		System.out.println("Introduzca el promedio de km/l: ");
		kmLiter= entrada.nextDouble();
		System.out.println("Introduzca el coste por tarifas de estacionamiento al día: ");
		parkTaxe= entrada.nextDouble();
		System.out.println("Introduzca el coste por peajes diario: ");
		peajeDay= entrada.nextDouble();
		
		double costeTotal=((kmDay/kmLiter)*priceLiter)+parkTaxe+peajeDay;
		System.out.println("Un viaje diario cuesta:"+costeTotal);
		entrada.close();
		
		
	
		
		//22
		//23
		
		

		

	}

}
