package Uni1Ejemplos;

public class Tutorias {
    private String Nombre;
    private String Matricula;
    public String Status;
    private int Semestre;
    private Profesor Tutor;
    private String Carrera;

    public void setNombre(String Nombre ){
    	this.Nombre=Nombre;
    	
    }
    
    public String getNombre(){
        return Nombre;
    }


    public void setTutor(Profesor Tutor){
    	
    	this.Tutor=Tutor;
    }

    public Profesor getTutor(){
        return Tutor;
    }


    public void setMatricula(String Matricula){
    	
    	this.Matricula=Matricula;
    }

    public void setCarrera(String Carrera){
    	this.Carrera=Carrera;
    }

    public void setSemestre(int Semestre ){
    	this.Semestre=Semestre;
    }

    public String getMatricula(){
        return Matricula;
    }

    public String getCarrera(){
        return Carrera;
    }

    public int getSemestre(){
        return Semestre;
    }

	@Override
	public String toString() {
		
		return "Alumno [Nombre=" + Nombre + ", Matricula=" + Matricula + ", Semestre="
				+ Semestre + ", Tutor=" + this.Tutor.getNombre() + ", Carrera=" + Carrera + "]";
	}
    
    

}
