package es.rf.tienda.dominio;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainTienda {

	public static void main(String[] args) throws Exception {
		
		//VA BIEN: ME LANZA LAS EXCEPCIONES POR ERROR DE CODIGO Y CUMPLELONGITUD:
		Producto p1 = new Producto("AB123", "Plumero con motor incorporado", 30, "A569", 1, 1);
		System.out.println(p1.toString());
		//Revisar el formato y arreglarlo:
		p1.setPro_fecActi(LocalDate.of(2023, 1, 30));
		System.out.println(p1.toString());

		
		
	}
	
	

}
