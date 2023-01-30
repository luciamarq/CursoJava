package scanner;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PruebaPath {

	public static void main(String[] args) {
		Path dir = Path.of("C:\\Users\\lucia.marquez.garcia\\git\\cursoAccenture\\Banco\\src\\EjercicioCuentas\\Cuentas.java");
		System.out.println("getFileName    " + dir.getFileName()); //nombre del archivo:
		System.out.println("getName(1)   " + dir.getName(0)); //directorio padre por indice:
		System.out.println("getName(2)   " + dir.getName(1)); //subdirectorio por indice:
		System.out.println("getNameCount   " + dir.getNameCount()); //cuenta el numero de ficheros existentes en la ruta indicada
		
		
	}
	

}
