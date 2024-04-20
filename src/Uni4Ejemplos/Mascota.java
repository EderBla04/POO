package Uni4Ejemplos;

public abstract class Mascota {
	
	private String nombre;
	private String raza;
	private String color;
	public Mascota(String nombre, String raza, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public String getColor() {
		return color;
	}
	
	public abstract String info();
	
	
	
	

}
