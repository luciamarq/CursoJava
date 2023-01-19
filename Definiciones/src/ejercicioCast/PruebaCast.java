package ejercicioCast;

public class PruebaCast {

	
	public static void main(String[] args) {
		
		int numero= 12345;
		char c = (char) numero;
		float f = (float)numero;
		double d = (double) numero;
		byte b = (byte) numero;
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
