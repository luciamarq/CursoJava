package casting;

public class CambioTipoDeClase {

	public static void main(String[] args) {
		/*
		 * Casting de variables. Cambios de tipos de variables: 
		 */
			int numero= 12345;
			
			/*
			 *De int a char:
			 */
			char c = (char) numero;
			/*
			 *De int a float:
			 */
			
			float f = (float)numero;
			
			/*
			 *De int a double:
			 */
			double d = (double) numero;
			
			/*
			 *De int a byte:
			 */
			
			byte b = (byte) numero;
			
			/*
			 *De int a short:
			 */
			
			short s = (short) numero;
			
			//Mostamos la salida como:
			
			System.out.println("int " +  numero);
			System.out.println("char " +  c );
			System.out.println("float " + f );
			System.out.println("double " + d);
			System.out.println("byte " + b);
			System.out.println("short " + s );

	}

}
