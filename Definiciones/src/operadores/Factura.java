package operadores;

public class Factura {

	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		
		
		cantidad = 3;
		unidades=12;
		precio=5.40;
		
		importe = cantidad*precio*unidades;
		total=(int)(importe*1.21);//cast de double a int;
				
		System.out.println("Cantidad\t=" + cantidad);
		System.out.println("Unidades\t=" + unidades);
		System.out.println("Precio\t=" + precio);
		System.out.println("Importe\t=" + importe);
		System.out.println("Iva\t=" + importe*0.21);
		System.out.println("Total\t=" + total+ "deberia ser:" + importe*1.21);
		

	}

}
