package Uni4Practicas;

public class Circulo1 extends Figura1 {

	public Circulo1( double radio) {
		super(0, 0, 0, radio);
		// TODO Auto-generated constructor stub
	}
	
	public double areaCirculo() {
		
		
		return super.pi*super.getRadio()*super.getRadio();
		
	}
	
	

}
