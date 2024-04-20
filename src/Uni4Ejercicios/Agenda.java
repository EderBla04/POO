package Uni4Ejercicios;

import java.util.ArrayList;

public interface Agenda {
	
	void agregarCita(Cita cita);
	
	void eliminarCita(Cita cita);
	
	ArrayList<Cita> obtenerCita();
	

}
