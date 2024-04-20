package Uni4Ejercicios;

public class Cita {
	
	private Paciente paciente;
	
	private Medico medico;
	
	private String fecha;

	public Cita(Paciente paciente, Medico medico, String fecha) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public String getFecha() {
		return fecha;
	}
	
	
	

}
