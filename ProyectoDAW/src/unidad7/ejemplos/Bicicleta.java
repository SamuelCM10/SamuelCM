package unidad7.ejemplos;

public class Bicicleta {
		
		private String marca="Sin marca";
		private String modelo="Sin modelo";
		private String color="No definido";
		private int id=0;
		private int tipo=0;
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getTipo() {
			return tipo;
		}
		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		
		public Bicicleta(int id,int tipo,String color,String modelo,String marca) {
			this.id=id;
			this.tipo=tipo;
			this.marca=marca;
			this.modelo=modelo;
			this.color=color;
			
		}
		
		public void imprimirDatos() {
			System.out.println("Datos de la Bicicleta");
			System.out.println("Marca: "+marca);
			System.out.println("Modelo: "+modelo);
			System.out.println("Color: "+color);
			System.out.println("Id: "+id);
			System.out.println("Tipo: "+tipo);
			
		}

	}


