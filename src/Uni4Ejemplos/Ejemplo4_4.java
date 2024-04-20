package Uni4Ejemplos;

public class Ejemplo4_4 {
	
	public static void main(String[] args) {
		
		Multiplicar operacion = new Multiplicar();
		
		
		System.out.println(operacion.multiplicar(7.5, 8.0));
		System.out.println(operacion.multiplicar(7, 3.5));
		System.out.println(operacion.multiplicar(8, 9));
		System.out.println(operacion.multiplicar("8", "9"));
	}

}
