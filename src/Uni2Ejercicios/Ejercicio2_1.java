package Uni2Ejercicios;



public class Ejercicio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Series comp1 = new Series("Intel","Samsung", "ryden", "Steren");
		Series comp2 = new Series("AMD","Lenovo", "ryden", "Steren");
		
		Ceco centro1 = new Ceco("Centro de computo Facultad");
		
		Area area1 = new Area("Sala 1");
		Area area2 = new Area("Sala 2");
		
		area1.agregar(comp2);
		area2.agregar(comp1);
		
		centro1.agregarceco(area1);
		centro1.agregarceco(area2);
		
		centro1.mostrar();
		
		

	}

}
