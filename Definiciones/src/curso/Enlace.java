package curso;

import java.sql.Time;
import java.time.LocalTime;

public class Enlace {
	public String url ;
	public LocalTime hora;
	public int indice;
	static int contador=0;
	//cambio el contador en el constructor de la clase:
	Enlace(){
		indice =contador++;
		
	}
	
	public void modificacion() {
		System.out.println(this);
		
		
		
	}
	
}

