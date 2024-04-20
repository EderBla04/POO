package Uni4Tareas;

import java.util.ArrayList;

public class Tarea4_2 {
	
	public static void main(String[] args) {
		
		Medico med1 = new Medico("Elizabeth Blackwel", "Medicina general");
		Medico med2 = new Medico("Christian Barnard", "Cirugía cardíaca.");
		Medico med3 = new Medico("Leila Denmark", "Pediatria");
		
		Paciente paci1 = new Paciente("Geraldine", 19);
		Paciente paci2 = new Paciente("Diego", 7);
		Paciente paci3 = new Paciente("Leo", 18);
		
		Cita cita1 = new Cita(paci1, med2, "20/04/2024");
		Cita cita2 = new Cita(paci2, med3, "27/04/2024");
		Cita cita3 = new Cita(paci3, med1, "16/04/2024");
		
		Consultorio consul_uat =  new Consultorio();
		
		consul_uat.agregarCita(cita1);
		consul_uat.agregarCita(cita2);
		consul_uat.agregarCita(cita3);
		
		ArrayList<Cita> info = new ArrayList<Cita>();
		
		info.addAll(consul_uat.obtenerCita());
		
		int i=1;
		
		for(Cita var: info) {
			
			System.out.println("Cita num: "+i++);
			
			System.out.println("Fecha: "+var.getFecha());
			System.out.println("Paciente: "+var.getPaciente().getNombre()+ " Edad: "+var.getPaciente().getEdad());
			System.out.println("Medico: "+ var.getMedico().getNombre());
			System.out.println("Especialidad: "+var.getMedico().getEspecialidad());
			System.out.println();
			
		}
		
		
		
	}

}
