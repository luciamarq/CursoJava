package scanner;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PruebaFileWriter {

	/*
	 * Genera un fichero nuevo con le salida operada en el codigo: 
	 * En este caso l salida será:
	 * Linea 0
	 * Linea 1
	 * etc...
	 */
	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("C:\\Users\\lucia.marquez.garcia\\Desktop\\pruebaFileWriter");
			pw = new PrintWriter(fichero);
			
			for(int i =0; i<10; i++)
				pw.println("Linea " + i);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != fichero) {
					fichero.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
				
			}
		}

	}

}
