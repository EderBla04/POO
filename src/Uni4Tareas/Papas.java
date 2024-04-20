package Uni4Tareas;

public class Papas extends Producto {

	public Papas() {
		super("Papas", 50.00);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double total(int cantidad) {
		// TODO Auto-generated method stub
		return super.getPrecio()*cantidad;
	}

}
