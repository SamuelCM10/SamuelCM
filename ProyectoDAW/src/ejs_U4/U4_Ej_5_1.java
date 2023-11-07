package ejs_U4;

public class U4_Ej_5_1 {

		public static int limit=8;
		public static int num1=1;
		public static int num2=1;
		public static int a;
		public static int serie=1;
		
	
	public static void main(String[] args) {
		
		System.out.println(num1);
		System.out.println(num2);
		mostrarSecuencia();
			
	}
	private static void mostrarSecuencia() {
		
		while (serie<=limit) {

		++serie;	
		a=num1;
		num1=num2;
		num2=a+num1;
		System.out.println(num2);
		
		}
	}
}