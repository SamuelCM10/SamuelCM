package unidad6.ejemplos;

import java.util.Scanner;

public class RadarTramo {

	public static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		double distancia = entrada.nextDouble();
		double vmp = entrada.nextDouble();//velocidad maxima permitida
		double tiempo = entrada.nextDouble();
		double vel_media = entrada.nextDouble();
		boolean saPasao;
		double saPasaoX20;

		if(distancia<0 || vmp<0 || tiempo<=0 ) {
			System.out.println("***ERR0R***");
		}else {
			vmp = vmp/3.6;
			vel_media = distancia/tiempo;
			saPasao = vel_media>vmp;
			saPasaoX20 = ((vel_media-vmp)/vmp)/100;
			
			if(!saPasao) {
				System.out.println("Circule");
			}else if(saPasaoX20<20){
				System.out.println("Papelito");
			}else {
				System.out.println("Te echan de línea directa");
			}
		}
		
	}

}
