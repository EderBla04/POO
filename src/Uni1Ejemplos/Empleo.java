package Uni1Ejemplos;

public class Empleo {
	
	private String nombre;
	private String actividad;
	private int edad;
	private boolean activo;
	
	public void setNombre(String nvNombre) {
		
		this.nombre=nvNombre;

	}
	
	public void setActividad(String nvActividad) {
		
		this.actividad=nvActividad;
		
	}
	
	public void setEdad(String nvEdad) {
		
		if(nvEdad<=0)
			this.edad=18;
		else
			this.edad=nvEdad;
		
		
		
	}
	
	public String toString() {
		
		String cadena;
		
		cadena="Nombre=" + this.nombre+" Actividad="+this.actividad;
		
		return cadena;
		
	}
	

}
