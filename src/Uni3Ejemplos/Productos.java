package Uni3Ejemplos;



public class Productos {
	
	private int id;
	private int precio;
	private String nombre;
	public Productos(int id, int precio, String nombre) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
		
		
	}
	
	
	public int getId() {
		return id;
	}


	public int getPrecio() {
		return precio;
	}


	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "id= " + id  + ", nombre= " + nombre+ ", precio= $" + precio;
	}
	
	

}
