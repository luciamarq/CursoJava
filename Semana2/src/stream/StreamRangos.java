package stream;

import java.util.stream.IntStream;

public class StreamRangos {

	public static void main(String[] args) {
		
		/*
		 * Imprimir numeros del 1 al 79:
		 */
	
	IntStream numeros = IntStream.range(1, 80);
	numeros.forEach(System.out::println);

	}

}
