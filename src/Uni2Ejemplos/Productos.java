package Uni2Ejemplos;

public class Productos {
	
	private int codigo;
	private String insumo;
	private int precio;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getInsumo() {
		return insumo;
	}
	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String buscar(int codigo){
		
		if(codigo==101) {
			setPrecio(25);
			setInsumo("Cafe del dia");
			return getInsumo() +"\n$"+ getPrecio();
		}
		else if(codigo==102) {
			setPrecio(60);
			setInsumo("Cafe capuchino grande");
			return getInsumo() +"\n$"+ getPrecio();	
		}
		else if(codigo==103) {
			setPrecio(50);
			setInsumo("Cafe capuchino pequeño");
			return getInsumo() +"\n$"+ getPrecio();
		}
		else if(codigo==104) {
			setPrecio(58);
			setInsumo("Cafe late grande");
			return getInsumo() +"\n$"+ getPrecio();
		}
		else if(codigo==105) {
			setPrecio(48);
			setInsumo("Cafe late pequeño");
			return getInsumo() +"\n$"+ getPrecio();
		}
		else if(codigo==106) {
			setPrecio(58);
			setInsumo("Cafe lechero grande");
			return getInsumo() +"\n$"+ getPrecio();
		}
		else if(codigo==107) {
			setPrecio(48);
			setInsumo("Cafe lechero pequeño");
			return getInsumo() +"\n$"+ getPrecio();
		}
		else {
			setPrecio(0);
			setInsumo("No existe");
			return getInsumo() +"\n$"+ getPrecio();
		}		
	}
	
	public void menu() {
		System.out.println("Codigo||||      Insumo             |||| Precio");
		System.out.println(" 101  ||||   cafe del dia          ||||  $25\n"
				         + " 102  |||| cafe capuchino grande   ||||  $60\n"
				         + " 103  |||| cafe capuchino pequeño  ||||  $50\n"
				         + " 104  |||| cafe late grande        ||||  $58\n"
				         + " 105  |||| cafe late pequeño       ||||  $48\n"
				         + " 106  |||| cafe lechero grande     ||||  $58\n"
				         + " 107  |||| cafe lechero pequeño    ||||  $48\n");
	}
	
	
	
	

}
