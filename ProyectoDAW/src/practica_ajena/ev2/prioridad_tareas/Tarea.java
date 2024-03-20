package practica_ajena.ev2.prioridad_tareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Ejercicio 6

public class Tarea {
    // Enumerador para los niveles de prioridad
    enum Priority {
        HIGH, MEDIUM, LOW
    }

    private String name;
    private LocalDate deadline;
    private Priority priority;

    public Tarea(String name, LocalDate deadline, Priority priority) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    // Método toString
    @Override
    public String toString() {
        return "Task [name=" + name + ", deadline=" + deadline + ", priority=" + priority + "]";
    }

    // Método estático para obtener tareas vencidas antes de una fecha especificada
    public static List<Tarea> getTasksBeforeDeadline(List<Tarea> tasks, LocalDate date) {
        List<Tarea> overdueTasks = new ArrayList<>();
        for (Tarea task : tasks) {
            if (task.getDeadline().isBefore(date)) {
                overdueTasks.add(task);
            }
        }
        return overdueTasks;
    }
 }