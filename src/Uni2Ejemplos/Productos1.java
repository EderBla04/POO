package Uni2Ejemplos;

public class Productos1 {
	
	private int codigo;
	private int precio;
	private String insumo;
	
	public Productos1() {
		this.codigo=0;
		this.insumo="sin producto";
		this.precio=0;	
	}
	
	public Productos1(int codigo, String insumo, int precio) {
		this.codigo=codigo;
		this.insumo=insumo;
		this.precio=precio;	
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getInsumo() {
		return insumo;
	}

	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}
	
	
	

}
