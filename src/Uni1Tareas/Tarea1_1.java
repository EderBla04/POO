package Uni1Tareas;

public class Tarea1_1 {
	
	public static void main(String[] args) {
		
		Animal perro = new Animal();
		Animal gato = new Animal();
		
		perro.nombre="Pancho";
		perro.Edad="4 años";
		
		gato.nombre="Paco";
		gato.Edad="3 años";
		
		System.out.println("El nombre del perro es "+perro.nombre+
				" y su edad es de "+ perro.Edad);
		
		System.out.println("El nombre del gato es "+gato.nombre+
				" y su edad es de "+ gato.Edad);
		
		
		
	}

}
