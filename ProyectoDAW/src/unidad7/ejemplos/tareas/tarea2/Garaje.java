package unidad7.ejemplos.tareas.tarea2;

public class Garaje {

	private Coche coche;
	private String averia;
	private int cochesAtendidos;
	
	public Garaje(int cochesAtendidos) {
		this.cochesAtendidos = 0;
		this.coche = null;
		this.averia = "";
	}
	public void setAveria(String averia) {
		this.averia = averia;
	}
	public boolean aceptarCoche(Coche coche,String averia) {
		if(this.coche==null) {
			this.coche = coche;
			this.averia = averia;
			return true;
		}else {
			return false;
		}
	}
	
	public void devolverCoche() {
		this.cochesAtendidos++;
		this.coche = null;
		this.averia = "";
	}
}
