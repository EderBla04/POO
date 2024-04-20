package Uni2Tareas;

public class Trabajo {
	
	private double metroazulejo;
	private double metropiso;
	
	public Trabajo(double metroazulejo, double metropiso) {
		// TODO Auto-generated constructor stub
		
		this.metroazulejo=metroazulejo;
		this.metropiso=metropiso;
	}
	
	public double getCosto() {
		
		double costazulejo = metroazulejo*150;
		double costpiso= metropiso* 200;
		
		return costazulejo+costpiso;
	}

}
