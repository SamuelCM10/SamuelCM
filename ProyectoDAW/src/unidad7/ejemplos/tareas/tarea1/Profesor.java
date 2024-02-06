package unidad7.ejemplos.tareas.tarea1;

import java.util.Random;

public class Profesor {
    private Random random;

    public Profesor() {
        random = new Random();
    }

    public void ponerNotas(Alumno alumno) {
        asignarCalificacionAleatoria(alumno.getAsignatura1());
        asignarCalificacionAleatoria(alumno.getAsignatura2());
        asignarCalificacionAleatoria(alumno.getAsignatura3());
    }

    private void asignarCalificacionAleatoria(Asignatura asignatura) {
        double calificacion = random.nextDouble() * 10; // Calificación aleatoria entre 0 y 1.0
        asignatura.setCalificacion(calificacion);// Calificación aleatoria entre 0 y 10 al MULTIPLICAR
    }

    public double calcularMedia(Alumno alumno) {
        double sumaCalificaciones = alumno.getAsignatura1().getCalificacion() +
                                    alumno.getAsignatura2().getCalificacion() +
                                    alumno.getAsignatura3().getCalificacion();
        return sumaCalificaciones / 3;
    }
}