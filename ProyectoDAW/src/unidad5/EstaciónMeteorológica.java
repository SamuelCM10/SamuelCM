package unidad5;

public class EstaciónMeteorológica {

	public static void main(String[] args) {
		
		int []temperaturas= {12,7,14,15,19,21,27,26,20,18,12,-5};
		int []lluvias= {28,6,48,89};
		int []humedad= {10,67,24,89,76,59};
		
		System.out.println("---Temperatura Media---");
		imprimirTemp(temperaturas, "º");
		
		System.out.println("---Lluvias por estación---");
		imprimirLluvia(lluvias, " dias");

		System.out.println("---Humedad Bimestral---");
		imprimirHumedad(humedad, "%");
	}
	private static void imprimirTemp(int[] datos, String unidad) {
		for(int i=0;i<datos.length;i++) {
			System.out.println("Mes "+(i+1)+": "+datos[i]+unidad);
		}
	}
	private static void imprimirLluvia(int[] datos, String unidad) {
		for(int i=0;i<datos.length;i++) {
			System.out.println("Estación "+(i+1)+": "+datos[i]+unidad);
		}
	}
	private static void imprimirHumedad(int[] datos, String unidad) {
		for(int i=0;i<datos.length;i++) {
			System.out.println("Par "+(i+1)+": "+datos[i]+unidad);
		}
	}
}
