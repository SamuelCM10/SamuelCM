package unidad10.ejemplos;

import javax.naming.spi.DirStateFactory.Result;

public class DemoDivision {

	public static void main(String[] args) {
	
		int a = 10;
		int b=0;
		
		double resultado = a/b;
		
		System.out.println("Resultado:"+resultado);
		
		try {
			
			resultado = a/b;
			
		}catch(ArithmeticException expection){
			
			System.out.println();
			System.out.println();
			System.err.println(expection.toString());
			resultado = 10;
			
		}finally {
			System.out.println("Gracias por participar");
		}

		System.out.println("Resultado: "+resultado);
		
	}

}
