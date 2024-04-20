package Uni4Ejemplos;

public class Pcontrato extends Phl {
	
	private boolean vigencia;

	public Pcontrato(String id, String nombre, String horas, String pagoh, boolean vigencia) {
		super(id, nombre, horas, pagoh);
		this.vigencia = vigencia;
	}

	public boolean isVigencia() {
		return vigencia;
	}

	public void setVigencia(boolean vigencia) {
		this.vigencia = vigencia;
	}

	@Override
	public String toString() {
		return "Pcontrato [vigencia=" + vigencia + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
