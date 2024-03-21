package unidad10.ejemplos.crear_exception;

public class Programa {

	public static void main(String[] args) {
		
		Programa programa = new Programa();
		
		try {
			
			programa.metodoQuePuedeLanzarException();
			
		}catch(AlgoSalioMalException ex) {
			
			System.out.println(ex.getMessage());
			System.out.println("Causa de la Exception: "+ex.getCause());
			ex.printStackTrace();
		}

	}

	public void metodoQuePuedeLanzarException() throws AlgoSalioMalException {
		
		boolean condicion=true;
		if(condicion) {
			throw new AlgoSalioMalException("Se ha producido un error",new IllegalAccessError());
		}
	}
}
