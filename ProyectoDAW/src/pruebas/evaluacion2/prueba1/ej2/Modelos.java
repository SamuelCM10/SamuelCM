package pruebas.evaluacion2.prueba1.ej2;

import java.security.SecureRandom;

public class Modelos {
	
	static int i = (int)(Math.random()*10);
	
	public static String []Marcas = {"Toyota","Ford","Honda","Chvrolet","Volkswagen",
			"BWM","Merdeces-Benz","Audi","Nissan","Hyndai","Kia",
			"Subaru","Mazda","Volvo","Jaguar","Porche",
			"Ferrari","Lamborghini","Tesla","Lexus","Seat","Opel"};
	
	public static String seleccionarModelo(String []Marcas, int i) {
		
		String modelo= String [i]Marcas;
		
		return modelo;
	}

}