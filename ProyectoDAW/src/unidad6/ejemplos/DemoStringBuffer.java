package unidad6.ejemplos;

public class DemoStringBuffer {

	public static void main(String[] args) {

		//Contenido inmutable, modificar crea otra nueva
		String cadenaString = new String("Programación");
		//Modifica la cadena ya creada, más lento, menos seguro respecto compatibilidad
		StringBuffer cadenaBuffer = new StringBuffer("Programación");
		//Modifica la cadena ya creada, más seguro, mayor compatibilidad, mayor velocidad
		StringBuilder cadenaBuilder= new StringBuilder("Programación");
		
		System.out.println("Cadena" + cadenaString);
		System.out.println("Cadena" + cadenaBuffer);
		System.out.println("Cadena" + cadenaBuilder);
		
		String cadenaStringMod = cadenaString.concat(" en DAW");
		cadenaBuffer.append("en DAW");
		cadenaBuilder.append("en DAW");
		
		System.out.println("Cadena:"+cadenaStringMod);
		System.out.println("Cadena:"+cadenaBuffer);
		System.out.println("Cadena:"+cadenaBuilder);
		
		cadenaBuffer.reverse();
		System.out.println(cadenaBuffer);
		cadenaBuffer.append("1987");
		System.out.println(cadenaBuffer);
		
		System.out.println("Longitud: "+cadenaBuffer.length());
		System.out.println("Capacidad: "+cadenaBuffer.capacity());

	}

}
