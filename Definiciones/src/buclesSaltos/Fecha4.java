package buclesSaltos;

public class Fecha4 {

	public static void main(String[] args) {
		
		int dia = 31;
		int mes = 12;
		int ano = 1998;
		
		int [] diasMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(mes>=1 && mes<=12) {
			if(ano!=0) {
				if(ano%4==0 && ano%100!=0){
					diasMes[1]=29;
					
				}
				if(dia<=diasMes[mes-1]) {
					System.out.println("Fecha correcta");
					
				}
				else {
					System.out.println("Dia incorrecto");
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
