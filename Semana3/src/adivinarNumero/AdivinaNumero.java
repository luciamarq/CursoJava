package adivinarNumero;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdivinaNumero {
	/*
	 * Juego que adivina un numero.
	 * Para ello, se obtiene aleatoriamente y
	 * se va pidiendo opciones hasta que el usuari
	 * introduzca el numero correcto x consola, 
	 * dando pistas comparativas de > o <;
	 */
	public static void main(String[] args) {
		
		
		int numero = ThreadLocalRandom.current().nextInt(0,100); //Genera num aleatorio entre 0 y 100:
		Scanner consola = new Scanner(System.in);
		int num_usuario; //numero recogido x consola por el usuario:

		do {
			System.out.println("**ADIVINA EL NUMERO**");
			System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
			num_usuario=consola.nextInt(); //inicializamos el numero de usuario:
			
			if(numero>num_usuario) {
				System.out.println("Introduce un numero mayor");
				
			}
			else if (numero<num_usuario) {
				System.out.println("Introduce un numero mas pequeño");
			}
		} while (numero!=num_usuario); 
			System.out.println("Enhorabuena!! Has acertado el numero :))" + numero);
		}
}
