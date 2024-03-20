package unidad10.ejemplos;

public class LanzamientoDemo {

	//METODOS CON EXCEPCIONES
	
	public static void main(String[] args) {
		
		try {
			lanzarExcep();
		} catch (IllegalAccessException ex) {
			System.out.println(ex.getMessage());;
		}
		//printStackTrace ----> INDICA TODAS LAS LINEAS DONDE FALLA
	}
	
	public static void lanzarExcep() throws IllegalAccessException {
		
		System.out.println("Lanzamos una excepción");
		throw new IllegalAccessException("Error producido en el método lanzarExcep");
		
	}
	
}
