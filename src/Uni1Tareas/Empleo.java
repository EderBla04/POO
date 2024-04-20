package Uni1Tareas;

import java.util.Calendar;

public class Empleo {
	
	private String nombre;
	private String actividad;
	private String tipo;
	private int edad;
	private String sexo;
	

	public String getTipo() {
		
		return tipo;
	}
	public void setTipo(String tipo) {
		int n;
		
		
		n = Integer.parseInt(tipo);
		
		if(n==1)this.tipo="PROFESION";
		else if(n==2)this.tipo="OFICIO";
			
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		
		if(sexo=='m'||sexo=='M') this.sexo="Masculino";
		else if(sexo=='f'||sexo=='F')this.sexo="Femenino";
			
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		
		int año;
		
		Calendar calendar = Calendar.getInstance();
		
		año= calendar.get(Calendar.YEAR);
		
		this.edad= año-edad;
	}
	
	@Override
	public String toString() {
		return "Empleo [nombre=" + nombre + ", actividad=" + actividad + " " + tipo + ", edad=" + edad + ", sexo="
				+ sexo + "]";
	}

	
	
	
	
	

}
