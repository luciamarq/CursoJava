package juegoCartas;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Juego {
	static int CARTAS = 5;
	static Baraja bar;
	static Set <Carta> baraja;
	static Set <Jugador> jugadores;
	public static void main(String[] args) {
	Baraja b = new Baraja();
	Iterator<Carta> it = baraja.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	

		
		
	}

}
