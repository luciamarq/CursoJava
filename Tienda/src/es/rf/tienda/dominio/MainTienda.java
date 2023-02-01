package es.rf.tienda.dominio;

import java.time.LocalDate;

public class MainTienda {

	public static void main(String[] args) throws Exception {
		
		//VA BIEN: ME LANZA LAS EXCEPCIONES POR ERROR DE CODIGO Y CUMPLELONGITUD:
		Producto p1 = new Producto("AB123", "Plumero con motor incorporado", 30, "A569", 1, 1);
		System.out.println(p1.toString());
		//Revisar el formato y arreglarlo:
		p1.setPro_fecActi(LocalDate.of(2023, 5, 30));
		System.out.println(p1.toString());
		p1.setPro_fecRepos(LocalDate.of(2027, 3, 13));
		p1.setPro_fecDesacti(LocalDate.of(2028, 3, 15));
		
		System.out.println(p1.toString());
		
		Usuario user1  = new Usuario(1,"Lucia", "lu.marquez@hotmail.es", "Lucia3112@~%",1);
		Usuario user2 = new Usuario(6,"Lucia", "lu.reca@hotmail.es", "Lucia3112@~%",1);
		Usuario user3 = new Usuario();
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString()); //Autonumerico Usuario ok
		//user1.setUser_dni("46.087.772-P"); //Lanza bien la excepcion
		Categoria c = new Categoria();
		Categoria c1 = new Categoria();
		//System.out.println(c1); //Autonumerico Categoria ok :
		
		//System.out.println(c);

		
		
	}
	
	

}
