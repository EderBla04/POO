package Uni2Examenes;

public class Cliente {
	
	private String nombre;
	private int numdecuenta;
	private int saldoactual;
	
	public Cliente(String nombre, int numdecuenta, int saldoactual) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.numdecuenta=numdecuenta;
		this.saldoactual=saldoactual;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNumdecuenta() {
		return numdecuenta;
	}
	public int getSaldoactual() {
		return saldoactual;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numdecuenta=" + numdecuenta + ", saldoactual=" + saldoactual + "]";
	}
	


}
