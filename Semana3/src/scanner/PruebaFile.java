package scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PruebaFile {

	public static void main(String[] args)throws IOException {
		File fichero=new File ("C:\\Users\\lucia.marquez.garcia\\Desktop\\token.txt");
		try(Scanner leerFichero = new Scanner(fichero)){
			leerFichero.useDelimiter("\n");
			while(leerFichero.hasNext()) {
				String cadena = leerFichero.next();
				System.out.print(cadena + " ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
