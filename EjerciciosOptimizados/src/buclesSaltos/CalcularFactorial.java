package buclesSaltos;

public class CalcularFactorial {

	public static void main(String[] args) {
		
		/*
		 * Calcula el factorial de un numero:
		 * Ejemplo factorial de 4: 4*4*3*2*1
		 */
		
		double factorial;
		int numero = 8;
		
		factorial = 1;
		
		for (int i = numero; i>0 ; i--){
			factorial = factorial * i;
		}
		System.out.println("El factorial del numero " + numero + " es: " + factorial);

	}

}
