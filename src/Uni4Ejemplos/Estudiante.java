package Uni4Ejemplos;

public class Estudiante {
	
	private String id;
	private String nombre;
	private Materia materia;
	
	public Estudiante(String id, String nombre, Materia materia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.materia = materia;
	}
	
	public String getDatos() {
		
		return "Matricula: "+id+" Estudiante: "+nombre+materia.getDatos() ;
		
	}
	
	public String estado() {
		
		return materia.estado();
		
	}
	
	
	
	

}
