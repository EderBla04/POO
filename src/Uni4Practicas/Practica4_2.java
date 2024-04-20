package Uni4Practicas;

public class Practica4_2 {
	
	public static void main(String[] args) {
		
		General habi1 = new General(1, 2000);
		Suite habi2 = new Suite(20, 3000, 1000);
		VistaMar habi3 = new VistaMar(15, 2500, 500);
		
		Hotel hotel = new Hotel();
		
		hotel.agregar(habi1);
		hotel.agregar(habi2);
		hotel.agregar(habi3);
		
		System.out.println("Reservas del dia de hoy");
		
		for(Reservacion var: hotel.habitacion) {
			
			var.mostrar();
	
		}
		
	}
}
