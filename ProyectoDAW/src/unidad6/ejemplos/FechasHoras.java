package unidad6.ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FechasHoras {

	public static void main(String[] args) {

		Date fecha = new Date();
		System.out.println(fecha);
		
		//Fechas con LocalDate
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
		
		System.out.println("");
		
		Month mes = fechaActual.getMonth();
		System.out.println("Mes: "+mes.getValue());
		System.out.println("Mes: "+fechaActual.getMonthValue());
		System.out.println("Día: "+fechaActual.getDayOfMonth());
		
		System.out.println("");
		
		LocalDate fechaPasado = LocalDate.of(2024, 1, 8);
		System.out.println(fechaPasado);
		LocalDate fechaFuturo = fechaPasado.plusYears(4);
		System.out.println(fechaFuturo);
		
		System.out.println("");
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("MM/yyyy");
		String fechaFormateada = fechaFuturo.format(formatoFecha);
		System.out.println("Fecha futura formateada/caducidad: "+fechaFormateada);
		
		System.out.println("");
		
		DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaLocal = LocalDate.parse("25-12-2023", formatoFecha2);
		System.out.println(fechaLocal);
		
		System.out.println("");
		
		System.out.println(fechaLocal.format(formatoFecha2));

		System.out.println("");
		
		//Horas
		LocalTime tiempo = LocalTime.now();
		System.out.println(tiempo);
		System.out.println(tiempo.toString());
		System.out.println("Hora: "+tiempo.getHour());
		System.out.println("Minuto: "+tiempo.getMinute());
		System.out.println("Dentro de 3 horas: "+tiempo.plusHours(3).getHour());
		
		System.out.println("");
		
		//Fecha y hora
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println(fechaHoraActual);
		
		LocalDateTime fechaHoraRecreo = LocalDateTime.of(2024,1,10,11,15);
		System.out.println("Recreo: "+fechaHoraRecreo);
		
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String fechaHoraCadena = fechaHoraRecreo.format(formatoFechaHora);
		System.out.println("Fecha y hora recreo formateada: "+fechaHoraCadena);
		
		//****************************
		LocalDateTime inicio = LocalDateTime.now();
		LocalDateTime fin = inicio.plusHours(2).plusMinutes(30);
		Duration duracion = Duration.between(inicio, fin);
		System.out.println(duracion.getSeconds());
		
	System.out.println("TARTERA GOZ CABRON");
	}

}
