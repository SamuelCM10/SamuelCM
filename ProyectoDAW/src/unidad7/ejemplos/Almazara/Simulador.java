package unidad7.ejemplos.Almazara;

import java.util.Random;

public class Simulador {
	// Genera una cantidad aleatoria dentro de un rango dado
    public static double generarCantidadAleatoria(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    // Genera un porcentaje aleatorio dentro de un rango dado
    public static double generarPorcentajeAleatorio(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    // Aplica un porcentaje a una cantidad dada
    public static double aplicarPorcentaje(double cantidad, double porcentaje) {
        return cantidad * porcentaje;
    }
}
