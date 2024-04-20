package Uni2Ejemplos;

public class Vehiculo {
	
	private String placa;
	private String marca;
	private String color;
	private double tarifa;
	private boolean disponible;
	
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getPlaca() {
		return placa;
	}
	public String getMarca() {
		return marca;
	}
	public String getColor() {
		return color;
		
	}

	
	public Vehiculo(String placa, String marca, String color, double tarifa, boolean disponible) {
		// TODO Auto-generated constructor stub
		this.color=color;
		this.placa=placa;
		this.marca=marca;
		this.tarifa=tarifa;
		this.disponible=disponible;
			
			
	}
	
	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", marca=" + marca + ", color=" + color + ", tarifa=" + tarifa
				+ ", disponible=" + disponible + "]";
	}
	
	
	
	
	
	

}
