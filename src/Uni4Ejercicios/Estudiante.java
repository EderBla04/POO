package Uni4Ejercicios;

public class Estudiante extends Cpersona {
	
	private String cal1;
	private String cal2;
	private String cal3;
	
	
	public Estudiante(String id, String nombre, String cal1, String cal2, String cal3) {
		super(id, nombre);
		this.cal1 = cal1;
		this.cal2 = cal2;
		this.cal3 = cal3;
	}

	@Override
	public String toString() {
		return   "Estudiante= "+super.toString()+", calificacion 1=" + cal1 + ", calificacion 2=" + cal2 + ", calificacion 3=" + cal3;
	}
	
	
	
	

}
