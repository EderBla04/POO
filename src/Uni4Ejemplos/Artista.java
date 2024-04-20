package Uni4Ejemplos;

public class Artista {
	
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private String trayectoria;
	
	private void Artitsa() {
		// TODO Auto-generated method stub
		this.trayectoria="30";

	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAppaterno() {
		return appaterno;
	}
	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}
	public String getApmaterno() {
		return apmaterno;
	}
	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}
	
	public void mensaje() {
		
 
		System.out.println("Tiene de trayectoria "+this.trayectoria);
		
	}
	
	
	
	

}
