package unidad10.ejemplos;

public class Programa {

	//Pasa la exception al metodo Main desde lanzarException
	
	public static void main(String[] args) {
		
		try {
			metodo1();
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
			
		}

	}

	public static void metodo1() throws IllegalAccessException{
		
		metodo2();
	}

	public static void metodo2() throws IllegalAccessException{
		
		lanzarException();
	}

	public static void lanzarException() throws IllegalAccessException{
		try {
			System.out.println("Lanzamos una Execption");
			throw new IllegalAccessException("Error producido en lanzarException");
		}catch(IllegalAccessException ex) {
			throw ex;
		}
	}
}
