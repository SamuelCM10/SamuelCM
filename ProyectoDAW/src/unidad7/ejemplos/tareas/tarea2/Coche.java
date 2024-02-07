package unidad7.ejemplos.tareas.tarea2;

public class Coche {

	private Motor motor;
	private String marca;
	private String modelo;
	private double precioAcumulado;
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = null;
		this.precioAcumulado = 0;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void acumularAveria (double costeAveria) {
		precioAcumulado = precioAcumulado + costeAveria;
	}

	public Motor getMotor() {
		return motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecioAcumulado() {
		return precioAcumulado;
	}
}
