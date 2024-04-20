package Uni3Ejercicios;

public class Evaluacion {
	
	private int n1, n2;
	
	
	public void Capturar(int num1, int num2 ) {
		
		this.n1=num1;
		this.n2=num2;
		

	}
	
	public void nMayor() {
		

		
		
		if(this.n1>this.n2) {
			
			System.out.println("El numero mayo es: "+this.n1);
			System.out.println("La tabla del mayor es: ");
			
			for(int i=1; i<=10; i++) {
				
				System.out.println(this.n1 +" * "+ i+ " = "+ (this.n1*i));

			}
			
			}
			
		else {
				
				for(int i=0; i<=10; i++) {
					
					System.out.println(this.n2 +" * "+ i+ " = "+ (this.n2*i));
				}

		}
		
		}
	
	public int Sumatoria() {
		
		int sumatoria=0;
		
		if(this.n1>this.n2) {
			
			for(int i=1; i<=10; i++) {
				
				sumatoria= sumatoria + (this.n1*i);
			}
			

			


			}
			
		else {
				
				for(int i=0; i<=10; i++) {
					
					sumatoria= sumatoria + (this.n2*i);
				}
				
		}
		
		return sumatoria;
		
	}
	
	public String evaluar(int suma) {
		
		String var="";
		
		if(suma%2==0) {
			
			var="El numero es par";
			
		}
		
		else var="El numero es impar";
		
		return var;
			
	}
	

	
	
	
	
	
	

}
