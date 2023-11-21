package unidad5;

public class BusquedaLineal {

	public static void main(String[] args) {

		int arr[]= {2,3,14,10,56,40};
		//Elemento a buscar
		int x=14;
		
		int posición=buscar(arr,x);
		if(posición==-1) {
			System.out.println("Elemento no encontrado en ek array.");
		}else {
			System.out.println("Elemento encontrado en la posición "+(posición+1));
		}
	}
	private static int buscar(int[] arr, int x) {
		int resultado=-1;
		boolean noEncontrado=true;
		int numVeces=1;
		for(int i=0;i<arr.length && noEncontrado;i++) {
			if(arr[i]==x) {
				resultado=i;
				noEncontrado=false;
			}
			System.out.println("Veces "+numVeces);
			numVeces++;
		}
		return resultado;
	}
}
