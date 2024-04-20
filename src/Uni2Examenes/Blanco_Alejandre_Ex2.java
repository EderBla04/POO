package Uni2Examenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blanco_Alejandre_Ex2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Cuenta cuentas = new Cuenta();
		
		System.out.println("Banco chaviriano");
		
		while(true) {
				
		System.out.println("Ingrese el nombre completo");
		String n = bf.readLine();
		System.out.println("Ingrese el numero de cuenta");
		int nc = Integer.parseInt(bf.readLine());
		System.out.println("Ingrese el saldo actual");
		int sa = Integer.parseInt(bf.readLine());
		
		Cliente clientes = new Cliente(n, nc , sa);
		
		cuentas.agregar(clientes, nc);
		
		System.out.println("Agregar otro cliente(1=si, 2=no)");
		int op= Integer.parseInt(bf.readLine());
		
		if(op==2) break;
		
		}
		
		cuentas.mostrar();
		
		
	}

}
