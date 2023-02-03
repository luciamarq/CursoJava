package juegoCartas;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Juego {
	
	static final int CARTAS = 5;
	static Baraja bar;
	static Set <Carta> baraja;
	static List <Jugador> jugadores;
	private static  Set<Carta> mano;
	
	public static void main(String[] args) {
		
		bar = new Baraja();
		baraja = bar.getBaraja(); //ya tengo mi baraja inicializada con las 48 cartas:
		baraja.forEach(System.out::println);
		
		
	
		
		jugadores = recibeJugadores(); //Me presenta a los jugadores sin cartas todavia repartidas: (sin mano)
		//System.out.println(jugadores.toString());
		
		//reparteCarta(baraja);
		System.out.println(jugadores.toString());
		//reparteJugador(baraja, jugadores); //reparte las cartas 
		
		//visualiza(jugadores);
		
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
	/*
	static void reparteJugador(Set<Carta> baraja, List <Jugador> jugadores) {
		//Iterator<Carta> it = baraja.iterator();
		int i;
		for(i=0; i<CARTAS; i++){
			while(it.hasNext()) {
				Jugador act = jugadores.set(i, mano);
				//System.out.println(jugadores1.get(i));
				act.setMano(it);
				//it.remove();
			}
		}
			
	}
	*/
	static void reparteCarta(Set <Carta> baraja) {
		Iterator<Carta> it = baraja.iterator();
		for(Jugador j: jugadores) {
			for (Carta carta : baraja) {
				Jugador act = new Jugador();
				act.setMano();
				
			} 
				
				
			}
			
		}
	
	

	
	
	static void visualizar() {
		System.out.println();
	}
}
