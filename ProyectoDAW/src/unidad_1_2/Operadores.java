package unidad_1_2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumero;
		int secondNumero;
		int thirdNumero;
		final double PI=3.14;
		int radio;
		double area;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce primer número:");
		firstNumero=entrada.nextInt();
		System.out.println("Introduce segundo número:");
		secondNumero=entrada.nextInt();
		System.out.println("Introduce tercer número:");
		thirdNumero=entrada.nextInt();
		
		int suma= firstNumero+secondNumero+thirdNumero;
		int resta= firstNumero-secondNumero-thirdNumero;
		int producto= firstNumero*secondNumero*thirdNumero;
		
		double media=suma/3;
		int modulo=suma%2;
		
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("El producto es:"+producto);
		System.out.println("La media es:"+media);
		System.out.println("El modulo 2 es:"+modulo);
		
		//suma++ directo
		suma=suma+1;
		resta=resta-1;
		System.out.println("La suma incrementada es:"+suma);
		System.out.println("La resta incrementada es:"+resta);
		
		//suma+=3 suma 3
		
		System.out.println("Introduzca radio:");
		radio=entrada.nextInt();
		area=PI*radio*radio;
		System.out.println("El área es:"+area);
		System.out.printf("El área es:%.1f",PI*radio*radio);

		
		
		entrada.close();
	}

}
