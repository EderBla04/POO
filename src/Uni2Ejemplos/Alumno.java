package Uni2Ejemplos;

public class Alumno {
	
	private String nombre;
	private String matricula;
	private String calif1,calif2,calif3;
	
	public Alumno(String nombre, String matricula, String calif1, String calif2, String calif3) {
		// TODO Auto-generated constructor stub
		
		this.nombre=nombre;
		this.matricula=matricula;
		this.calif1=calif1;
		this.calif2=calif2;
		this.calif3=calif3;
		
	}
	
	public Alumno() {
		// TODO Auto-generated constructor stub
		
		this.nombre="";
		this.matricula="";
		this.calif1="-1";
		this.calif2="-1";
		this.calif3="-1";
		
	}
	
	public String getPromedio() {
		
		double n =(Double.parseDouble(calif1)+Double.parseDouble(calif2)+Double.parseDouble(calif3))/3;
		
		return String.valueOf(n);
			
	}
	
	public String getAlumno() {
		
		return "Nombre= "+this.nombre+" Matricula= "+this.matricula+" Promedio= "+this.getPromedio();
	}
	
	
	
	
}
