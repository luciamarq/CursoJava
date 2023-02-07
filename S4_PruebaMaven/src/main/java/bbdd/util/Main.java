package bbdd.util;
import java.util.List;

import bbdd.modelos.Country;
import ficheros.controller.CountryController;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		CountryController cc = new CountryController();
		List <Country> ll = cc.leerTodos();
		listarCtr(ll);
		System.out.println("LEER UNO.......");
		System.out.println(cc.leerUno("'BR'"));
		Country datos = cc.leerUno("'BR'");
		datos.setCountry_name("Petrer");
	}

	private static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
		
	}

}
