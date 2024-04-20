package Uni3Ejemplos;

public class Suma {
	
	private int n1;
	
	private int n2;
	
	public static int v1;
	 
	public static int v2;
	
	

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public void mostrar() {
		
		
		System.out.println(this.getN1()+this.getN2());
		
		
	}
	
	public static int suma() {
		
		
		
		return v1+v2;
	}

}
