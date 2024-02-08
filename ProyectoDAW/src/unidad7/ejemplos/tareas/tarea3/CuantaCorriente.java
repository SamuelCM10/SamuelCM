package unidad7.ejemplos.tareas.tarea3;

public class CuantaCorriente {
	
	Titular titular = new Titular();
	private String numeroCuenta;
	private double saldo;
	
	public CuantaCorriente(Titular titular, String numeroCuenta) {
		super();
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = 15.3;
	}

	public Titular getTitular() {
		return titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double ingresarCantidad(double cantidad) {
		this.saldo = saldo + cantidad;
		return cantidad;
	}
	
}
