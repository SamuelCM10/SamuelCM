package practica_ajena.ev2.blnc;

public class Blnc {
//Diseña un sistema para gestionar diferentes tipos de empleados en una empresa. Cada empleado tiene un nombre, un salario base y un método para calcular el salario total. Se distinguen tres tipos de empleados: asalariado, por horas y a comisión. Los empleados asalariados reciben un salario fijo mensual, los empleados por horas reciben un salario por hora trabajada, y los empleados a comisión reciben un salario base más una comisión por ventas. Implementa este sistema utilizando herencia y una interfaz para el cálculo del salario total.
	/*
	// Interfaz para calcular el salario total
	interface Calculable {
	    double calcularSalario();
	}

	// Clase base Empleado
	abstract class Empleado implements Calculable {
	    protected String nombre;
	    protected double salarioBase;

	    public Empleado(String nombre, double salarioBase) {
	        this.nombre = nombre;
	        this.salarioBase = salarioBase;
	    }
	}

	// Clase para empleados asalariados
	class Asalariado extends Empleado {
	    public Asalariado(String nombre, double salarioBase) {
	        super(nombre, salarioBase);
	    }

	    @Override
	    public double calcularSalario() {
	        return salarioBase;
	    }
	}

	// Clase para empleados por horas
	class PorHoras extends Empleado {
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

	// Clase para empleados a comisión
	class AComision extends Empleado {
	    private double ventas;
	    private double comision;

	    public AComision(String nombre, double salarioBase, double ventas, double comision) {
	        super(nombre, salarioBase);
	        this.ventas = ventas;
	        this.comision = comision;
	    }

	    @Override
	    public double calcularSalario() {
	        return salarioBase + (ventas * comision);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Crear instancias de diferentes tipos de empleados
	        Empleado asalariado = new Asalariado("Juan", 2000);
	        Empleado porHoras = new PorHoras("María", 0, 40, 10);
	        Empleado aComision = new AComision("Pedro", 1500, 5000, 0.05);

	        // Calcular salario total de cada empleado
	        System.out.println("Salario total de " + asalariado.nombre + ": " + asalariado.calcularSalario());
	        System.out.println("Salario total de " + porHoras.nombre + ": " + porHoras.calcularSalario());
	        System.out.println("Salario total de " + aComision.nombre + ": " + aComision.calcularSalario());
	    }
	    
	    */
	//***************************************************************************
	//Diseña un programa para calcular el área y el perímetro de diferentes formas geométricas: cuadrados y círculos. Implementa una interfaz común para todas las formas que defina métodos para calcular el área y el perímetro, y luego implementa clases para cada forma geométrica que hereden de esta interfaz.
	
	/*
	 // Interfaz para formas geométricas
interface FormaGeometrica {
    double calcularArea();
    double calcularPerimetro();
}

// Clase base para formas geométricas
abstract class Forma implements FormaGeometrica {
    // Métodos comunes para todas las formas
}

// Clase para cuadrados
class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Clase para círculos
class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear instancias de formas geométricas
        FormaGeometrica cuadrado = new Cuadrado(5);
        FormaGeometrica circulo = new Circulo(3);

        // Calcular área y perímetro de cada forma
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
    }
}

	 */
	//*****************************************************************************************************
	/*Diseña un programa para gestionar una lista de contactos. Cada contacto tiene un nombre y un número de teléfono. Implementa las siguientes funcionalidades:

Permitir agregar nuevos contactos.
Permitir buscar un contacto por su nombre y mostrar su número de teléfono.
Permitir eliminar un contacto.
Mostrar la lista de todos los contactos.
	
	/*
	 * import java.util.*;

public class GestionContactos {
    public static void main(String[] args) {
        // Crear un mapa para almacenar los contactos (nombre -> número de teléfono)
        Map<String, String> contactos = new HashMap<>();

        // Agregar algunos contactos
        contactos.put("Juan", "123456789");
        contactos.put("María", "987654321");
        contactos.put("Pedro", "456789123");

        // Mostrar todos los contactos
        System.out.println("Lista de contactos:");
        for (Map.Entry<String, String> entry : contactos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Buscar un contacto por nombre
        String nombreBuscado = "María";
        if (contactos.containsKey(nombreBuscado)) {
            System.out.println("Número de teléfono de " + nombreBuscado + ": " + contactos.get(nombreBuscado));
        } else {
            System.out.println("No se encontró el contacto con nombre " + nombreBuscado);
        }

        // Eliminar un contacto
        String nombreEliminar = "Pedro";
        contactos.remove(nombreEliminar);
        System.out.println("Contacto eliminado: " + nombreEliminar);

        // Mostrar la lista actualizada de contactos
        System.out.println("Lista de contactos actualizada:");
        for (Map.Entry<String, String> entry : contactos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

	*/
	//*******************************************************************************************
	/*Diseña un programa para gestionar el inventario de productos en stock de una tienda. Cada producto tiene un nombre, un precio y una cantidad disponible. Implementa las siguientes funcionalidades:

Permitir agregar nuevos productos al inventario.
Permitir buscar un producto por su nombre y mostrar su precio y cantidad disponible.
Permitir actualizar la cantidad disponible de un producto.
Mostrar la lista de todos los productos en stock.
*/
	
	/*
	 * import java.util.*;

public class GestionInventario {
    public static void main(String[] args) {
        // Crear una lista para almacenar los productos en stock
        List<Producto> inventario = new ArrayList<>();

        // Agregar algunos productos al inventario
        inventario.add(new Producto("Laptop", 1000, 5));
        inventario.add(new Producto("Teléfono", 500, 10));
        inventario.add(new Producto("Tablet", 300, 8));

        // Mostrar todos los productos en stock
        System.out.println("Inventario:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }

        // Buscar un producto por nombre
        String nombreBuscado = "Teléfono";
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombreBuscado)) {
                System.out.println("Producto encontrado:");
                System.out.println(producto);
                break;
            }
        }

        // Actualizar la cantidad disponible de un producto
        String nombreActualizar = "Tablet";
        int nuevaCantidad = 15;
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombreActualizar)) {
                producto.setCantidadDisponible(nuevaCantidad);
                System.out.println("Cantidad de " + nombreActualizar + " actualizada a " + nuevaCantidad);
                break;
            }
        }

        // Mostrar el inventario actualizado
        System.out.println("Inventario actualizado:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}

class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + "]";
    }
}

	 */
	
	
	}

	
