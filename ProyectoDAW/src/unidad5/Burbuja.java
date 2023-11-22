package unidad5;

public class Burbuja {

	public static void main(String[] args) {
		int[] arreglo= {62,23,10,20,9};
		System.out.println("Arreglo original");
		System.out.println("--------------------");
		mostrarArreglo(arreglo);
		ordenarPorBurbuja(arreglo);
		System.out.println(" ");
		System.out.println("--------------------");
		System.out.println("Arreglo ordenado");
		System.out.println("--------------------");
		mostrarArreglo(arreglo);
		System.out.println(" ");
		System.out.println("--------------------");

	}
	private static void mostrarArreglo(int[] arreglo) {
		for(int elemento:arreglo) {
			System.out.print(elemento+"|");
		}
	}
	private static void ordenarPorBurbuja(int[] arreglo) {
		int tam = arreglo.length;
		int tmp;
		for(int i=0;i<tam-1;i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(arreglo[j]>arreglo[j+1]) {
					tmp=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=tmp;
				}
			}
		}
	}
}
