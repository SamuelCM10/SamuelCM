package ejs_U4;

public class U4_Ej_5 {
	
	public static void main(String[] args) {
		
		int a=0;
		int num1=1;
		int num2=1;
		
		System.out.println(num1);
		System.out.println(num2);
		mostrarSecuencia(a, num1, num2);
			
	}
	private static void mostrarSecuencia(int a, int num1, int num2) {
			
			for(int i=0; i<8; i++) {
				a=num1;
				num1=num2;
				num2=a+num1;
				System.out.println(num2);
			}
			
		}
	
}