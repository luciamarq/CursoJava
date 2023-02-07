package rf.curso.S4_MiniApi2;

import java.util.List;


import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.*;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		
		CountryController cc = new CountryController();
		List <Country> ll = cc.leerTodos();
		listarCtr(ll);
		System.out.println("LEER UNO.......");
		System.out.println(cc.leerUno("'BR'"));
		Country datos = cc.leerUno("'BR'");
		datos.setCountry_name("Lucia");
	}

	private static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
		
	}
}
