package Uni4Ejemplos;

public class Ejemplo4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Algebra algebra = new Algebra();
		Estudiante estudiante = new Estudiante("a223336115","Eder",algebra);
		
		System.out.println(estudiante.getDatos());
		System.out.println(estudiante.estado());

	}

}
