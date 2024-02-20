package unidad8.ejemplos.interfaces;

public class MainElectrico {

	public static void main(String[] args) {
		
		IVehiculosElectricos coche = new CocheElectrico();
		IVehiculosElectricos bici = new BicicletaElectrica();
		IVehiculosElectricos furgo = new FurgonetaElectrica();
		IVehiculosElectricos moto = new MotoElectrica();
		IVehiculosElectricos patin = new PatineteElectrico();
		
		coche.cargar();
		coche.descargar();
		bici.cargar();
		bici.descargar();
		furgo.cargar();
		furgo.descargar();
		moto.cargar();
		moto.descargar();
		patin.cargar();
		patin.descargar();

	}

}
