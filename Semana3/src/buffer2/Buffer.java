package buffer2;

public class Buffer {
	private boolean disponible;
	private int numero;
	public boolean estaDispoible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}
	public synchronized int getNumero() {
		while(!this.estaDispoible()) {
			System.out.println("Esperando numero");
			try {
				this.wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		setDisponible(false);
		this.notifyAll();
		return numero;
		
	}
	public synchronized void setNumero(int numero) {
		while(this.estaDispoible()) {
			System.out.println("Esperando espacio...");
			try {
				this.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.numero = numero;
		setDisponible(true);
		this.notifyAll();
	}
	
	
}
