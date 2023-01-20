package herencia;

public class PruebaHerencia {

	public static void main(String[] args) {
		
		//Para producto:
		Producto p = new Producto("31-10-2011", "123456");
		
		p.toString();
		System.out.println(p);
		
		//Producto Fresco:
		
		Fresco f = new Fresco("02-4-1998", "3457Q", "12-10-1972", "España");
		
		f.toString();
		System.out.println(f);
		
		//Producto Refrigerado;
		
		Refrigerado r = new Refrigerado("31-12-1998", "12378Q", "0000");
		System.out.println(r);
		
		//Producto Congelado:
		
		Congelado c = new Congelado("12-10-1990", "15789D", "-12º");
		c.toString();
		System.out.println(c);
		
		
		//Producto CONGELADO DE AIRE:
		
		Aire a = new Aire("05-03-2022", "1235P", "-60º", 30, 40, 50, 100);
		a.toString();
		
		System.out.println(a);
		
		
		//Producto CONGELADO AGUA: 
		
		Agua a2 = new Agua ("06-02-2001", "12356L", "-50º", 38);
		a2.toString();
		System.out.println(a2);
		
		//PRODUCTO CONGELADO POR NITROGENO:
		
		Nitrogeno n = new Nitrogeno("31-7-1990", "3801w", "-70º", "CRIOGENICA", "-180º");
		
		n.toString();
		System.out.println(n);
		
		
		
		
		
		

	}

}
