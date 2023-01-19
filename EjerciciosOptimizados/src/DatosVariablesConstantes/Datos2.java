package DatosVariablesConstantes;

public class Datos2 {
	
	/*
	 * En static ya que necesitamos que sea accesible en toda la clase y no solo en el main. 
	 */
	
	static int dia = 10;
	static long nDni = 57433222;
	static double precio;
	static final boolean ACTIVO = true;

	public static void main(String[] args) {
		/*
		 * Imprimir una serie de datos con variables accesibles desde toda la clase:
		 */
		
		precio=135.12;
		
		
		System.out.println("Dia\t" + dia);
		System.out.println("DNI\t" + nDni);
		System.out.println("Precio\t" + precio);
		System.out.println("Activo\t" + ACTIVO);

	}

}
