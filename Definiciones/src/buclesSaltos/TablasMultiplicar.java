package buclesSaltos;

public class TablasMultiplicar {

	
	/*
	 * Calculamos las tablas de multiplicar del 1 al 10: 
	 */
	public static void main(String[] args) {
		int i; //indice del 1 al diez ( por lo que multiplicamos)
		int tab; // Valor de la tabla donde estamos
		
		for (tab = 1; tab<=10; tab++) {
			System.out.println("\n\nTabla del" + tab);
			for (i = 1; i<=10; i++) {
				System.out.println(tab + " x  " + i  + "  = " + tab * i);
			}
		}
	}

}
