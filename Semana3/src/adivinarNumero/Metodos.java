package adivinarNumero;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Metodos {
	
	public boolean tiradaPersona() {
		int numero = ThreadLocalRandom.current().nextInt(0,100); //Genera num aleatorio entre 0 y 100:
		Scanner sc = new Scanner(System.in);
		int numero_usuario;
		
		do {
			System.out.println("Adivina el numero**");
			System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
			numero_usuario=sc.nextInt(); //inicializamos el numero de usuario:
			
			
			if(numero>numero_usuario) {
				System.out.println("Introduce un numero mayor");
				return false;
				
			}
			else if (numero<numero_usuario) {
				System.out.println("Introduce un numero mas pequeño");
				return false;
			}
		} while (numero!=numero_usuario); 
			//vecesGanadasUsuario++;
			System.out.println("Enhorabuena!! Has acertado el numero :))" + numero);
			//System.out.println("Llevas ganadas " + vecesGanadasUsuario + "partidas");
			return true;
			
		}
	
	
	/*
	 * Falta el metodo de la tirada de la maquina;
	 */
		
	}
	

