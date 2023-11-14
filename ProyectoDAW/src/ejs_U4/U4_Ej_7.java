package ejs_U4;

import java.util.Scanner;

public class U4_Ej_7 {

	public static int num;
	public static int OPMIN=77;
	public static int OPMAX=98;
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Inserte un número");
		num=entrada.nextInt();
		estaDentro(num);
		entrada.close();

	}
	private static boolean estaDentro(int num) {
		
		if(num>=OPMIN&&num<=OPMAX) {
		System.out.println("Dentro de rango");
		return true;
		
		}else {
			System.out.println("Fuera de rango");
			return false;
		}
	}

}
