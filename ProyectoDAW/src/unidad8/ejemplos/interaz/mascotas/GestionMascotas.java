package unidad8.ejemplos.interaz.mascotas;

public class GestionMascotas {

	public static void main(String[] args) {
		
		Mascota garfield = new Gato(Sexo.MACHO,"8383");
		Mascota lisa = new Gato(Sexo.HEMBRA,"3838");
		Mascota kuki = new Perro(Sexo.HEMBRA,"6464");
		Mascota tupac = new Perro(Sexo.HEMBRA,"4646");
		
		System.out.println(garfield.getCodigo());
		System.out.println(lisa.getCodigo());
		System.out.println(kuki.getCodigo());
		System.out.println(tupac.getCodigo());

		garfield.come("pescado");
		lisa.come("hamburguesa");
		kuki.come("pescado");
		lisa.peleaCon((Gato)garfield);
		tupac.peleaCon((Perro)kuki);
		
		System.out.println(garfield);
		System.out.println(lisa);
	}

}
