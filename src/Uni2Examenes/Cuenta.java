package Uni2Examenes;

import java.util.ArrayList;
import java.util.Iterator;



public class Cuenta {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public void agregar(Cliente c, int numc) {
		

		this.clientes.add(c);

			
			
		}
		
		

		
		
	

		
	
	
	public void mostrar() {
		
		
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			
			Cliente var = it.next();
			System.out.println(var.toString());
		
		
	}
		
	}
}
