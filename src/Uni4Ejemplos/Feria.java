package Uni4Ejemplos;

public class Feria implements Ventas {
	
	private Tipoboleto[] boleto;
	
	private int ingresos;
	
	

	public Feria( int num) {
		super();
		this.boleto = new Tipoboleto[num];
		this.ingresos = 0;
	}
	
	public void agregar(int i,  Tipoboleto tipo) {
		
		boleto[i] = tipo;
		
		
		
	}

	@Override
	public void ventaboletos(int i, int cant) {
		// TODO Auto-generated method stub
		
		double precio= this.boleto[i].getPrecio();
		double total = precio*cant;
		
		ingresos+=total;

	}

	@Override
	public int getIngreso() {
		// TODO Auto-generated method stub
		return ingresos;
	}

}
