package ejercicioSintaxis;

public class Sintaxis {

	public static void main(String[] args) {
		int $nombre;
		 int pasado; //debe empezar x minuscula y estar bien escrita. 
		 int alcance; //Falta un punto y coma:
		 
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		 pasado=_contador; //La variable esta mal declarada y no se puede hacer referencia a ella.

		 System.out.println($nombre + " / " + _contador);
		 System.out.println("En Java puede\n");
	}

}
