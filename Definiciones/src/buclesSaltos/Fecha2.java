package buclesSaltos;


public class Fecha2 {

	public static void main(String[] args) {
		
		//Asumiendo los valores reales de los dias del mes:
		
		int dia = 31;
		int mes = 6;
		int ano=2015;
		
		//Primero con los meses de 28 dias:
		if(ano>0) {
			if(mes==2) {
				if(dia>=1 && dia<=28) {
					System.out.println("Fecha correcta");
				}
				else {
					System.out.println("Fecha incorrecta: Febrero solo tiene 28 dias");
				}
			}	
			//Segundo: con los meses de 31 dias:
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12) {
				if(dia>=1 && dia<=31) {
					System.out.println("Fecha correcta");
				}
				else {
					System.out.println("Fecha Incorrecta: Este mes solo tiene 31 dias");
				
				}
			}
			//Por ultimo con los meses de 30 dias 
			else {
				if(dia>=1 && dia<=30) {
					System.out.println("Fecha correcta");
					}
				else {
					System.out.println("Fecha invalida: este mes solo tiene 30 dias");
				}
			
			}
			
		}
		else {
			System.out.println("AÑO NO VALIDO");
		}
		
		
		

	}

}
