package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathList {
	
	/*
	 * Me permite recorrer directorios x ruta:
	 * files.list 
	 * files.walk
	 */

	public static void main(String[] args) throws IOException {
		Stream ficheros = Files.walk(Paths.get("."));
			ficheros
			.filter(t -> t.toString().contains(".java"))
			.forEach(System.out::println);
	}

}
