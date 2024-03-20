package practica_ajena.ev2.prioridad_tareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import practica_ajena.ev2.prioridad_tareas.Tarea.Priority;

//Ejercicio 6

public class ProgramaTarea {

	public static void main(String[] args) {
        // Creación de algunas tareas
        List<Tarea> tasks = new ArrayList<>();
        tasks.add(new Tarea("Hacer la compra", LocalDate.now().plusDays(2), Priority.MEDIUM));
        tasks.add(new Tarea("Enviar informe", LocalDate.now().minusDays(1), Priority.HIGH));
        tasks.add(new Tarea("Reunión con el cliente", LocalDate.now().plusWeeks(1), Priority.LOW));

        // Obtener tareas vencidas antes de una fecha específica
        LocalDate today = LocalDate.now();
        List<Tarea> overdueTasks = Tarea.getTasksBeforeDeadline(tasks, today);
        System.out.println("Tareas vencidas antes de hoy: " + overdueTasks);
    }
}