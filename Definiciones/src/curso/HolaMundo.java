package curso;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Pruebas de tipos");
		
		char c = 'A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		importeTotal = precio*iva+precio;
		
		System.out.println("Caracter: "+c); //Caracter: c
		
		System.out.println("Equivalencia Unicode:"+(int)c); //Equivalencia unicode:65
		System.out.println("Importe Total :" + importeTotal); //Importe total: 27.144
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\\Mar\\Mie\\Juev\\Vie");
		System.out.println("Lun\tMar\tMie\tJuev\tVie");
		System.out.println("\"Cocodrilo\"");
		
		
		
	}

}
