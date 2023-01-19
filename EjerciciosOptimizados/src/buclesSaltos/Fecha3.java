package buclesSaltos;

public class Fecha3 {

	public static void main(String[] args) {
		
		/*
		 * Validar la fecha ahora con un Array de dias del mes; 
		 * 
		 */
		int dia = 31;
		int mes = 12;
		int ano = 1998;
		
		int [] diasMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		if(mes>=1 && mes<=12) {
			if(ano!= 0) {
				if(dia<=diasMes[mes-1]) {
					System.out.println("Fecha correcta!!");
					
				}
				else {
					System.out.println("Dia no valido");
				}
					
			}
			else {
				System.out.println("Año no valido");
			}
		}
		else {
			System.out.println("Mes incorrecto");
		}

	}

}
