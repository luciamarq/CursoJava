package optionalStream;
import java.util.Optional;

public class StringOptional {

	public static void main(String[] args) {
		
		/*
		 * Para evitar que salte una excepcion por valor nulo
		 * en alguna variable utilizamos un Optional (Stream)
		 */
		String nombre = null;
		Optional <String> nombre2 = Optional.ofNullable(nombre);
		nombre2.ifPresent(n -> System.out.println(n.length()));
		System.out.println(Optional.ofNullable(nombre).orElse("Peter"));
		
	}

}
