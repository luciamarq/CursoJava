package buclesSaltos;

public class Fecha2 {

	public static void main(String[] args) {
		/*
		 * Modificamos el codigo para que no sea una sucesion de if y else anidados:
		 */
		//Asumiendo los valores reales de los dias del mes:
		
				int dia = 31;
				int mes = 6;
				int ano=2015;
				
				boolean diaValido=false;
				if(mes>=1 && mes <=12) {
					if(ano!=0) {
						switch(mes) {
						case 1: case 3: case 5: case 7: case 8: case 10: case 12:
							if(dia<=31) {
								diaValido=true;
								break;
							}
						case 4: case 6: case 9: case 11:
							if(dia<=30) {
								diaValido=true;
								break;
							}
						default:
							if(diaValido) {
								System.out.println("Fecha correcta");
							}
						
						}
					}
				}	
	}
}