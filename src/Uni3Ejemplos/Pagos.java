package Uni3Ejemplos;

public class Pagos {
	
	public void calcular(Datos d) {
		
		double ingreso, iva, neto;
		ingreso=d.getHoras()*d.getDias()*d.getPago();
		
		if(ingreso > 3000) {
			
			iva= ingreso*0.08;
			
			
			
		}
		else {
			
			iva=0;
			
			
		}
		
		neto=ingreso-iva;
		
		d.setIva(iva);
		d.setSalario(neto);
		
		
	
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.err.println("Liberandio memoria obj pagos");
	}
	
	public void nomina(Datos d, Datos d2, Datos d3) {
		
		double nomina= d.getSalario()+d2.getSalario()+d3.getSalario();
		System.out.println("La nomina es: "+nomina);
		
		
	}
	


}
