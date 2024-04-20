package Uni4Practicas;

import java.util.ArrayList;

public class Hotel {
	
	ArrayList<Reservacion> habitacion = new ArrayList<Reservacion>();

	public Hotel() {
		super();
	}
	
	public void agregar(General reserva) {
		
		habitacion.add(reserva);
		
		
		
		
	}
	
	public ArrayList<Reservacion> mostrar(){
		return habitacion;
		
		
		
	}
	
	

}
