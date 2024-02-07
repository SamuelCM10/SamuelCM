package unidad7.ejemplos.tareas.tarea2;

public class Motor {
	
	private int l;
	private int CV;
	
	public Motor(int CV) {
		this.CV = CV;
		this.l = 0;
	}

	public int getL() {
		return l;
	}

	public int getCV() {
		return CV;
	}

	public void setL(int l) {
		this.l = l;
	}
	
}
