package unidad7.ejemplos;

public class Banco {

	public static void main(String[] args) {

		TarjetaBancaria tarjeta1 = new TarjetaBancaria("1122334455667788",111);
		tarjeta1.setEntidad("BBVA");
		
		TarjetaBancaria tarjeta2 = new TarjetaBancaria();
		tarjeta2.setNumero("1111222233334444");
		tarjeta2.setCvv(444);
		tarjeta2.setEntidad("Santander");
		
		
		
		System.out.println(tarjeta1.getNumero());
		System.out.println(tarjeta1.setCvv());
		System.out.println(tarjeta1.setEntidad());
		
		System.out.println(tarjeta2.getNumero());
		System.out.println(tarjeta2.setCvv());
		System.out.println(tarjeta2.setEntidad());
		
		

	}

}
