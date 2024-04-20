package Uni4Examenes;

public class Discapicidad_visual extends Paciente {
	
	private String colordelbaston;
	
	public Discapicidad_visual(String nombre, String edad, String tipodeenfermedad, String colordelbaston) {
		super(nombre, edad, tipodeenfermedad);
		this.colordelbaston=colordelbaston;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Nombre del paciente: "+this.getNombre());
		System.out.println("Edad del paciente: "+this.getEdad());
		System.out.println("Discapicidad: "+this.getTipodeenfermedad());
		System.out.println("Color del baston: "+this.colordelbaston);
	}
	
	

	
	


	
	
	
	
	
	

}
