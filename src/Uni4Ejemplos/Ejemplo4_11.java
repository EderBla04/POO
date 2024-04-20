package Uni4Ejemplos;

public class Ejemplo4_11 {
	
	public static void main(String[] args) {
		
		Feria feria = new Feria(3);
		
		Tipoboleto Adulto = new Tipoboleto("Adulto", 60.00);
		Tipoboleto Menor = new Tipoboleto("Niño", 40.00);
		Tipoboleto Mayor = new Tipoboleto("Abuelito", 20.00);
		
		feria.agregar(0, Mayor);
		feria.agregar(1, Menor);
		feria.agregar(2, Mayor);
		
		feria.ventaboletos(0, 2);
		feria.ventaboletos(1, 1);
		feria.ventaboletos(2, 2);
		
		System.out.println("El total a pagar es: "+feria.getIngreso());


		
		
	}
	

	


}
