package juegoCartas;

import java.util.HashSet;
import java.util.Set;

public class Baraja {
	
	public static final String [] PALOS = {"OROS", "COPAS", "BASTOS", "ESPADAS"};
	
	//public static final int NUM_cartas=48;
	
	private Set<Carta> baraja = new HashSet<>();
	
	public Baraja() {
		for(String palo: PALOS) {
			for(int i =1; i<13; i++) {
				Carta car = new Carta();
				car.setNumero(i);
				car.setPalo(i);
				baraja.add(car);
				
			}
		
			
		}
	}
	
}
