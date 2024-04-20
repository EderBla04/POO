package Uni4Examenes;

public class Blanco_Alejandre_Ex3 {
	
	public static void main(String[] args) {
		
		Discapicidad_visual paciente1 = new Discapicidad_visual("Eder", "19", "Invidencia", "Rojo");
		Discapacidad_motora paciente2 = new Discapacidad_motora("Leo", "18", "Parálisis ", "electrica");
		Discapacidad_auditiva paciente3 = new Discapacidad_auditiva("Isma", "20", "Perdida auditiva", "Audífonos intrauriculares");
		
		paciente1.mostrar();
		System.out.println();
		paciente2.mostrar();
		System.out.println();
		paciente3.mostrar();
	}

}
