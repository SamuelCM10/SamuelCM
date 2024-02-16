package unidad8.ejemplos.interaz.mascotas;

public class Animal {

	private Sexo sexo;
	
	public Animal() {
		sexo = Sexo.HEMBRA;
	}
	public Animal (Sexo sexo) {
		this.sexo = sexo;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public String toString() {
		return "Sexo: "+this.sexo+"\n";
	}
	public void duerme() {
		System.out.println("Zzzzzzzzzzz");
	}
}
