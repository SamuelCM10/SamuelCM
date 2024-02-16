package unidad8.ejemplos.interaz.mascotas;

public class Perro extends Animal implements Mascota{

	private String codigo;
	
	public Perro(Sexo sexo, String codigo) {
		super(sexo);
		this.codigo = codigo;
	}
	public Perro(String codigo) {
		super();
		this.codigo = codigo;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		
	}
	private void ladra() {
		System.out.println("Wau wau");
	}

	@Override
	public void come(String comida) {
		if(comida.equals("carne")) {
			System.out.println("Gracias");
		}else {
			System.out.println("Solo cmo carne");
		}
		
	}

	@Override
	public void peleaCon(Animal contrincante) {
		if(contrincante.getClass().getSimpleName().equals("Perro")) {
			System.out.println("Te enchufo");
		}else {
			System.out.println("La violencia no soluciona nada");
		}
		
	}
}
