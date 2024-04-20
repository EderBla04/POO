package Uni4Examenes;

public class Discapacidad_motora extends Paciente{
	
	private String tipodesillas;

	public Discapacidad_motora(String nombre, String edad, String tipodeenfermedad, String tipodesillas	) {
		super(nombre, edad, tipodeenfermedad);
		// TODO Auto-generated constructor stub
		this.tipodesillas=tipodesillas;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Nombre del paciente: "+this.getNombre());
		System.out.println("Edad del paciente: "+this.getEdad());
		System.out.println("Discapicidad: "+this.getTipodeenfermedad());
		System.out.println("Tipo de sillas: "+this.tipodesillas);
	}
	
	
	
	

}
