package unidad6.ejemplos;

public class GeneradorAleatorioMath {

	public static void main(String[]args) {
		
		//Entre 0 y 1
		double numero = Math.random();
		System.out.println(numero);
		
		//Entre 0 y 9
		double numero2 = (Math.random()*10);
		System.out.println(numero2);
		
		//Entre 0 y 10
		double numero3 = (Math.random()*10+1);
		System.out.println(numero3);
	}
}
