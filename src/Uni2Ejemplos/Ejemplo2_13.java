package Uni2Ejemplos;

public class Ejemplo2_13 {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("a2233336115", "Eder Gael Blanco Alejandre");
		
		Vehiculo vehiculo1 = new Vehiculo("BESTE", "Ferrari", "Rojo", 1200, true);
		
		Renta renta1  = new Renta(cliente1, vehiculo1, 12, 02, 2024, 3);
		
		System.out.println(cliente1.toString());
		System.out.println(vehiculo1.toString());
		
		System.out.println(renta1.getCliente().toString());
		System.out.println(renta1.getVehiculo().toString());
		
		System.out.println(renta1.pago());
	}

}
