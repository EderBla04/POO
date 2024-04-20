package Uni4Practicas;

public class VistaMar extends General {
	
	private double bono;
	
	public VistaMar(int num, double preciohab, double bono) {
		super(num, preciohab);
		// TODO Auto-generated constructor stub
		this.bono=bono;
	}

	@Override
	public double pago() {
		// TODO Auto-generated method stub
		return super.pago()+this.bono;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Habitacion: "+this.getNum() + ", Pago por vista al mar: "+this.pago());
	}
	
	
	

	
	
	

	
	
	

}
