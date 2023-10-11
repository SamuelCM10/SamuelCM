package ejemplos;

public class Conversiones {

	public static void main(String[] args) {
		
		byte numeroByte;
		int numeroEntero = 2345678;
		float numeroFloat = 34.5678f;
		
		numeroByte=(byte)numeroEntero;
		String saludo="Nos vamos de puente";
		char caracter= 'b';
		
		
		
		System.out.println("Número byte: "+numeroByte);
		System.out.println("Número entero: "+numeroEntero);
		
		numeroEntero=(int)numeroFloat;
		
		System.out.println("Número float: "+numeroFloat);
		System.out.println("Número entero: "+numeroEntero);
	}

}
