package scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjercicioNombreApellido1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Pedir un nombre y un apellido y crear un archivo con el patron:
		 * NOMBRE = XXXXXXX,
		 * APELLIDO = YYYYYY
		 */
		Scanner entrada = new Scanner(System.in); //Se crea el lector

        System.out.println("Por favor ingrese su nombre: ");//Se pide un dato al usuario

        String nombre = entrada.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato
        System.out.println("Por favor ingrese su APELLIDOS: ");
        String apellido = entrada.nextLine();
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try 
        {
        	fichero = new FileWriter("C:\\Users\\lucia.marquez.garcia\\nombresyapellidos1");
        	pw = new PrintWriter(fichero);
        	
        	pw.write("Nombre =" + nombre +"\n" );
        	pw.write("Apellido =" + apellido);
        	
        }catch (Exception e) {
        	e.printStackTrace();
        	
        }finally {
        	try {
        		if(null!= fichero)
            		fichero.close();
        		
        	}catch(Exception e2){
        		e2.printStackTrace();
        	}
        		
        }
	}
}
