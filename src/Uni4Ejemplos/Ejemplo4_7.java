package Uni4Ejemplos;

import java.util.ArrayList;

public class Ejemplo4_7 {
	
	public static void main(String[] args) {
		
		ArrayList<Mascota> pet = new ArrayList<Mascota>();
		
		Perros perro1 = new Perros("Firulais", "Labrador", "Beige");
		Perros perro2 = new Perros("Solovino", "Husky", "Tricolor");
		
		Gato gato1 = new Gato("Micho", "Persa", "Amarillo");
		Gato gato2 = new Gato("Miniso", "Siames", "Blanco");
		
		pet.add(perro1);
		pet.add(perro2);
		pet.add(gato1);
		pet.add(gato2);
		
		for(Mascota m: pet) {
			
			if(m instanceof Perros) System.out.println("Perros..."+m.info());
			
			else if (m instanceof Gato) System.out.println("Gatos..."+m.info());
			
		}
		
		
		
		
	}

}
