package Uni2Ejemplos;

public class Libro {
	
	private String nombre;
	private int nlibro;
	
	public Libro(String nombre, int nlibro) {
		// TODO Auto-generated constructor stub
		
		this.nombre=nombre;
		this.nlibro=nlibro;
		
		
}

	public String getNombre() {
		return nombre;
	}

	public int getNlibro() {
		return nlibro;
	}
	
	
	public void mostrar() {
		System.out.println("Nombre del libro = "+this.getNombre()+ " Numero= "+this.getNlibro());
	}

}
