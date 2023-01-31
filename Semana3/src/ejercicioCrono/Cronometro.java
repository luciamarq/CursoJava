package ejercicioCrono;

import java.util.concurrent.TimeUnit;

public class Cronometro {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Cronometro que muestre hora, min, seg en formato 00:00:00
		 * 
		 */
		int hora;
		int minutos;
		int segundos;
		
		String borrar = "\b\b\b\b\b\b\b\b";
		
		//Para las horas:
		for (hora = 0; hora<23; hora++) {
			//minutos:
			for(minutos=0; minutos<=59; minutos++) {
				//Segundos:
				for(segundos=0; segundos<=59; segundos++) {
								
					System.out.printf("%02d:%02d:%02d", hora, minutos, segundos);
					Thread.sleep(1000);
					System.out.println(borrar);
				}
			}
		}

	}

}
