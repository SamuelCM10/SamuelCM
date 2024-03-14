package practica_ajena.ev2.gestion_empleados;

import java.util.ArrayList;
import java.util.List;

//Ejercicio 2

public class ProgramaEmpleados {

	public static void main(String[] args) {

		Empleado Empleado1 = new Empleado("Armando", 23, "Junior", 1200);
		Empleado Empleado2 = new Empleado("Pablo", 41, "Senior", 2400);
		Empleado Empleado3 = new Empleado("Estefanía", 32, "Contabilidad", 1400);
		Empleado Empleado4 = new Empleado("Alba", 29, "RRHH", 2100);

		List<Empleado> empleados = new ArrayList<Empleado>();
	        
		empleados.add(Empleado1);
		empleados.add(Empleado2);
		empleados.add(Empleado3);
		empleados.add(Empleado4);
		
		
		for (Empleado Empleado : empleados) {
            System.out.println(Empleado.toString());
        }
		
		System.out.println(" ");
		
		double salarioPromedio = Empleado.mostrarPromedioSalario(empleados);
		System.out.println("El salario promedio de la plantilla es: " +salarioPromedio);
		
	}

}
