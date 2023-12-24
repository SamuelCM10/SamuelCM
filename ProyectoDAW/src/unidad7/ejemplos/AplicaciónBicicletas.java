package unidad7.ejemplos;

public class AplicaciónBicicletas {

	public static void main(String[] args) {
		
		Bicicleta bici = new Bicicleta(1,2,"ROJO","X34","Orbea");
		Bicicleta bici2 = new Bicicleta(2,4,"NEGRO","XTREME","BH");
		
		bici.imprimirDatos();
		
		bici2.setMarca("Orbeaa");
		//Esto es otra forma de definir el valor Marca.

	}

}
