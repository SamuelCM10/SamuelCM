package practica_ajena.ev2.gestion_empleados_plus;

public class PorComision extends Empleado {
    private double ventas;
    private double comision;

    public PorComision(String nombre, double salarioBase, double ventas, double comision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * comision);
    }
}