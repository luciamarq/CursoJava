package buclesSaltos;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		boolean esprimo;
		int fin=100;
		int a = 2;
		
		//En cada iteraccion comprobamos si es primo:
		
		for(int i = 1; i<=fin; i++) {
			esprimo = true;
			while(a<=(i/2) && esprimo == true) {
				if(i%a == 0) {
					esprimo = false;
					
				}
				a++;
				
				
			}
			if(esprimo==true) {
				System.out.println(i + " es primo");
				
			}
			
			
		}
		
		
		

	}

}
