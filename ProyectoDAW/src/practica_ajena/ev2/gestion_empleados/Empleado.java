package practica_ajena.ev2.gestion_empleados;

import java.util.List;

//Ejercicio 1

public class Empleado {

	private String nombre;
	private int edad;
	private String puesto;
	private double salario;
	
	public Empleado (String nombre, int edad, String puesto, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public static double mostrarPromedioSalario (List<Empleado> empleados) {

		double totalSalario = 0;
        for (Empleado empleado : empleados) {
            totalSalario += empleado.getSalario();
        }
        return totalSalario / empleados.size();
}
	@Override
    public String toString() {
        return "Empleado: " + nombre + " - " + "Edad: " + edad + " - " + "Puesto: " + puesto + " - " + "Salario: " + salario + "€";
    }
}

