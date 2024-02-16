package unidad8.ejemplos.interaz.mascotas;

public class Gato extends Animal implements Mascota {

	private String codigo;
	private String raza;
	
	public Gato (Sexo sexo, String codigo, String raza) {
		super(sexo);
		this.raza = raza;
		this.codigo = codigo;
	}
	public Gato (Sexo sexo, String codigo) {
		super(sexo);
		this.raza = "Siamés";
		this.codigo = codigo;
	}
	public Gato (String codigo) {
		super(Sexo.HEMAFRODITA);
		this.raza = "Siamés";
		this.codigo = codigo;
	}
	@Override
	public String getCodigo() {
		return codigo;
	}
	@Override
	public void hacerRuido() {
		this.maullar();
		this.ronronea();
		
	}
	private void ronronea() {
		System.err.println("Prrrrrr");
	}
	private void maullar() {
		System.err.println("Miau");
	}
	@Override
	public void come(String comida) {
		if(comida.equals("pescado")) {
			ronronea();
		}else {
			System.out.println("Tu padre");
			maullar();
		}
	}
	@Override
	public void peleaCon(Animal contrincante) {
		
		if(this.getSexo()==Sexo.HEMBRA) {
			System.out.println("Echa pa'llá");
		}else if(contrincante.getSexo()==Sexo.HEMBRA) {
			System.out.println("Mientras no me toces el rancho...");
		}else {
			System.out.println("Te enchufo");
		}
		
	}
	public String toString() {
		return super.toString()+
				"Raza: "+this.raza+"\n******";
	}
}
