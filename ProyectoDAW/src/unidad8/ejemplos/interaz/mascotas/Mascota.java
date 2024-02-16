package unidad8.ejemplos.interaz.mascotas;

public interface Mascota {

	String getCodigo();
	void hacerRuido();
	void come(String comida);
	void peleaCon(Animal contrincante);
}
