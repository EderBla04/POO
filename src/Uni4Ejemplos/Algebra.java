package Uni4Ejemplos;

public class Algebra extends Materia {
	
	
	
	

	public Algebra() {
		super("Algebra", 4, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDatos() {
		// TODO Auto-generated method stub
		return " Nombre de la materia: "+this.getNombre()+" Horas de la materia: "+this.getHoras();
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "Es un estudiante regular "+this.isRegular();
	}

}
