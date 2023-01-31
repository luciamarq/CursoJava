package scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class Lectura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fichero = null;
		FileReader fich = null;
		BufferedReader bf = null;
		 try {
			 String linea;
			 String[] separador;
			 fichero = new File ("C:\\Users\\lucia.marquez.garcia\\nombresyapellidos1");
			 fich = new FileReader(fichero);
			 bf = new BufferedReader(fich);
			 
			 while ((linea = bf.readLine())!=null) {
				 separador = linea.split("=");
				 System.out.println(separador[1]+ " ");
	
			 }
			 
			 
		 }catch(IOException excep){
			 excep.printStackTrace();
			 
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 if(bf!=null && fich !=null){
				 bf.close();
				 fich.close();
			 }
		 }
		 
	}

}
