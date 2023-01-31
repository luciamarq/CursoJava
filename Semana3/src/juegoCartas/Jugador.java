package juegoCartas;

import java.util.HashSet;
import java.util.Set;

public class Jugador {
	private String nombre;
	private int edad;
	private Set<Carta> mano;
	
	public Jugador() {
		mano = new HashSet<>();
		
	}
	

}
