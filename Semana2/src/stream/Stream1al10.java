package stream;

import java.util.stream.Stream;

public class Stream1al10 {

	public static void main(String[] args) {
		
		/*
		 * Secuencia de numeros desde 0 (inicio) a 9 
		 * (10 primero numeros -> limite)
		 */
		Stream.iterate(0,n -> n+1)
		.limit(10)
		.forEach(x->System.out.println(x));

	}

}
