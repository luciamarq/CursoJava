package buclesSaltos;

public class CalcularMultiplo {

	public static void main(String[] args) {
		
		/*
		 * Recibe 2 numeros y comprueba si son multiplos y comprueba cual es mayor.
		 */
		
		int n1 = 20;
		int n2= 10;
		
		if (n1 == n2) {
			System.out.println("Los numeros son iguales");
		
		}
		else {
			if(n1<n2) {
				System.out.println(n2 + " es mayor que " + n1);
				
			}
			else {
				System.out.println(n1 + " es mayor que " + n2);
			}
		}
		if(n1%n2==0 || n2%n1==0) {
			System.out.println("SON MULTIPLOS");
		}
		else {
			System.out.println("NO es multiplo");
		}

	}

}
