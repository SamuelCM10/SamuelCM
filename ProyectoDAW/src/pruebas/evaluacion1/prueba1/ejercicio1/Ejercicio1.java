package pruebas.evaluacion1.prueba1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static int TAM_PILA=4;
	public static int TAM_COLA=4;
	public static Scanner entrada = new Scanner (System.in);
	//La variable int elemento la uso para dar un valor entero a un espacio en cada array
	public static int elemento;
	
	public static void main(String[] args) {
		
		
		int [] pila=new int[TAM_PILA];
		int [] cola=new int[TAM_COLA];
		int option;
		
		do{
			System.out.println("---------------Ejercicio_1---------------");
			System.out.println("1.Añadir/Extraer elementos");
			System.out.println("2.Consultar contenido");
			System.out.println("3.Consultar números pares de la pila");
			System.out.println("4.Calcular suma de mayores de 10 e impares de la cola");
			System.out.println("5.Orden decreciente de la cola");
			System.out.println("6.Buscar elemento en la pila");
			System.out.println("7.Salir");
			
			option=entrada.nextInt();
			
			switch(option){
			case 1:
				System.out.println("Escoja la lista a modificar(1-Pila/2-Cola): ");
				
				//La variable String lista la uso para seleccionar una lista u otra
				//modPila modifica la pila
				//modCola modifica la cola
				
				int lista=entrada.nextInt();
				if(lista==1) {
					modPila(pila, elemento);
				}else if(lista==2){
					modCola(cola, elemento);
				}else {
					System.out.println("Vuelva a seleccionar la lista.");
				}
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			default:
				//Opción del menú no válida
				
				System.out.println("Opción no válida");
				break;
			}
			}while(option!=5);
	}
private static void modPila(int[] pila, int elemento) {
	
	System.out.println("Escoja qué modificación hará (1-push/2-pull): ");
	//La variable String action la uso para seleccionar una acción u otra
	int action=entrada.nextInt();
	if(action==1) {
		push(pila, elemento);
	}else if(action==2){
		pull(pila, elemento);
	}else {
		System.out.println("Vuelva a seleccionar una modificación.");
	}
}
private static void modCola(int[] cola, int elemento) {
	
	System.out.println("Escoja qué modificación hará (encolar/desencolar): ");
	//La variable String action la uso para seleccionar una acción u otra
	String action=entrada.next();
	if(action=="encolar") {
		
	}if(action=="encolar"){
		
	}else {
		System.out.println("Vuelva a seleccionar una modificación.");
	}
}
private static void push(int[] pila, int elemento) {
	
	System.out.println("Introduzca el valor del elemento:");
	
	elemento=entrada.nextInt();
	
	if(pila[0]==0&&pila[1]==0&&pila[2]==0&&pila[3]==0) {
		pila[0]=elemento;
	}
	else if(pila[0]!=0&&pila[1]==0&&pila[2]==0&&pila[3]==0) {
		pila[1]=elemento;
	}
	else if(pila[0]!=0&&pila[1]!=0&&pila[2]==0&&pila[3]==0) {
		pila[2]=elemento;
	}
	else if(pila[0]!=0&&pila[1]!=0&&pila[2]!=0&&pila[3]==0) {
		pila[3]=elemento;
	}
	else if(pila[0]!=0&&pila[1]!=0&&pila[2]!=0&&pila[3]!=0) {
		System.out.println("Pila llena.");
	}
}
private static void pull(int[] pila, int elemento) {
	for(int i:pila) {
		System.out.print(i+"|");
	}
	System.out.println(" ");
}
private static void encolar(int[] cola, int elemento) {
	
}
private static void desencolar(int[] cola, int elemento) {
	
}
}
