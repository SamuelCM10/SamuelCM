package unidad10.ejemplos;

public class DemoExpection {

	//PLANTILLA DE EXCEPCIONES
	
	public static void main(String[] args) {
		
		int[]numeros = {1,2,3};
		
		try {
			
			numeros = null;
			System.out.println(numeros[-21]);
			
		//COGER UNA POR UNA ----> PILLARÁ LA 1ª
			//SE PUEDEN CONCATENAR EXCEPCIONES CON ----> |
			
			//FUERA DE RANGO
		}catch(ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("Indice fuera del límite "+ex.getMessage());
			
			//VALORES NULOS
		}catch(NullPointerException ex){
			
			System.out.println("No se puede cargar nada "+ex.getMessage());
		
		/*CURARSE EN SALUD/COMODÍN ----> LAS PILLAS TODAS
		 * 
		 * }catch(Exception ex){
		 * System.out.println("Se ha producido un error "+ex.getMessage());
		 * }
		 * 
		*/
		
		}finally {
			
			System.out.println("Ok...");
			
		}

	}

}
