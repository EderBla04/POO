package Uni4Tareas;

public class Hamburguesas extends Producto {

	public Hamburguesas() {
		super("Hamburguesa", 80.00);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double total(int cantidad) {
		// TODO Auto-generated method stub
		return super.getPrecio()*cantidad;
	}

}
