package Uni4Practicas;

public class Suite extends General {
	
	private double extra;

	public Suite(int num, double preciohab, double extra) {
		super(num, preciohab);
		this.extra=extra;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pago() {
		// TODO Auto-generated method stub
		return super.pago()+this.extra;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Habitacion: "+this.getNum() + ", Pago por la suite: "+this.pago());
	}
	
	
	
	

}
