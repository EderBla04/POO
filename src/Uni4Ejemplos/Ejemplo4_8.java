package Uni4Ejemplos;

public class Ejemplo4_8 {
	
public static void main(String[] args) {
	
	Perro solovino = new Perro();
	Pato gis = new Pato();
	Serpiente gregor = new Serpiente();
	
	solovino.sonido();
	solovino.patas();
	
	System.out.println("Pelo: "+solovino.pelo+" color: "+solovino.color);
	
	gis.sonido();
	gis.patas();
	
	gregor.sonido();
	
	
}
	
	

}
