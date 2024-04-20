package Uni4Ejemplos;

public class Cantante extends Artista{
	
	private String cancion;
	
	public Cantante(String nombre, String cancion) {
		// TODO Auto-generated constructor stub
		super.setNombre(nombre);
		this.cancion=cancion;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	
	public String mostrar() {
		
		return "El cantante "+super.getNombre()+" tiene la cancion "+ this.getCancion();
		
	}
	
	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		super.mensaje();
		System.out.println(" y es un cantante famoso");
	}
	

}
