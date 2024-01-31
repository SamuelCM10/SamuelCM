package unidad7.ejemplos.Almazara;

public class AlmazaraRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Almazara a1 = new Almazara(1, "Coria");
		Almazara a2 = new Almazara(2, "Navalmoral", 8);
		
		ProcesoAlmazara p1 = new ProcesoAlmazara();
		
		a1.mostrarDatos();
		a2.mostrarDatos();
		
		a1.addProceso(p1);
	}

}
