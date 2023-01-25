package excepciones01;

public class MainCalculo {
	/*
	 * Lo controlamos con JVM
	 */
	public static void main(String[] args) throws ArithmeticException {
		/*
		 *Se trata de una division por cero por lo tanto la excepcion 
		 *Arithmetic lo capturara. Si cambiamos el valor de a, no produce ningun error: 
		 */
		
		int a = 0;
		int b = 300;
		int resultado;
		
		try {
			resultado = b/a;
			
			System.out.println("El resultado es: " + resultado);
			
		}
		finally {
			
			System.out.println("Programa finalizado");
		}

	}

}
