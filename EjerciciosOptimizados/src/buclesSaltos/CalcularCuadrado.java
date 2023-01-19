package buclesSaltos;

public class CalcularCuadrado {

	public static void main(String[] args) {
		
		/* 
		 * Calcula el cuadrado de un numero; Ahora vamos a usar la funcion Math.pow 
		 * en vez de multiplicarlo por si mismo. 
		 * 
		 */
		
		int num;
		double cuadrado;
		//Recorremos los argumentos pasados como parametro.
		for(String numeros: args) {  
			num = Integer.parseInt(numeros); //Convertimos a entero, ya que en la linea anterior lo recibimos como cadena.
			double n = (double) num; //casting de entero a double:
			cuadrado = Math.pow(n, 2);
			
			
			System.out.println("El cuadrado de " + num + " es igual a " + cuadrado);
			
			
		}

	}

}
