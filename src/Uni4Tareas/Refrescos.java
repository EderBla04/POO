package Uni4Tareas;

public class Refrescos extends Producto {

	public Refrescos() {
		super("Refrescos", 30.00);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double total(int cantidad) {
		// TODO Auto-generated method stub
		return super.getPrecio()*cantidad;
	}

}
