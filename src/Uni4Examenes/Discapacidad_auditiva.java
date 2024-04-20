package Uni4Examenes;

public class Discapacidad_auditiva extends Paciente{
	
	private String tipodeaparato_auditivo;

	public Discapacidad_auditiva(String nombre, String edad, String tipodeenfermedad, String tipodeaparato_auditivo) {
		super(nombre, edad, tipodeenfermedad);
		// TODO Auto-generated constructor stub
		this.tipodeaparato_auditivo=tipodeaparato_auditivo;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Nombre del paciente: "+this.getNombre());
		System.out.println("Edad del paciente: "+this.getEdad());
		System.out.println("Discapicidad: "+this.getTipodeenfermedad());
		System.out.println("Aparato aduditivo: "+this.tipodeaparato_auditivo);
	}
	
	
	
	

}
