package Uni4Practicas;

public class Cuadrado1 extends Figura1 {

	public Cuadrado1( double lado) {
		super(0, 0, lado, 0);
		// TODO Auto-generated constructor stub
		
		}
	
	public double areaCuadrado() {
		
		
		return super.getLado()*super.getLado();
	}
		

	}


