package buclesSaltos;

public class Nota {
	static int nota;
	static String notaFinal;

	public static void main(String[] args) {
		nota = 0;
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			notaFinal="INSUFICIENTE";
			System.out.println(notaFinal);
			break;
		case 5:
			notaFinal="SUFICIENTE";
			System.out.println(notaFinal);
			break;
		case 6: 
			notaFinal="SUFICIENTE";
			System.out.println(notaFinal);
			break;
		case 7:
			notaFinal="NOTABLE";
			System.out.println(notaFinal);
			break;
		case 8:
			notaFinal="NOTABLE";
			System.out.println(notaFinal);
			break;
		case 9:
			notaFinal="EXCELENTE";
			System.out.println(notaFinal);
			break;
		case 10:
			notaFinal="MATRICULA DE HONOR";
			System.out.println(notaFinal);
			break;
		default:
			System.out.println("ERROR...NO SE ADMITE EL TIPO DE NOTA");
			
		}

	}

}
