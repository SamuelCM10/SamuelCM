package ejercicios;

import java.util.Scanner;

public class U3_Ejercicios {

	public static void main(String[] args) {
		
//Ejecicio 1
		int num1;
		
System.out.println("------------1------------");

		System.out.println("Introduzca un número:");
		Scanner entrada = new Scanner(System.in);
		num1=entrada.nextInt();
		
		if(num1%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
//Ejercico 2
		int num2;
		
System.out.println("------------2------------");

		System.out.println("Introduzca un número");
		num1=entrada.nextInt();
		System.out.println("Introduzca otro número");
		num2=entrada.nextInt();
		if(num1<num2) {
			System.out.println(num2+", "+num1);
		}else {
			System.out.println(num1+", "+num2);
		}
		
//Ejercicio 3
System.out.println("------------3------------");

		System.out.println("Introduzca un número");
		num1=entrada.nextInt();
		System.out.println("Introduzca un número");
		num2=entrada.nextInt();
		if(num1>num2) {
			System.out.println(num1+" es mayor");
		}else {
			System.out.println(num2+" es mayor");
		}
//Ejercicio 4
System.out.println("------------4------------");

		System.out.println("Introduzca un número");
		num1=entrada.nextInt();
		System.out.println("Introduzca un número");
		num2=entrada.nextInt();
		if(num1>num2) {
			System.out.println(num1+" es mayor");
		}if(num2>num1) {
			System.out.println(num2+" es mayor");
		}else {
			System.out.println("Los dos números son iguales");
		}
//Ejercicio 5
System.out.println("------------5------------");

		System.out.println("Introduzca un numero:");
		num1=entrada.nextInt();
		System.out.println("Introduzca otro:");
		num2=entrada.nextInt();
		int suma=num1+num2;
		int producto=num1*num2;
		
		
		if(num1>num2) {
			System.out.print("La suma es: "+suma);
			System.out.print(" porque "+num1);
			System.out.println(" es mayor.");
		}else {
			System.out.print("El producto es: "+producto);
			System.out.print(" porque "+num2);
			System.out.println(" es mayor.");
		}
//Ejercicio 6
System.out.println("------------6------------");

		System.out.println("Introduce un número entre el 1 y el 99:");
		num1=entrada.nextInt();
		if(num1<10) {
			System.out.println("El número es de 1 dígito");
		}else if(num1>=10&&num1<=99) {
			System.out.println("El número es de 2 dígitos");
		}else if(num1>99) {
			System.out.println("El número es de más de dos dígitos");
		}
//Ejercicio 7 
System.out.println("------------7------------");	

	System.out.println("Introduce un número entre el 0 y el 99999:");
	num1=entrada.nextInt();
	if(num1<10&&num1>=0) {
		System.out.println("El número es de 1 dígito");
	}else if(num1>=10&&num1<=99) {
		System.out.println("El número es de 2 dígitos");
	}else if(num1>=100&&num1<=999) {
		System.out.println("El número es de 3 dígitos");
	}else if(num1>=1000&&num1<=9999) {
		System.out.println("El número es de 4 dígitos");
	}else if(num1>=10000&&num1<=99999) {
		System.out.println("El número es de 5 dígitos");
	}else if(num1>99999) {
		System.out.println("El número es de más de cinco dígitos");
	}else if(num1<0) {
		System.out.println("El número es negativo");
	}
//Ejercicio 8a	
System.out.println("------------8------------");	
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
