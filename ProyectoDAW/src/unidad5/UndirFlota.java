package unidad5;

import java.util.Scanner;

public class UndirFlota {

	public static final int NUM_FILAS=8;
	public static final int NUM_COLUMNAS=8;
	public static  int x;
	public static  int y;
	
	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		int option;
		
		int [][] mar=new int[NUM_FILAS][NUM_COLUMNAS];

		mar [1][2]=1;
		mar [2][2]=1;
		mar [2][0]=1;
		mar [4][2]=1;
		mar [4][3]=1;
		mar [4][4]=1;
	
	do {
		mapa(mar);
		
		System.out.println("-----------Undir la flota-----------");
		System.out.println("1.Añadir parte/barco");
		System.out.println("2.Undir barco");
		System.out.println("3.Salir");
		
		
		option=entrada.nextInt();
		
		switch(option){
		case 1:
			System.out.println("Seleccione coordenada x:");
			x=entrada.nextInt()-1;
			System.out.println("Seleccione coordenada y:");
			y=entrada.nextInt()-1;
			mar[x][y]=1;
		break;
		case 2:
			System.out.println("Seleccione coordenada x:");
			x=entrada.nextInt()-1;
			System.out.println("Seleccione coordenada y:");
			y=entrada.nextInt()-1;
			tocarNormal(mar,x,y);
			tocarLimitX(mar,x,y);
			tocarLimitY(mar,x,y);
				
		break;	
		default:
			
		break;
		}
	}while(option!=3);
	
	}
	private static void mapa(int[][] mar) {
		System.out.println("---------------MAPA---------------");
		for(int fila=0;fila<NUM_FILAS;fila++) {
			for(int columna=0;columna<NUM_COLUMNAS;columna++) {
				System.out.print(mar[fila][columna]+" ");
			}
			System.out.println("");
			}
	}
	private static void tocarNormal(int[][] mar, int x, int y) {
		if(mar[x][y]==1&&mar[x+1][y]==1||mar[x-1][y]==1||mar[x][y+1]==1||mar[x][y-1]==1) {
			System.out.println("Tocado");
			mar[x][y]=2;
		}else if(mar[x][y]==1&&mar[x+1][y]==0||mar[x-1][y]==0||mar[x][y+1]==0||mar[x][y-1]==0) {
			System.out.println("Tocado y undido");
			mar[x][y]=2;
		}else {
			System.out.println("Agua");
			mar[x][y]=0;
		}
	}
	
	private static void tocarLimitX(int[][] mar, int x, int y) {
		if(mar[0][y]==1&&mar[1][y]==1||mar[0][y+1]==1||mar[0][y-1]==1) {
				System.out.println("Tocado");
				mar[0][y]=2;
			}else if(mar[0][y]==1&&mar[1][y]==0||mar[0][y+1]==0||mar[0][y-1]==0) {
				System.out.println("Tocado y undido");
				mar[0][y]=2;
			}else {
				System.out.println("Agua");
				mar[0][y]=0;
			}
	}
	private static void tocarLimitY(int[][] mar, int x, int y) {
		if(mar[x][0]==1&&mar[x][1]==1||mar[x+1][0]==1||mar[x+1][0]==1) {
			System.out.println("Tocado");
			mar[x][y]=2;
		}else if(mar[x][0]==1&&mar[x][1]==0||mar[x+1][0]==0||mar[x+1][0]==0) {
			System.out.println("Tocado y undido");
			mar[x][y]=2;
		}else {
			System.out.println("Agua");
			mar[x][y]=0;
		}
	}
}

