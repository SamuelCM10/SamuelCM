package ejercicios;

import java.util.Scanner;

public class U3_Ejercicios {

	public static void main(String[] args) {
		
//Ejecicio 1
		int numEj1;
		
System.out.println("------------1------------");
		System.out.println("Introduzca un número:");
		Scanner entrada = new Scanner(System.in);
		numEj1=entrada.nextInt();
		
		if(numEj1%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
//Ejercico 2
		int num1Ej2;
		int num2Ej2;
		
System.out.println("------------2------------");
		System.out.println("Introduzca un número");
		num1Ej2=entrada.nextInt();
		System.out.println("Introduzca otro número");
		num2Ej2=entrada.nextInt();
		if(num1Ej2<num2Ej2) {
			System.out.println(num2Ej2+", "+num1Ej2);
		}else {
			System.out.println(num1Ej2+", "+num2Ej2);
		}
		
//Ejercicio 3
		int num1Ej3;
		int num2Ej3;
		
System.out.println("------------3------------");
		System.out.println("Introduzca un número");
		num1Ej3=entrada.nextInt();
		System.out.println("Introduzca un número");
		num2Ej3=entrada.nextInt();
		if(num1Ej3>num2Ej3) {
			System.out.println(num1Ej3+" es mayor");
		}else {
			System.out.println(num2Ej3+" es mayor");
		}
//Ejercicio 4
		System.out.println("------------4------------");
		System.out.println("Introduzca un número");
		num1Ej3=entrada.nextInt();
		System.out.println("Introduzca un número");
		num2Ej3=entrada.nextInt();
		if(num1Ej3>num2Ej3) {
			System.out.println(num1Ej3+" es mayor");
		}if(num2Ej3>num1Ej3) {
			System.out.println(num2Ej3+" es mayor");
		}else {
			System.out.println("Los dos números son iguales");
		}
	
//Ejercicio 27
		int cantidad;
		int numBilletes500;
		int numBilletes200;
		int numBilletes100;
		int numBilletes50;
		int numBilletes20;
		int numBilletes10;
		int numBilletes5;
		
System.out.println("------------27------------");
		System.out.println("Introduzca la cantidad(múltiplo de 5):");
		cantidad=entrada.nextInt();
		if(cantidad>=500) {
			numBilletes500 = cantidad/500;
			cantidad = cantidad%500;
			System.out.println("Número de billetes 500: "+numBilletes500);
		}if(cantidad>=200) {
			numBilletes200 = cantidad/200;
			cantidad = cantidad%200;
			System.out.println("Número de billetes 200: "+numBilletes200);
		}if(cantidad>=100) {
			numBilletes100 = cantidad/100;
			cantidad = cantidad%100;
			System.out.println("Número de billetes 100: "+numBilletes100);
		}if(cantidad>=50) {
			numBilletes50 = cantidad/50;
			cantidad = cantidad%50;
			System.out.println("Número de billetes 50: "+numBilletes50);
		}if(cantidad>=20) {
			numBilletes20 = cantidad/20;
			cantidad = cantidad%20;
			System.out.println("Número de billetes 20: "+numBilletes20);
		}if(cantidad>=10) {
			numBilletes10 = cantidad/10;
			cantidad = cantidad%10;
			System.out.println("Número de billetes 10: "+numBilletes10);
		}if(cantidad>=5) {
			numBilletes5 = cantidad/5;
			cantidad = cantidad%5;
			System.out.println("Número de billetes 5: "+numBilletes5);
		}
		
		
	}
}
