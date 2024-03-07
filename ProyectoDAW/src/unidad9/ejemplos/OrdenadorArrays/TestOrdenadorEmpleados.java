package unidad9.ejemplos.OrdenadorArrays;

import java.util.Arrays;

public class TestOrdenadorEmpleados {

	public static void main(String[] args) {
		
		Empleado[] departamento = new Empleado[3];
		departamento[0] = new Empleado("Paco", 29000);
		departamento[1] = new Empleado("Pablo", 32000);
		departamento[2] = new Empleado("Pardo", 30000);

		mostrarEmpleados(departamento);
		Arrays.sort(departamento);
		System.out.println("Empleados ordenados:");
		mostrarEmpleados(departamento);
		
		
	}
	private static void mostrarEmpleados(Empleado[] empleados) {
	
		for(Empleado empleado:empleados) {
			System.out.println(empleado);
		}
	}

}
