package Uni4Ejercicios;

public class Profesor extends Cpersona {
	
	private String salario;

	public Profesor(String id, String nombre, String salario) {
		
		super(id, nombre);
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Profesor= " + super.toString() + ", Salario= "+ salario;
	}
		
}
