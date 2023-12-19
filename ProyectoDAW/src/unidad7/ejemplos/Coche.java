package unidad7.ejemplos;

public class Coche {

	private String marca="Sin marca";
	private String modelo="Sin modelo";
	private String color="No definido";
	private String matrícula="Sin matricular";
	private int id=0;
	private double km=0;
	private double peso=0;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void Coche() {
		this.marca="marca";
		this.modelo="modelo";
		this.color="color";
		this.matrícula="matrícula";
		this.id=0;
		this.km=0;
		this.peso=0;
	}
	public void imprimirCoche() {
		System.out.println("-----DATOS----");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Color: "+color);
		System.out.println("Matrícula: "+matrícula);
		System.out.println("Id: "+id);
		System.out.println("Peso: "+peso);
	}
}
