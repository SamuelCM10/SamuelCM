package ejs_U3;

import java.util.Scanner;

public class QueHayQueSepararlos {

	public static void main(String[] args) {
		
		int numHoras=0;
		double sueldo=0;
		
		Scanner entrada=  new Scanner (System.in);
		System.out.println("Introduce el numero de horas:"+numHoras);
		numHoras=entrada.nextInt();
		
		if(numHoras<=40) {
			sueldo=numHoras*12.5;
		}else if(numHoras<=48) {
			sueldo=40*12.5+(numHoras-40)*25;
		}else {
			sueldo=40*12.5+8*12.5+(numHoras-48)*37.5;
		}entrada.close();
	}

}
