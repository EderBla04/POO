package Uni4Ejemplos;

public abstract class Materia {
	
	private String nombre;
	
	private int horas;
	
	private boolean regular;

	public Materia(String nombre, int horas, boolean regular) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.regular = regular;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHoras() {
		return horas;
	}

	public boolean isRegular() {
		return regular;
	}
	
	public abstract String getDatos();
	public abstract String estado();

	
	
}
