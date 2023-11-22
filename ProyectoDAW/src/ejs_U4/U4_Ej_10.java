package ejs_U4;

import java.util.Scanner;

public class U4_Ej_10 {

	static Scanner entrada = new Scanner(System.in);
	public static int h1;
	public static int m1;
	public static int s1;
	public static int h2;
	public static int m2;
	public static int s2;
	public static String t1;
	public static String t2;
	
	public static void main(String[] args) {
	
	pedirTiempo1();
	pedirTiempo2();
	compararTiempos();
	
	}
	private static String pedirTiempo1() {
		
		System.out.println("Introduzca las horas del primer tiempo:");
		h1=entrada.nextInt();
		System.out.println("Introduzca los minutos del primer tiempo:");
		m1=entrada.nextInt();
		System.out.println("Introduzca los segundos del primer tiempo:");
		s1=entrada.nextInt();
	
		t1=h1+"'"+m1+"'"+s1;
		System.out.println("Primer tiempo: "+t1);
		return t1;
 }
	private static String pedirTiempo2() {
		
		System.out.println("Introduzca las horas del segundo tiempo:");
		h2=entrada.nextInt();
		System.out.println("Introduzca los minutos del segundo tiempo:");
		m2=entrada.nextInt();
		System.out.println("Introduzca los segundos del segundo tiempo:");
		s2=entrada.nextInt();
		
		t2=h2+"'"+m2+"'"+s2;
		System.out.println("Segundo tiempo: "+t2);
		return t2;
	}
	private static void compararTiempos() {
		if((h1<=h2&&m1<=m2&&s1<s2)||(h1<=h2&&m1<m2)||(h1<h2)) {
			System.out.println("--------------------");
			System.out.println("1er tiempo: "+t1);
		}else {
			System.out.println("--------------------");
			System.out.println("1er tiempo: "+t2);

		}
	}
}
