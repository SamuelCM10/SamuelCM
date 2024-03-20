package practica_ajena.ev2.gestion_empleados_plus;

abstract class Empleado implements Calculable {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
}