package juegoCartas;

public class Carta {
	
	/*
	 * Clase carta con el que voy a rellenar
	 * mi HashSet de cartas en la clase baraja;
	 * Contiene un numero (1 al 12) y un palo:
	 * (oro, copas, bastos, diamantes);
	 */
	
	private int numero;
	private String palo;
	
	
	
	public Carta() {
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo2) {
		this.palo = palo2;
	}
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo;
	}
	
	
	
	

}
