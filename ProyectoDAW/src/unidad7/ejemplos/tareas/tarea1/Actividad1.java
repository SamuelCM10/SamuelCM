package unidad7.ejemplos.tareas.tarea1;

public class Actividad1 {

	public static void main(String[] args) {
		
		Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);

        System.out.println("Calificación media del alumno: " + profesor.calcularMedia(alumno));
    }
}