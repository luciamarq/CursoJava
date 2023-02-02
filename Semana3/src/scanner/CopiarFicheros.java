package scanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopiarFicheros {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("C:\\Users\\lucia.marquez.garcia\\movido.txt");
		Path path2 = Paths.get("C:\\Users\\lucia.marquez.garcia\\copiado.txt");
		//Path copia = Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
		//System.out.println(copia.getFileName());

	}

}
