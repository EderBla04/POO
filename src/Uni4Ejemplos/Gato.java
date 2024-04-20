package Uni4Ejemplos;

public class Gato extends Mascota {

	public Gato(String nombre, String raza, String color) {
		super(nombre, raza, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Nombre del gato: "+this.getNombre()+", Raza:"+this.getRaza()+", Color: "+this.getColor();
	}

}
