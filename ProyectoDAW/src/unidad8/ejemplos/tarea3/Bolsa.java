package unidad8.ejemplos.tarea3;

public class Bolsa extends Contenedores {

	private double resistenciaMax;
	
	public Bolsa(String referencia, int alto,int ancho) {
		super(referencia, alto, ancho);
		
	}

	public double getResistenciaMax() {
		return resistenciaMax;
	}

	public void setResistenciaMax(double resistenciaMax) {
		this.resistenciaMax = resistenciaMax;
	}

	@Override
	public int getSuperficie() {
		int radio=getDiametro()/2;
		return(int) (Math.PI*radio*radio);
	}
	
	private int getDiametro() {
		return(int) ((2*ancho)/Math.PI);
	}
	
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}
	
}
