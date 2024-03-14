import java.util.Arrays;
import java.util.Scanner;

public class pruebasLucas {
	
	// Declarar los dos arrays de 6 posiciones
    static int[] array1 = new int[6];
    static int[] array2 = new int[6];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Introducir valores para el primer array
        System.out.println("Introduce los valores para el primer array:");
        for (int i = 0; i < 6; i++) {
            array1[i] = scanner.nextInt();
        }

        // Introducir valores para el segundo array
        System.out.println("Introduce los valores para el segundo array:");
        for (int i = 0; i < 6; i++) {
            array2[i] = scanner.nextInt();
        }

        // Crear el tercer array y combinar los dos primeros
        int[] mergedArray = new int[12];
        System.arraycopy(array1, 0, mergedArray, 0, 6);
        System.arraycopy(array2, 0, mergedArray, 6, 6);

        // Ordenar el tercer array
        Arrays.sort(mergedArray);

        
        ordenarArray(array1, array2);
        imprimirMetodo();
     }
    
    private static void  ordenarArray(int[] array1, int[] array2) {
        // Ordenar los dos arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
    }
    
    private static void imprimirMetodo() {

		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		
		System.out.println(" ");


		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println(" ");
    }
}

