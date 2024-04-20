package Uni3Tareas;

public class Tamaño {
	
	public static int tamaño;
	public static boolean positivo;
		
	public static void  evaluar(int numingresado ) {
		
		if (numingresado >0 && numingresado<=20) {
			
			tamaño=numingresado;
			positivo = true;
		} 
		
		else {
			System.out.println("\nIngrese un tamaño correcto");
			positivo = false;	
		}
	}	
	public static void imprimirSerie() {
		
		int  c1=0, c2=1, suma=0;
		
		 System.out.println("Los numeros de la serie son: ");
		System.out.print(c1+" ");
		 for(int i=1; i<tamaño; i++) {
			 
			 
			 suma = c1+c2;
			 
			 System.out.print(" "+suma+" ");
			 
			 c2=c1;
			 c1=suma;
		 }
	}
}
