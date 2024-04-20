package Uni4Examenes;

import java.util.ArrayList;

public abstract  class Paciente {
	
	private String nombre;
	private String edad;
	private String tipodeenfermedad;
	
	

	public Paciente(String nombre, String edad, String tipodeenfermedad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tipodeenfermedad = tipodeenfermedad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEdad() {
		return edad;
	}

	public String getTipodeenfermedad() {
		return tipodeenfermedad;
	}
	
	abstract void mostrar();
		
		
	
	
	

	
	
	
	



	
	
	
	
	
	
	
	
	
	

}
