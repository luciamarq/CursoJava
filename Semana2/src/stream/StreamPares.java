package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPares {
	
	public static void main (String [] args) {
		int [] numero = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		/*
		 * Programa con stream que me devuelve los pares:
		 */
		
		int [] solucion = Arrays.stream(numero)
				.filter(s-> s%2 == 0)
				.toArray();
		
		Arrays.stream(solucion).forEach(System.out::println);
		
	}
	

}
