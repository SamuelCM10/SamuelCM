package pruebas.evaluacion2.prueba1.ej2;

public class Terrestre {

	private String matricula;
	private String modelo;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = GeneradorMatrículas.crearMatriculaTerrestre();
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	
	
}
