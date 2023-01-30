package scanner;

import java.io.IOException;
import java.util.Scanner;

public class PruebaScanner {
	/*
	 * Para poder leer la consola y recoger los datos de un input por consola:
	 */
	public static void main(String[] args)throws IOException {
		Scanner teclado = new Scanner(System.in);
		try(teclado){
			int n1,n2;
			System.out.println("Introduce un número: ");
			n1 = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Introduce un segundo número: ");
			n2= teclado.nextInt();
			teclado.nextLine(); //Esto es para que me lea los numeros de una linea completa
			System.out.format("Primer numero %d y segundo numero %d", n1,n2);
			
			
		}
		
	}

}
