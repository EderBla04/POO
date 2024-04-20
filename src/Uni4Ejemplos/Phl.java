package Uni4Ejemplos;

public class Phl extends Profesor2{
	
	private String horas;
	private String pagoh;
	
	public Phl(String id, String nombre, String horas, String pagoh) {
		// TODO Auto-generated constructor stub
		super(id, nombre);
		
		this.horas=horas;
		this.pagoh=pagoh;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getPagoh() {
		return pagoh;
	}

	public void setPagoh(String pagoh) {
		this.pagoh = pagoh;
	}
	
	public String pago() {
		
		int pagolah = 1000;
		
		this.pagoh= String.valueOf(pagolah*Integer.parseInt(horas));
		
	
		
		
		return null;
	}

}
