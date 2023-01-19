package operadores;

public class Factura {

	public static void main(String[] args) {
		
		/*
		 * 
		 *Calcula la factura segun la cantidad,
		 *las unidades, el precio x unidad y el importe segun el iva. 
		 */
		
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		final double iva = 1.21;
		
		
		/*
		 * Hemos cambiado la variable iva a una cte:
		 * 
		 */
		cantidad = 3;
		unidades=12;
		precio=5.40;
		
		importe = cantidad*precio*unidades;
		total=(int)(importe*iva);
				
		System.out.println("Cantidad\t=" + cantidad);
		System.out.println("Unidades\t=" + unidades);
		System.out.println("Precio\t=" + precio);
		System.out.println("Importe\t=" + importe);
		System.out.println("Iva\t=" + importe*0.21);
		System.out.println("Total\t=" + total+ "deberia ser:" + importe*iva);

	}

}
