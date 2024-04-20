package Uni2Ejemplos;
import java.util.ArrayList;

public class Ejemplo2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Productos1>productos = new ArrayList<Productos1>();
		
		Productos1 prod1 = new Productos1(1, "cafe 1",50);
		Productos1 prod2 = new Productos1(2, "cafe 2",40);
		Productos1 prod4 = new Productos1(4, "cafe 4",70);
		
		productos.add(prod1);
		productos.add(prod2);
		productos.add(new Productos1(3, "Cafe 3",60));
		
		productos.set(1, prod4);
		productos.remove(0);
		
		for(int i=0; i<productos.size();i++) {
			
			
			
		}
		
		if(productos.isEmpty()) {
			
			System.out.println("El array esta vacio");
			
		}
		
		else System.out.println("El array contiene informacion");
		
		

	}

}
