package practica_ajena.ev1;

import java.util.Scanner;

public class Calculadora_Garaje {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int option;
		
		do{
			System.out.println("------------Calculadora------------");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Añadir potencia");
			System.out.println("6.Raíz cuadrada");
			System.out.println("7.Apagar");
			
		}while(option!=4);

	}

}
