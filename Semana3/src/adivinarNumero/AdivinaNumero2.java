package adivinarNumero;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.processing.SupportedSourceVersion;

public class AdivinaNumero2 {
	
	
	static int min = 0;
	static int max = 1000;
	static boolean finJuego;
	static boolean finPartida;
	static int numero;
	static int numero_usuario;
	
	public static void main(String[] args) {
		
	
		while(!finJuego) {
			while(!finPartida) {
				tiradaPersona();
				tiradaMaquina();
				
			}
			
			tiradaMaquina();
		}
		System.out.println("JUEGO ACABADO");
		
	}	
	
	private static void tiradaPersona() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = ThreadLocalRandom.current().nextInt(0,100);
		int num_usuario; //numero recogido x consola por el usuario:

		do {
			num_usuario=sc.nextInt(); //inicializamos el numero de usuario:
			
			if(numero>num_usuario) {
				System.out.println("Introduce un numero mayor");
				
			}
			else if (numero<num_usuario) {
				System.out.println("Introduce un numero mas pequeño");
			}
		} while (numero!=num_usuario); 
			System.out.println("Enhorabuena!! Has acertado el numero :))" + numero);
				finPartida=true;
		}
		


	public static void tiradaMaquina() {
		int numero_maquina= ThreadLocalRandom.current().nextInt(min,max);
		System.out.println("Nuevo Juego, ¿que numero estas pensando?" +  numero_maquina);
		Scanner sc = new Scanner(System.in);
		String respuesta ="";
		int mi_numero;
		respuesta = sc.nextLine();
		
		if(respuesta.equalsIgnoreCase("M")) {
			mi_numero = ((min+max)/2);
			min = numero_maquina;
			finJuego=false;
			//System.out.println(min);
			//System.out.println(max);
			
			
		}
		if(respuesta.equalsIgnoreCase("n")) {
			mi_numero = ((min+max)/2);
			max = mi_numero;
			finJuego=false;
			//System.out.println(min);
			//System.out.println(max);
		}
		if(respuesta.equalsIgnoreCase("F")) {
			System.out.println("Ganaste");
			finJuego=true;
				
		}
		
	}
	
	
	
}
