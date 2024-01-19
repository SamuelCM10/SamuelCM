package unidad6.ejemplos.enumerados;

public class TestJuegoCartas2 {

	public static void main(String[] args) {
		
		JuegoCartas2 carta1 = new JuegoCartas2(Palo.PALO_CORAZONES,7);
		System.out.println("La carta es "+carta1.getPuntos()+" de"+" "+carta1.getNombrePalo());
	}

}
