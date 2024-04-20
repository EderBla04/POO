package Uni4Practicas;

public class General implements Reservacion {
	
	private int num;
	
	private double preciohab;
	
	

	public General(int num, double preciohab) {
		super();
		this.num = num;
		this.preciohab = preciohab;
	}
	
	

	public int getNum() {
		return num;
	}



	@Override
	public double pago() {
		// TODO Auto-generated method stub
		return preciohab;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Habitacion: "+this.getNum() + ", Pago por cuarto general: "+this.pago());

		

	}

}
