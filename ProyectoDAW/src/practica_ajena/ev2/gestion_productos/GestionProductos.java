package practica_ajena.ev2.gestion_productos;

import java.util.List;
import java.util.ArrayList;

public class GestionProductos {

	public static void main(String[] args) {
		// Creación de objetos Producto
        Producto producto1 = new Producto("Laptop", 1000, 10);
        Producto producto2 = new Producto("Teléfono", 500, 20);

        // Mostrar información de los productos
        System.out.println(producto1);
        System.out.println(producto2);

        // Vender algunos productos
        producto1.vender();
        producto2.vender();
        producto2.vender();

        // Calcular valor total del inventario
        List<Producto> inventario = new ArrayList<>();
        inventario.add(producto1);
        inventario.add(producto2);
        double valorTotalInventario = Producto.calcularValorTotalInventario(inventario);
        System.out.println("Valor total del inventario: $" + valorTotalInventario);
    }
}