package scanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoverFicheros {

	public static void main(String[] args) throws IOException {
		/*
		 * Mover un fichero:
		 */
		
		Path origen = Paths.get("C:\\Users\\lucia.marquez.garcia\\Desktop\\copia.txt");
		Path destino = Paths.get("C:\\Users\\lucia.marquez.garcia\\movido.txt");
		//Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);

	}

}
