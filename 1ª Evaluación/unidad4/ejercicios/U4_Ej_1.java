package unidad4.ejercicios;

import java.util.Scanner;

public class U4_Ej_1 {

	public static int num1=0;
	public static int num2=0;
	public static int num3=0;
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escriba un número: ");
		num1=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num2=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num3=entrada.nextInt();
	
		numeroMenor();
		entrada.close();
	}
	private static void numeroMenor() {
			if(num1>num2&&num1>num3&&num2>num3) {
				System.out.print(num3);
			
			}else if(num1>num2&&num1>num3&&num3>num2) {
				System.out.print(num2);
				
			}else if(num2>num1&&num2>num3&&num1>num3) {
				System.out.print(num3);
				
			}else if(num2>num1&&num2>num3&&num3>num1) {
				System.out.print(num1);
				
			}else if(num3>num1&&num3>num2&&num1>num2) {
				System.out.print(num2);
				
			}else if(num3>num2&&num3>num1&&num2>num1) {
				System.out.print(num1);
			
		}
	}
}