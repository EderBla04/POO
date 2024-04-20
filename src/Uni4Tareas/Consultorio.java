package Uni4Tareas;

import java.util.ArrayList;

public class Consultorio implements Agenda {
	
	private ArrayList<Cita> citas;
	
	

	public Consultorio() {
		citas = new ArrayList<Cita>();
	
	}

	@Override
	public void agregarCita(Cita cita) {
		// TODO Auto-generated method stub
		
		citas.add(cita);

	}

	@Override
	public void eliminarCita(Cita cita) {
		// TODO Auto-generated method stub
		citas.remove(cita);
		

	}

	@Override
	public ArrayList<Cita> obtenerCita() {
		// TODO Auto-generated method stub
		return  citas ;
	}
	
	

}
