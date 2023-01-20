package herencia;

public class PruebaPersona {
	
	/*
	 * Prueba para probar el programa de Herencia PERSONA.
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Creo un nuevo objeto Cliente y le paso los valores del constructor como param. 
		 */
		Cliente c1 = new Cliente("Lucia", "Oscar espla", "lu.marquez@hotmail.es", "311267", "17-11-2012");
		
		String nombre = c1.getNombre();
		String fecha = c1.getFechaAlta();
		c1.crear();
		c1.borrar();
		
		
		System.out.println(nombre);
		System.out.println(fecha);

	}

}
