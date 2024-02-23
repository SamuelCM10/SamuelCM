package unidad8.ejemplos.tarea3;

public class Caja extends Contenedores {


	
	public Caja(String referencia, int alto, int ancho) {
		super(referencia, alto, ancho);
		
	}

	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}
	
	@Override
	public int getSuperficie() {
		return ancho*alto;
	}
	
}
