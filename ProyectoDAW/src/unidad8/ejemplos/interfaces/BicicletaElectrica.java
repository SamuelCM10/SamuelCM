package unidad8.ejemplos.interfaces;

public class BicicletaElectrica implements IVehiculosElectricos{

	private int nivelBateria;
	
	public BicicletaElectrica() {
		nivelBateria=50;
	}
	
	@Override
	public void cargar() {
		System.out.println("Cargando batería...");
		nivelBateria=100;
		System.out.println("Batería cargada. Nivel de batería: "+nivelBateria);
	}
	@Override
	public void descargar() {
		System.out.println("Descargando batería...");
		nivelBateria-=10;
		if(nivelBateria<10) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de descargar: "+nivelBateria);
	}
}