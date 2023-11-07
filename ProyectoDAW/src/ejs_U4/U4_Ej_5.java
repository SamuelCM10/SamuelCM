package ejs_U4;

public class U4_Ej_5 {

		public static int num1=1;
		public static int num2=1;
		public static int a;
		public static int suma=num1+num2;
		public static int serie=10;
	
	public static void main(String[] args) {
		
		System.out.println(num1);
		System.out.println(num2);
		mostrarSecuencia(a, num1, num2);
			
	}
	private static void mostrarSecuencia(int a,int num1, int num2) {
		
		while (a<serie) {

			for(a=0, a<=10, a++) {
				System.out.println(suma);
			}
			
		}
	}
}