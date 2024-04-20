package Uni1Ejemplos;


public class Ejemplo1_5 {

    public static void main(String[] args) throws Exception{
		
	
    	
    	//crear un objeto de tipo tutorias
    	
    	Tutorias alumno = new Tutorias();
    	//crer un objeto de tipo de profesor
    	Profesor tutor1 = new Profesor();
    	
    	
    	//mediante la asignacion le voy a dar valor al objeto
    	// de tipo tutorias solo en los metodos, nombre, matricula
    	//carrera, semestre
    	alumno.setNombre("Eder Gael Blanco Alejandre");
    	alumno.setMatricula("2233336155");
    	alumno.setCarrera("Ingenieria en sistemas computacionales");
    	alumno.setSemestre(2);
    	
    	//mediante la asignacion le voy a dar valor
    	//al objeto tipo profesor
    	tutor1.setNombre("Irving Roman Garcia Cantero");
    	
    	//le asigno valor al objeto de tipo tutorias
    	//mediante su metodo tutor
    	alumno.setTutor(tutor1);
    	//mando a imprimir los valores del objeto tipo tutorias
    	System.out.println(alumno.toString());
    	
    }

}
