package Uni2Ejemplos;

public class Cliente {
	
	private String id;
	private String nombre;
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}

	
	public Cliente(String id, String nombre) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	
	}
	

}
