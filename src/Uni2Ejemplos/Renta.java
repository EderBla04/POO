package Uni2Ejemplos;

public class Renta {
	
	private Cliente cliente;
	private Vehiculo vehiculo;
	private int diarenta;
	private int mesrenta;
	private int aniorenta;
	private int diasrenta;
	
	
	
	public Renta(Cliente cliente, Vehiculo vehiculo, int diarenta, int mesrenta, int aniorenta, int diasrenta) {
		super();
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.diarenta = diarenta;
		this.mesrenta = mesrenta;
		this.aniorenta = aniorenta;
		this.diasrenta = diasrenta;
	}

	public double pago() {
		
		double pago;
		
		pago= this.diasrenta*this.vehiculo.getTarifa();
		
		return pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public int getDiarenta() {
		return diarenta;
	}

	public int getMesrenta() {
		return mesrenta;
	}

	public int getAniorenta() {
		return aniorenta;
	}

	public int getDiasrenta() {
		return diasrenta;
	}
	
	
	
	

}
