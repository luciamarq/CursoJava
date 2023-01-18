package buclesSaltos;

public class NumerosLetras {

	public static void main(String[] args) {


		/*
		 * PRIMERO LA VERSION PRIMITIVA:
		 */
		
		int num = 15;
		int decenas;
		int unidades;
		
		unidades = num%10;
		decenas = num / 10;
		switch(decenas) {
		case 0:
			System.out.print("Sin numero...");
			break;
		case 1:
			System.out.print("Diez");
			break;
		case 2: 
			System.out.print("Veinte");
			break;
		case 3:
			System.out.print("Treinta");
			break;
		case 4: 
			System.out.print("Cuarenta");
			break;
		case 5: 
			System.out.print("Cincuenta");
			break;
		case 6:
			System.out.print("Sesenta");
		case 7:
			System.out.print("Setenta");
			break;
		case 8:
			System.out.print("Ochenta");
		case 9:
			System.out.print("Noventa");
			break;
		}
		
		System.out.print(" y ");
		switch(unidades){
			case 0:
				System.out.println(" ");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
			System.out.println("cuatro");
			break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
				break;
		}
		
		
		/*
		 * Para la segunda parte, 
		 * creamos dos arrays con las palabras:
		 */
		
		//Para las unidades:
		String [] a1 = {"uno", "dos", "tres", "cuatro", "cinco", 
				"seis", "siete", "ocho", "nueve", "diez", "once", "doce",
				"trece", "catorce", "quince"};
		
		String [] a2 = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", 
				"ochenta", "noventa"};
		
		
		if(num>0) {
			if(num<16) {
				System.out.println(a1[num-1]);
				
			}
			else {
				System.out.println(a2[decenas-1] + " y " + a1[unidades-1]);
				
			}
		}
		
			
		
		
		

	}

}
