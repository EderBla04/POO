package Uni4Tareas;

import java.util.ArrayList;

public interface Agenda {
	
	void agregarCita(Cita cita);
	
	void eliminarCita(Cita cita);
	
	ArrayList<Cita> obtenerCita();
	

}
