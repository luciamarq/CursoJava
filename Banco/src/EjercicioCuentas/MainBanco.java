package EjercicioCuentas;

import java.time.LocalDate;

public class MainBanco {

	public static void main(String[] args) throws Exception {
		/*
		 * Creo una cuenta nueva con saldo total=0;
		 */
		Cuenta c = new Cuenta("467857456", "Lucia Marquez");
		System.out.println(c.toString());
		/*
		 * Prueba ingreso a la cuenta
		 */
		c.ingresar(100);
		System.out.println(c.toString());
		/*
		 * Prueba retirada en la cuenta
		 */
		c.retirar(1200);
		System.out.println(c.toString());
		
		/*
		 * Prueba ingreso con concepto y cantidad:
		 */
		c.ingresar("Beca de estudios", 1200);
		System.out.println(c.toString());
		
		
		/*
		 * Tarjeta de credito:
		 */
		
		/*
		 * Creo una cuenta para la tarjeta de credito de Paula:
		 * 
		 */
		Cuenta cuenta2= new Cuenta ("214354", "Paula Navarro");
		/*
		 * Creo una tarjeta de credito asociado a esa cuenta:
		 */
		Credito tarjeta_credito = new Credito("321837423864", "Paula Navarro", LocalDate.parse("2018-10-30"));
		tarjeta_credito.setmCuentaAsociada(cuenta2);
		
		/*
		 * Aqui tendre 2993 euros de Credito: (te quita del credito de la tarjeta)
		 */
		tarjeta_credito.pagoEnEstablecimiento("cafe", 7);
	
		System.out.println(tarjeta_credito.toString());
		
		/*
		 * Aqui vuelvo a tener los 3000
		 */
		tarjeta_credito.ingresar(7);
		System.out.println(tarjeta_credito.toString());
		
		
		
		//System.out.println(tarjeta_credito.getmCredito());
		
		
		 Cuenta cuenta3= new Cuenta ("217367642364", "Lola Pacheco");
		 Debito tarjeta_credito2 = new Debito("321837423864", "Lola Pacheco", LocalDate.parse("2021-10-30"));
		 tarjeta_credito2.setmCuentaAsociada(cuenta3);
		 System.out.println(tarjeta_credito2.toString());
		 tarjeta_credito2.retirar("Clases de piano", 100);
		 System.out.println(tarjeta_credito2);
		 
		 
		 
		

	}

}
