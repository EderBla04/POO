package Uni4Ejemplos;

public class Actor extends Artista{
	
	private String pelicula;
	
	
	public Actor(String nombre, String pelicula) {
		// TODO Auto-generated constructor stub
		
		super.setNombre(nombre);
		this.pelicula=pelicula;
	}


	public String getPelicula() {
		return pelicula;
	}


	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	public String mostrar() {
		
		
		return "El actor "+super.getNombre()+" actua en la pelicula "+ this.getPelicula(); 
		
	}
	
	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		System.out.println("Es un actor famoso");
	}

}
