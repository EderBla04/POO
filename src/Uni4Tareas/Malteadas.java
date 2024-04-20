package Uni4Tareas;

public class Malteadas extends Producto {

	public Malteadas() {
		super("Malteadas", 60.00);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double total(int cantidad) {
		// TODO Auto-generated method stub
		return super.getPrecio()*cantidad;
	}

}
