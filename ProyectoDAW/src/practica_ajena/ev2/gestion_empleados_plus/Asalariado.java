package practica_ajena.ev2.gestion_empleados_plus;

public class Asalariado extends Empleado {
    public Asalariado(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}