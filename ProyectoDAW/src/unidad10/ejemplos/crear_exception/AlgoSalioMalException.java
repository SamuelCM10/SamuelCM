package unidad10.ejemplos.crear_exception;

public class AlgoSalioMalException extends Exception{

	public AlgoSalioMalException(String mensaje) {
		super(mensaje);
	}
	
	public AlgoSalioMalException(String mensaje, Throwable causa) {
		super(mensaje,causa);
		
	}
}
