package Uni4Ejemplos;

public class Ejemplo4_10 {
	
	public static void main(String[] args) {
		Factura f = new Factura();
		Cliente c = new Cliente();
		imiprimir(f);
		imiprimir(c);
		
		
	}
	
	public static void imiprimir(Imprimir obj) {
		
		obj.imprimir();
		
		
	}

}
