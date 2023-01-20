package colecciones;

public class PruebaIntercambio {

	public static void main(String[] args) {
		Intercambio prueba1 = new Intercambio("Esto es la primera cadena1", "Esto es la segunda cadena");
		
		String c1 = prueba1.getCadena1();
		String c2 = prueba1.getCadena2();
		
		/*
		 * Antes de intercambiar los objetos....
		 */
		System.out.println("Antes del intercambio");
		System.out.println("El texto de la cadena 1 es: " + c1 + "y la cadena 2 es: " + c2);
		prueba1.intercambio();
		
		
		/*
		 * Despues del intercambio: 
		 */
		
		System.out.println("Ahora la cadena 1 es: " + c1 + "y la cadena 2 es: " + c2);
		
	}

}
