package buclesSaltos;

public class Factorial {

	/*
	 * Calcular el factorial de un numero: 
	 * Ejemplo: 8*7*6*5*4*3*2*1
	 */
	
	public static void main(String[] args) {
		
		double factorial;
		int numero = 8;
		
		factorial = 1;
		
		for (int i = numero; i>0 ; i--){
			factorial = factorial * i;
		}
		System.out.println("El factorial del numero " + numero + " es: " + factorial);
		
	}

}
