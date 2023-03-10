package juegoCartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baraja {
	 
	
	public static final String [] PALOS = {"Diamantes", "Corazones", "Picas", "Treboles"};
	
	//public static final int NUM_cartas=48;
	
	private List<Carta> baraja = new ArrayList<>();
	
	//Se crea la baraja con el constructor:
	public Baraja() {
		for(String palo: PALOS) {
			for(int i=1; i<14; i++) {
				Carta car = new Carta();
				car.setNumero(i);
				car.setPalo(palo);
				baraja.add(car);
			}
			
		}
		
	}
	
	

	public List<Carta> getBaraja() {
		return baraja;
	}



	public void setBaraja(List<Carta> baraja) {
		this.baraja = baraja;
	}



	@Override
	public String toString() {
		return "Baraja" + baraja ;
	}



	
	
}
