package unidad8.ejemplos.abstractas;

public abstract class Vehiculo {

	private String fuenteAlimentacion;
	private int ruedas;
	protected int precio;
	
	public Vehiculo(String fuenteAlimentacion, int ruedas) {
		setFuenteAlimentacion(fuenteAlimentacion);
		setRuedas(ruedas);
	}
	
	
	public String getFuenteAlimentacion() {
		return fuenteAlimentacion;
	}


	public void setFuenteAlimentacion(String fuenteAlimentacion) {
		this.fuenteAlimentacion = fuenteAlimentacion;
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public void saludo() {
		System.out.println("Aplicación Vehículos");
	}
	
	public abstract double calcEficienciaCarburante();
	public abstract double calcDistanciaViaje();
}
