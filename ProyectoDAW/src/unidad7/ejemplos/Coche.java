package unidad7.ejemplos;

public class Coche {

	private String bastidor;
	private String marca;
	private String modelo;
	private int anioModelo;
	private int numPuertas;
	private String color;
	private String tipo_motor;
	private int cc;
	private int potencia;
	private double peso;
	private char emisiones;
	private double precio;
	
	public Coche() {
		bastidor="Sin bastidor";
		marca="Sin marca";
		modelo="Sin modelo";
	}
	public Coche(String bastidor,String marca,String modelo,int anioModelo,String color) {
		this.bastidor=bastidor;
		this.bastidor=marca;
		this.bastidor=modelo;
		this.anioModelo=anioModelo;
		this.color=color;
	}
	public String toString() {
		String informacion = "";
		informacion="-----Información coche-----\n";
		informacion="Bastidor: "+bastidor+"\n";
		informacion="Marca: "+marca+"\n";
		informacion="Modelo: "+modelo+"\n";
		return informacion;
	}
	public void setBastidor(String bastidor) {
		this.bastidor= bastidor;
	}
	public String getBastidor() {
		return bastidor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnioModelo() {
		return anioModelo;
	}
	public void setAnioModelo(int anioModelo) {
		this.anioModelo = anioModelo;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo_motor() {
		return tipo_motor;
	}
	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getEmisiones() {
		return emisiones;
	}
	public void setEmisiones(char emisiones) {
		this.emisiones = emisiones;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
