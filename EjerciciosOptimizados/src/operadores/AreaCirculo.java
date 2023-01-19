package operadores;

public class AreaCirculo {

	public static void main(String[] args) {
		
	/*
	 * Calcular el area de un circulo conociendo radio: 
	 */
		int radio = 23;
		final double NUM_PI = Math.PI;
		
		double area = (int)Math.pow(radio, 2)*NUM_PI;
		double longitud = 2* NUM_PI*radio;
	
		System.out.println("El area de un circulo con radio: " + radio + " es " + area);
		System.out.println("La longitud de un circulo con radio: " + radio + " es " + longitud);

	}

}
