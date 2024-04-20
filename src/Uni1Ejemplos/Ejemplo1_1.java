package Uni1Ejemplos;

public class Ejemplo1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.color="Rojo";
		auto1.marca="Vw";
		auto2.color="Negro";
		auto2.Kms="3000";
		auto1.modelo="jetta";
		auto2.marca="Nissan";
		
		System.out.println("Color del auto 1= "+ auto1.color);
		System.out.println("Modelo del auto 1= "+ auto1.modelo);
		System.out.println("Marca del auto 1= "+ auto1.marca);
		
		System.out.println("Color del auto 2= "+ auto2.color);
		System.out.println("Kilometraje del auto 2= "+ auto2.Kms);
		System.out.println("Marca del auto 2= "+ auto2.marca);		
	}
}
