package Uni4Ejemplos;
import java.util.ArrayList;

public class Ejemplo4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Profesor>profes = new ArrayList<Profesor>();
		
		
		Phl phl1 = new Phl("2324","Olga Mares","5","400");
		Phl phl2 = new Phl("2233","Montoto","7","500");
		Ptc Ptc1 = new Ptc("3456","Isidro Moreno","10000");
		Ptc Ptc2 = new Ptc("6677","Chavira","20000");
		profes.add(phl1);
		profes.add(phl2);
		profes.add(Ptc1);
		profes.add(Ptc2);
		
		
		for(Profesor obj:profes) {
			if (obj instanceof Phl)
				System.out.println("datos del profesor completo = "+obj.toString()+" Salario = "+((Phl)obj).getPagoh());
			else
				if(obj instanceof Ptc)
					System.out.println("datos del profesor de horario libre = "+obj.toString()+" Salario = "+((Ptc)obj).getSalario());
		}
	}