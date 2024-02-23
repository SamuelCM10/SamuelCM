package unidad8.ejemplos.tarea3;

public interface IContenedores {

	String getReferencia();
	int getVolumen();
	int volumenDisponible();
	int getResistencia();
	Producto[] getProductos();
	TipoContenedor getTipo();
	boolean meter(Producto producto);
	boolean resiste(Producto producto);
	int getSuperficie();
	
}
