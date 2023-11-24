package unidad5.practica2_U5;

import java.util.Scanner;

public class ServicioBicicletasElectricas {

	//Estado del bono
	public static boolean tieneBono=false;
	//Horas de viaje
	public static int numH=0;
	//Precio con o sin bono
	public static int sinBono=4;
	public static int conBono=2;
	//A cuanto sale la broma
	public static int coste=0;
	//Capacidad de estaciones
	public static int CAP_ESTATION=6;
	
	public static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//Estaciones
		int[] Augustobriga=new int[CAP_ESTATION];
		Augustobriga[0]=10;
		Augustobriga[1]=20;
		Augustobriga[2]=30;
		Augustobriga[3]=40;
		Augustobriga[4]=0;
		Augustobriga[5]=0;
		
		int[] Multiusos=new int[CAP_ESTATION];
		Multiusos[0]=50;
		Multiusos[1]=60;
		Multiusos[2]=70;
		Multiusos[3]=80;
		Multiusos[4]=0;
		Multiusos[5]=0;
		
		int[] Cruce=new int[CAP_ESTATION];
		Cruce[0]=90;
		Cruce[1]=100;
		Cruce[2]=110;
		Cruce[3]=120;
		Cruce[4]=0;
		Cruce[5]=0;
		
		int option;
		
		do{
			System.out.println("---------------Menú---------------");
			System.out.println("1.Reservar bicicleta");
			System.out.println("2.Activar bono");
			System.out.println("3.Mostrar estación");
			System.out.println("7.Salir");
		
		option=entrada.nextInt();
		
		switch(option){
		case 1:
			reservarBici(numH);
			break;
		case 2:
			actualizarBono(tieneBono);
			break;
		case 3:
			mostrarEstacion(Augustobriga, Multiusos, Cruce);
			cogerBici(Augustobriga, Multiusos, Cruce);
			break;
		default:
			System.out.println("Ingrese una opción válida por favor.");
			break;
		}

		}while(option!=7);
	}
	private static void reservarBici(int numH) {
		System.out.println("Precio/Hora sin bono=4€");
		System.out.println("Precio/Hora con bono=2€");
		System.out.println("Escoja la duración del viaje:");
		
		numH=entrada.nextInt();
		//Validar horas
		if(numH<=0) {
			System.out.println("Ingrese una duración válida por favor.");
		}
		//Aplicar bono
		if(tieneBono==false) {
			coste=numH*sinBono;
		}else {
			coste=numH*conBono;
		}
		//Mostrar broma
		System.out.println("Reserva realizada");
		System.out.println("Duración del viaje: "+numH);
		System.out.println("Coste: "+coste);
	}
	private static boolean actualizarBono(boolean tieneBono) {
		tieneBono=!tieneBono;
		if(tieneBono==false) {
			System.out.println("Bono cancelado");
		}else {
			System.out.println("Bono activado");
		}
		return tieneBono;
	}
	private static void mostrarEstacion(int[] Augustobriga, int[] Multiusos, int[] Cruce) {
		System.out.println("Estas son las bicicletas disponibles:");
		System.out.println(" ");
		//Augustobriga
		System.out.print("Estación Augustóbriga: ");
		for(int i=0;i<CAP_ESTATION;i++) {
			System.out.print(Augustobriga[i]+"|");
		}System.out.println(" ");
		//Multiusos
		System.out.print("Estación Multiusos: ");
		for(int i=0;i<CAP_ESTATION;i++) {
			System.out.print(Multiusos[i]+"|");
		}System.out.println(" ");
		//Cruce
		System.out.print("Estación Cruce: ");
		for(int i=0;i<CAP_ESTATION;i++) {
			System.out.print(Cruce[i]+"|");
		}System.out.println(" ");
	}
	private static void cogerBici(int[] Augustobriga, int[] Multiusos, int[] Cruce) {
		System.out.println("Seleccione la estación");
		int selection;
		selection=entrada.nextInt();
		int base=0;
		base=entrada.nextInt()-1;
		do{
			System.out.println("------------Estaciones------------");
			System.out.println("1.Augustóbriga");
			System.out.println("2.Multiusos");
			System.out.println("3.Cruce");
			System.out.println("4.Salir");
			
		switch(selection){
		case 1:
			System.out.println("Seleccione la bici");
			for(int i=0;i<CAP_ESTATION;i++) {
				System.out.print(Augustobriga[i]+"|");
			}System.out.println(" ");
			System.out.println("Seleccione las base en la que está la bici (1-6): ");
			if(Augustobriga[base]<=0) {
				System.out.println("No puede coger ninguna bici de esta base.");
			}if(Augustobriga[base]>0&&Augustobriga[base]<=6) {
				
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			
			break;
		}
		}while(selection!=4);
	}
}
