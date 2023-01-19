package buclesSaltos;

public class EsPrimo {

	
	/*
	 * Vamos a comprobar si un numero cualquiera es primo:
	 */
	public static void main(String[] args) {
		boolean esPrimo;
		int fin=100;
		int a = 2;
		
		//En cada iteraccion comprobamos si es primo:
		
		for(int i = 1; i<=fin; i++) {
			esPrimo = true;
			while(a<=(i/2) && esPrimo == true) {
				if(i%a == 0) {
					esPrimo = false;
					
				}
				a++;
				
				
			}
			if(esPrimo==true) {
				System.out.println(i + " es primo");
				
			}
			
			
		}

	}

}
