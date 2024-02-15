package unidad8.ejemplos.herenciaObjetos;

public class GestionPersonal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Manuel");
		Persona p2 = new Persona("Sancho");
		p1.setLocalidad("Málaga");
		p2.setLocalidad("Berlín");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.getNombre().equals(p2.getNombre())) {
			System.out.println("Son la misma persona.");
		}else{
			System.out.println("No son la misma persona.");
		}
//
	}

}
