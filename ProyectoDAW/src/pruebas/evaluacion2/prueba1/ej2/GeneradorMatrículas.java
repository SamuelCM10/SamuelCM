package pruebas.evaluacion2.prueba1.ej2;

import java.security.SecureRandom;

public class GeneradorMatrículas {

	//Genera las letras de la matrícula aleatoriamente para vehículos terrestres
	public static String matriculaPorDerechaT() {
		
		StringBuilder pDrch = new StringBuilder();
		SecureRandom random = new SecureRandom();
		
		for (int i = 0; i < 3; i++) {
			pDrch.append((char) (random.nextInt(26) + 'A'));
		}
		return pDrch.toString();
	}
	//Genera los números de la matrícula aleatoriamente para vehículos terrestres
	public static String matriculaPorIzquierdaT() {
		
		StringBuilder pIzq = new StringBuilder();
		SecureRandom random = new SecureRandom();
		
		for (int i = 0; i < 4; i++) {
			pIzq.append(random.nextInt(10));
		}
		
		return pIzq.toString();
	}
	//Crea una matrícula juntando la parte izquierda con la derecha para vehículos terrestres
	public static String crearMatriculaTerrestre() {
		
		String i = matriculaPorIzquierdaT();
		String d = matriculaPorDerechaT();
		
		String matricula = i + "-" + d;
		return matricula;
	}
	//Genera las letras de la matrícula aleatoriamente para vehículos aéreos
	public static String matriculaPorIzquierdaA() {
		
		StringBuilder pIzq = new StringBuilder();
		SecureRandom random = new SecureRandom();
		
		for (int i = 0; i < 4; i++) {
			pIzq.append((char) (random.nextInt(26) + 'A'));
		}
		return pIzq.toString();
	}
	//Genera los números de la matrícula aleatoriamente para vehículos aéreos
	public static String matriculaPorDerchaA() {
		
		StringBuilder pDrch = new StringBuilder();
		SecureRandom random = new SecureRandom();
		
		for (int i = 0; i < 6; i++) {
			pDrch.append(random.nextInt(10));
		}
		return pDrch.toString();
	}
	//Crea una matrícula juntando la parte izquierda con la derecha para vehículos aéreos
	public static String crearMatriculaAerea() {
		
		String i = matriculaPorIzquierdaA();
		String d = matriculaPorDerchaA();
		
		String matricula = i + "-" + d;
		return matricula;
	}
	//Crea una matrícula aleatoria para vehículos acuáticos
	public static String crearMatriculaAcuatica() {

		StringBuilder matriAgua = new StringBuilder();
		SecureRandom random = new SecureRandom();
		int longitud = (int)(Math.random()*8+3);
		
		for (int i = 0; i < longitud; i++) {
			matriAgua.append((char) (random.nextInt(26) + 'A'));
		}
		return matriAgua.toString();
	}

}
