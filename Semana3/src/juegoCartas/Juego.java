package juegoCartas;

import java.util.Iterator;
import java.util.Set;
import java.io.PrintStream;
import java.util.HashSet;

public class Juego {
	
	static final int CARTAS = 5;
	static Baraja bar;
	static Set <Carta> baraja;
	static Set <Jugador> jugadores;
	
	public static void main(String[] args) {
		
		bar = new Baraja();
		baraja = bar.getBaraja(); //ya tengo mi baraja inicializada con las 48 cartas:
		baraja.forEach(System.out::println);
	
		
		jugadores = recibeJugadores(); //Me presenta a los jugadores sin cartas todavia repartidas: (sin mano)
		//System.out.println(jugadores);
		
		reparteJugador(baraja, jugadores, CARTAS); //reparte las cartas 
		
		//visualiza(jugadores);
		
	}
	
	static Set<Jugador> recibeJugadores(){
		
		Set<Jugador> salida =new HashSet<>();
		
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
	static void reparteJugador(Set<Carta> baraja, Set<Jugador> jugadores, int num_cartas) {
		Iterator<Carta> it = baraja.iterator();
		for(int i=0; i<CARTAS; i++) {
			//for(Iterator<Jugador> mano = jugadores.) {
				//Jugador act = jugadores.add(jugador);
				//act.setMano(it);
				//it.remove();
				
			}
		}		

	static void visualizar() {
		System.out.println();
	}
}
