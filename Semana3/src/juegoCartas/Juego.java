package juegoCartas;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Juego {
	
	static final int CARTAS = 5;
	static Baraja bar;
	static List <Carta> baraja;
	static List <Jugador> jugadores;
	private static  List<Carta> mano;
	
	public static void main(String[] args) {
		
		bar = new Baraja();
		baraja = bar.getBaraja(); //ya tengo mi baraja inicializada con las 52 cartas:
		
		//Como hemos usado ArrayList usaremos el metodo shuflle para "mezclar" las cartas:
		
		shuffle(baraja);
		
		//Imprimimos por pantalla nuestra baraja:
		baraja.forEach(System.out::println);
		
		
		jugadores = recibeJugadores(); //Me presenta a los jugadores sin cartas todavia repartidas: (sin mano)
		reparteCarta(baraja);
		System.out.println(jugadores.toString());
		//reparteJugador(baraja, jugadores); //reparte las cartas 
		
		//visualiza(jugadores);
		
	}
	
	
	static void reparteCarta(List <Carta>baraja) {
		//Iterator <Carta> it = baraja.iterator();
			for(Carta b : baraja) {	
			Jugador act = new Jugador();
			act.adicionarCarta(b);
			//System.out.println(act.toString());
			baraja.remove(b);
			
		}
			
	}
	
	
	
	
	//Metodo para mezclar la baraja
	 static<Carta> void shuffle(List<Carta> baraja) {
	    Collections.shuffle(baraja);
	}
	
	static List<Jugador> recibeJugadores(){
		
		List <Jugador> salida = new ArrayList<>();
		
		Jugador jugador1 = new Jugador("Lucia", 23);
		Jugador jugador2 = new Jugador("Aitor", 25);
		Jugador jugador3 = new Jugador("Andrea", 24);
		Jugador jugador4 = new Jugador("Paula", 46);
		
		salida.add(jugador1);
		salida.add(jugador2);
		salida.add(jugador3);
		salida.add(jugador4);
		
		//System.out.println(salida);
		return salida;
		
	}
	/*
	 * revisar el metodo: 
	 */
	
	
	
	static void visualizar() {
		System.out.println();
	}
}
