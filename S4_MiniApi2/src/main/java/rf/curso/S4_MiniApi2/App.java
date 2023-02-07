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
		System.out.println(cc.leerUno("DE"));
		Country datos = cc.leerUno("BR");
		Country al = cc.leerUno("DE");
		datos.setCountry_name("Lucia");
		al.setCountry_name("Alemania");
		cc.actualizar(al);
		al.setRegion_id("8");
		System.out.println(al);
		
		
	}

	private static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
		
	}
}
