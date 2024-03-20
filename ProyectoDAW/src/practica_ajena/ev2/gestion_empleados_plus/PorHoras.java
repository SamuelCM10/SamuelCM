package practica_ajena.ev2.gestion_empleados_plus;

public	class PorHoras extends Empleado {
    private int horasTrabajadas;
    private double salarioHora;

    public PorHoras(String nombre, double salarioBase, int horasTrabajadas, double salarioHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * salarioHora);
    }
}