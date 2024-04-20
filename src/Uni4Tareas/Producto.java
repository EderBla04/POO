package Uni4Tareas;

public abstract class Producto {
	
	private String nombre;
	
	private double precio;

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio= $" + precio + "]";
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public abstract double total(int cantidad);
	
	

}
