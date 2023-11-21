package unidad5;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int arr[]= {3,11,22,34,49,51,64,78,86,90};
		int elementoBuscado=22;
		int resultado=-1;
		System.out.println("Array");
		System.out.println("--------------------");
		imprimirArray(arr);
		System.out.println(" ");
		System.out.println("--------------------");
		System.out.println("Elemento a buscar: "+elementoBuscado);
		
		resultado=buscarBinario(arr, elementoBuscado);
		System.out.println("--------------------");
		if(resultado==-1) {
			System.out.println("Elemento no está");
		}else {
			System.out.println("Elemento está en: "+resultado);
		}
	}
	
	private static int buscarBinario(int[] arr, int elementoBuscado) {
		int posicion=-1;
		int izq=0;
		int dch=arr.length-1;
		int medio=-1;
		boolean Encontrado=false;
		
		while(izq<=dch && !Encontrado) {
			medio=izq+(dch-izq)/2;
			
			if(arr[medio]==elementoBuscado) {
				Encontrado=true;
				posicion=medio;
			}
			if(arr[medio]<elementoBuscado) {
				izq=medio+1;
			}else {
				dch=medio-1;
			}
		}
		
		return posicion;
	}
	private static void imprimirArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void mostrarArray(int[] arr) {
		for(int elemento:arr) {
			System.out.print(elemento+" ");
		}
	}
}
