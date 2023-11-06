package ejs_U4;

import java.util.Scanner;

public class U4_Ej_1_1 {

	public static int num1=0;
	public static int num2=0;
	public static int num3=0;
	public static int numeroMasPequeño;
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escriba un número: ");
		num1=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num2=entrada.nextInt();
		System.out.println("Escriba un número: ");
		num3=entrada.nextInt();
	
		numeroMasPequeño=numeroMenor(num1,num2,num3);
		System.out.println(numeroMasPequeño);
		entrada.close();
	}
	private static int numeroMenor(int num1, int num2, int num3) {
        if (num1<=num2&&num1<=num3) {
            return num1;
        } else if (num2<=num1&&num2<=num3) {
            return num2;
        } else {
            return num3;
        }
	}
}