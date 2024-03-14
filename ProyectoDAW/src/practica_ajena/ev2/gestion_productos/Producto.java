package practica_ajena.ev2.gestion_productos;

import java.util.List;
import java.util.ArrayList;

class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
    }

    // Método para vender un producto
    public void vender() {
        if (stock > 0) {
            stock--;
            System.out.println("Producto vendido: " + nombre);
        } else {
            System.out.println("No hay stock disponible para el producto: " + nombre);
        }
    }

    // Método estático para calcular el valor total del inventario
    public static double calcularValorTotalInventario(List<Producto> productos) {
        double valorTotal = 0;
        for (Producto producto : productos) {
            valorTotal += producto.getPrecio() * producto.getStock();
        }
        return valorTotal;
    }
}
