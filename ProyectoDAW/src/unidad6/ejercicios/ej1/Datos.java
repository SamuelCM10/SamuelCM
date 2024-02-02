package unidad6.ejercicios.ej1;

public class Datos {

	public static void main(String[] args) {
	
		DatosPersonales Empleado1 = new DatosPersonales("Tomás", "Calle Góngora", 54, "111222333");
		Empleado1.imprimirDatos();
		
		Empleado1.setDireccion("Calle Jazmín");
		Empleado1.imprimirDatos();
		
		Empleado1.setTlf("444555666");
		Empleado1.imprimirDatos();

	}

}
