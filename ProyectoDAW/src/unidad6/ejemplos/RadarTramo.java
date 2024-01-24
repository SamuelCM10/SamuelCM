package unidad6.ejemplos;

import java.util.Scanner;

public class RadarTramo {

	public static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		double distancia = entrada.nextDouble();
		double vel_maxima_permitida = entrada.nextDouble();//velocidad maxima permitida
		double tiempo = entrada.nextDouble();
		double vel_media = 0;
		boolean saPasao;
		double saPasaoX20;

		if(distancia<0 || vel_maxima_permitida<0 || tiempo<=0 ) {
			System.out.println("***ERR0R***");
		}else {
			vel_maxima_permitida = vel_maxima_permitida/3.6;// m/s
			vel_media = distancia/tiempo;
			//Calcular la velocidad media
			saPasao = vel_media>vel_maxima_permitida;
			saPasaoX20 = ((vel_media-vel_maxima_permitida)/vel_maxima_permitida)/100;
			
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
