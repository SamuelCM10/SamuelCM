package unidad7.ejemplos.tareas.tarea2;

import java.util.Random;

public class Actividad2 {

	public static void main(String[] args) {
		
		Garaje garaje = new Garaje(0);
		
		Coche coche1 = new Coche("Seat", "Toledo");
		coche1.setMotor(new Motor(150));
		Coche coche2 = new Coche("Seat", "Panda");
		coche2.setMotor(new Motor(300));
		
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
            if (garaje.aceptarCoche(coche1, "aceite")) {
                double costeAveria = random.nextDouble() * 100;
                coche1.acumularAveria(costeAveria);
                if ("aceite".equals("aceite")) {
                    coche1.getMotor().setL(10);
                }
                garaje.devolverCoche();
            }

            if (garaje.aceptarCoche(coche2, "frenos")) {
                double costeAveria = random.nextDouble() * 100; 
                coche2.acumularAveria(costeAveria);
                garaje.devolverCoche();
            }
        }

        System.out.println("Información de los coches:");
        System.out.println("Coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Litros de aceite: " + coche1.getMotor().getL());
        System.out.println("Precio de las averías acumuladas: " + coche1.getPrecioAcumulado());
        
        System.out.println(" ");

        System.out.println("Coche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Litros de aceite: " + coche2.getMotor().getL());
        System.out.println("Precio de las averías acumuladas: " + coche2.getPrecioAcumulado());
    }
}