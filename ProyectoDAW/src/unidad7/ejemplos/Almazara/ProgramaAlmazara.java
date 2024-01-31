package unidad7.ejemplos.Almazara;


public class ProgramaAlmazara {

	public static void main(String[] args) {
		
		ProcesoAlmazara procesoAlmazara = new ProcesoAlmazara(10);
		
		ProcesoAlmazara[] procesosAlmazara = new ProcesoAlmazara[10];
		
		for(int i=0;i<10;i++) {
			procesosAlmazara [i] = new ProcesoAlmazara();
			System.out.println("Proceso creado");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("_____________________");
			procesosAlmazara[i].mostrarDatos();
			Thread.sleep(2000);
		}
		
		procesoAlmazara.mostrarDatos();

		
	}

}
