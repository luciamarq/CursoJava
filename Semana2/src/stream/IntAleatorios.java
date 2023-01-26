package stream;

import java.util.Random;
import java.util.stream.Stream;

public class IntAleatorios {

	public static void main(String[] args) {
		
		
		/*
		 * Imprime 20 numeros aleatorios entre 0 y 100:
		 */
		Random rand = new Random();
		Stream.generate(()-> rand.nextInt(100))
		.limit(20)
		.forEach(System.out::println); 
			
		
	}

}
