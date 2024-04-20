package Uni4Ejemplos;

public class Perros extends Mascota {

	public Perros(String nombre, String raza, String color) {
		super(nombre, raza, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Nombre del perro: "+this.getNombre()+", Raza:"+this.getRaza()+", Color: "+this.getColor();
	}

}
