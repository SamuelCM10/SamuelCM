package practica_ajena.ev2.gestion_empleados_plus;

public class ProgramaEmpleadosPlus {

	public static void main(String[] args) {
        // Crear instancias de diferentes tipos de empleados
        Empleado asalariado = new Asalariado("Juan", 2000);
        Empleado porHoras = new PorHoras("María", 0, 40, 10);
        Empleado aComision = new PorComision("Pedro", 1500, 5000, 0.05);

        // Calcular salario total de cada empleado
        System.out.println("Salario total de " + asalariado.nombre + ": " + asalariado.calcularSalario());
        System.out.println("Salario total de " + porHoras.nombre + ": " + porHoras.calcularSalario());
        System.out.println("Salario total de " + aComision.nombre + ": " + aComision.calcularSalario());
    }
}