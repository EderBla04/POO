package Uni3Ejemplos;

public class Metdos2 {
	
	public static final double valorPI=3.1416;
public static int figura;
	private double radio;
	
	static {
		figura=4;
		
	}
	
	
	public Metdos2(double radio) {
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}
	
	
	public static double triangulo(int b,int h) {
		
		double area=b*h/2;
		return area;	
	}
	
	public double circulo() {
		
		
		
		return valorPI*this.radio*this.radio;
	}
	
	public static double rectangulo(int b,  int h) {
		
		double area=b*h;
		return area;
	}
	

}
