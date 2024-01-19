package unidad6.ejemplos.enumerados;

public class TestJuegoCartas {

	public static void main(String[] args) {

		JuegoCartas carta1 = new JuegoCartas(JuegoCartas.PALO_CORAZONES,4);
		System.out.println("La carta es "+carta1.getPuntos()+" de"+" "+carta1.getNombrePalo());
	}

}
