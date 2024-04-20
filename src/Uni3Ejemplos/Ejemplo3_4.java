package Uni3Ejemplos;

public class Ejemplo3_4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//concentrar los datos de tres empleados
		//calcular el pago de cada uno
		//mostrar la informacion
		//calculo total de la nomina
		
		
		Datos d1 = new Datos();
		Datos d2 = new Datos();
		Datos d3 = new Datos();
		
		d1.setDias(5);
		d1.setHoras(20);
		d1.setPago(150);
		
		d2.setDias(5);
		d2.setHoras(12);
		d2.setPago(150);
		
		d3.setDias(5);
		d3.setHoras(8);
		d3.setPago(150)		
		Pagos p = new Pagos();
		p.calcular(d1);
		Pagos p2 = new Pagos();
		p2.calcular(d2);
		Pagos p3 = new Pagos();
		p3.calcular(d3);
		
		
		
		System.out.println("El iva calculado es= "+d1.getIva());
		System.out.println("Salario= "+d1.getSalario());
		System.out.println("El iva calculado es= "+d2.getIva());
		System.out.println("Salario= "+d2.getSalario());
		System.out.println("El iva calculado es= "+d3.getIva());
		System.out.println("Salario= "+d3.getSalario());
		p.nomina(d1, d2, d3);
		
		d1.finalize();
		p.finalize();
		

	}

}
