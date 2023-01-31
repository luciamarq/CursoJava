package ejercicioCrono;

import java.text.DecimalFormat;

public class Cronometro02 {

	public static void main(String[] args)  throws InterruptedException{
		/*
		 * Cronómetro Version Miguel:
		 * 
		 */
		int h=0;
		int m=0;
		int s= 0;
		DecimalFormat miFormato = new DecimalFormat("00");
		for(h=0; h<60; h++) {
			for(m=0; m<=59; m++) {
				for(s=0; s<=59; s++) {
					System.out.println(miFormato.format(h) + ":" +
							miFormato.format(m)+ ":" +
							miFormato.format(s));
					Thread.sleep(1000);
				}
				
			}
		}
		
	}

}
