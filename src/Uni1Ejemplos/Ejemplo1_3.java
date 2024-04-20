package Uni1Ejemplos;

public class Ejemplo1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleo empleado1, empleado2;
		empleado1= new Empleo();
		empleado2= new Empleo();
		
		empleado1.nombre="Juan";
		empleado1.actividad="Ingeniero";
		
		empleado2.nombre="Maria";
		empleado2.actividad="Cajera";
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());

	}

}
