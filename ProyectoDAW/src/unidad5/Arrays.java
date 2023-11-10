package unidad5;

public class Arrays {

	public static void main(String[] args) {
		
		final int Tam_Edades=10;
		
		//Array
		int [] edades=new int[Tam_Edades];
		edades[0]=13;
		edades[1]=12;
		edades[2]=11;
		edades[3]=10;
		edades[4]=21;
		edades[5]=29;
		edades[6]=34;
		
		int mayores=0;
		
		System.out.println("---Ascendente---");
		for(int i=0;i<edades.length;i++) {
			if(edades[i]!=0) {
				System.out.println("Posición "+(i+1)+"--->"+edades[i]);
				if(edades[i]>=18) {
					mayores++;
				}
			}
		}
		System.out.println(mayores+" son mayores de edad.");
		System.out.println("---Descendente---");
		for(int j=Tam_Edades-1;j>0;j--) {
			if(edades[j]!=0) {
				System.out.println("Posición "+(j+1)+"--->"+edades[j]);
			}
		}
		
	}

}
