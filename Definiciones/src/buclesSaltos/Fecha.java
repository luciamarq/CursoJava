package buclesSaltos;

public class Fecha {

	public static void main(String[] args) {
		
		int dia = 20;
		int mes = 8;
		int ano=2015;
		
		//Primero asumiendo los meses de 30 dias:
		if(ano>0) {
			if(dia>=1 && dia<=30) {
				if(mes>=1 && mes<=12) {
					System.out.println("La fecha es valida");
				}
				else {
					System.out.println("El mes no es correcto");
				}
			}
			
		}
		
		else {
			System.out.println("El año no es valido");
		}
		
		
		
		

	}

}
