package buclesSaltos;

public class CalculaCuadrados {

	public static void main(String[] args) {
		int num;
		int cuadrado;
		//Recorremos los argumentos pasados como parametro.
		for(String numeros: args) {  
		
			num = Integer.parseInt(numeros); //Convertimos a entero, ya que en la linea anterior lo recibimos como cadena.
			cuadrado = num * num ;
			System.out.println("El cuadrado de " + num + " es igual a " + cuadrado);
			
			
		}

	}

}
