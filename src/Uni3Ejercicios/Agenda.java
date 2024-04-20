package Uni3Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {
	
	private String nombre;
	private String dias;
	private String hora;
	private String fyh;

	
	public void Agenda(String nombre, String dias, String horas) {
		// TODO Auto-generated constructor stub
		this.dias=dias;
		this.hora=horas;
		this.nombre=nombre;
	}
	
	public void menu() {
		
		System.out.println("Bienvenidos a CatDog");
		System.out.println("Servicios: \n1. Corte de pelo=  \n2. Baño");
		System.out.println("Ingrese su informacion para agendar la cita");
		
	}
	

	
	public String Fyh() {
		
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fyh=formato.format(ahora);	
		return this.fyh=fyh;
	}
	
	public String servicios(int servicios) {
		
		String var = null;
		if(servicios==1) {
			return var="El costp del servio es: $100";
			
		}
		
		else if(servicios==2) return var="El costo del servicio es de: $200";
		return var;
				
		
		
		
	}

	@Override
	public String toString() {
		return "Agenda [nombre de la mascota=" + nombre + ", dia de la agenda=" + dias + ", hora=" + hora+ "]";
	}
	
	
	
	
	
	
	

}
