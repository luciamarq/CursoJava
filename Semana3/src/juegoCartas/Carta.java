package juegoCartas;

public class Carta {
	
	/*
	 * Clase carta con el que voy a rellenar
	 * mi HashSet de cartas en la clase baraja;
	 * Contiene un numero (1 al 12) y un palo:
	 * (oro, copas, bastos, diamantes);
	 */
	
	private int numero;
	private int palo;
	
	
	
	public Carta() {
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPalo() {
		return palo;
	}
	public void setPalo(int palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return "numero=" + numero + ", palo=" + palo;
	}
	
	
	
	

}
