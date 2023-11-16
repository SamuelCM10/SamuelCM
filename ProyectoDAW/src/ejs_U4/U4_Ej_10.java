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
	
	public static void main(String[] args) {
	
	pedirTiempo1();
	pedirTiempo2();
	compararTiempos(pedirTiempo1(), pedirTiempo2());
	
	}
	private static String pedirTiempo1() {
		String t1;
	
		System.out.println("Introduzca las horas:");
		h1=entrada.nextInt();
		System.out.println("Introduzca los minutos:");
		m1=entrada.nextInt();
		System.out.println("Introduzca los segundos:");
		s1=entrada.nextInt();
	
		t1=h1+"'"+m1+"''"+s1;
		System.out.println(t1);
		return t1;
 }
	private static String pedirTiempo2() {
		String t2;
		
		System.out.println("Introduzca las horas:");
		h2=entrada.nextInt();
		System.out.println("Introduzca los minutos:");
		m2=entrada.nextInt();
		System.out.println("Introduzca los segundos:");
		s2=entrada.nextInt();
		
		t2=h2+"'"+m2+"''"+s2;
		System.out.println(t2);
		return t2;
	}
	private static String compararTiempos(String t1, String t2) {
		if(h1<=h2&&m1<=m2&&s1<s2) {
			System.out.println(t1);
			return t1;
		}
	}
}
