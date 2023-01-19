package colecciones;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTMLDocument.Iterator;

public class PruebaList {

	public static void main(String[] args) {
		
		/*
		 * Añadir elementos del 1 al 10 a una ArrayList:
		 */
		
		List<String> lista1 = new ArrayList<String>();


		for (int i=1; i<=10; i++){

		lista1.add("Elemento "+i);
		
		

		}

		/*
		 * Añadimos un nuevo elemento al ArrayList en el indice 2. 
		 */

		lista1.add(2, "Elemento 3");

		 
		/*
		 * Imprimimos por pantalla todos los elementos: (1 al 10)
		 */
		for (String elemento : lista1) {
			System.out.println(elemento);
		}

	}

}
