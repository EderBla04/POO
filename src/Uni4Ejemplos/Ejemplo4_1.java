package Uni4Ejemplos;

public class Ejemplo4_1 {
	
	public static void main(String[] args) {
		
		Cantante cantante = new Cantante("Fredy Mercury","Love of my live");
		Actor actor = new Actor("Tom Cruise","Mision Imposible");
		
		System.out.println(cantante.mostrar());
		System.out.println(actor.mostrar());
		
		cantante.mensaje();
		actor.mensaje();

		
	}

}
