package Uni4Ejemplos;

public class Empleado {

	private String id;
	private String nombre;
	private int edad;
	private double pago;
	
	
	public Empleado(String id, String nombre, int edad, double pago) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.pago = pago;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double calcularPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + this.getEdad() + ", pago=" + pago + "]";
	}
	
	
	
	
	
	
	
}
