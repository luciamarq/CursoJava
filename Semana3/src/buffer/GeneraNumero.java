package buffer;

import java.util.Random;

public class GeneraNumero implements Runnable {
	
	Buffer buf;
	
	public void setBuff(Buffer buf) {
		this.buf=buf;
	}
	@Override
	public void run() {
		Random rn = new Random();
		while(true) {
			synchronized (buf) {
				while(buf.estaDisponible()) {
					System.out.println("ESPERANDO ESPACIO....");
					try {
						buf.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				buf.setNumero(rn.nextInt());
				buf.setDisponible(true);
				System.out.println("Numero disponible");
				buf.notifyAll();
				
			}
		}
	}

}
