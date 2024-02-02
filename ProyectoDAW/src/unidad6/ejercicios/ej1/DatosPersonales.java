package unidad6.ejercicios.ej1;

public class DatosPersonales {

	private String nombre;
	private String direccion;
	private int edad;
	private String tlf;
	
	public DatosPersonales(String nombre, String direccion, int edad, String tlf) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.tlf = tlf;
	}
	public void imprimirDatos() {
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Dirección: "+direccion);
		System.out.println("Edad: "+edad);
		System.out.println("Tlf: "+tlf);
		System.out.println(" ");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	
}
