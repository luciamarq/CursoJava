package buffer;

public class PresentaNumero implements Runnable {
Buffer buf;
public void setBuf(Buffer buf) {
	this.buf=buf;
}
	@Override
	public void run() {
		while(true) {
			synchronized (buf) {
				while(!buf.estaDisponible()) {
					System.out.println("Esperando numero...");
					try {
						buf.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.err.println(buf.getNumero());
				buf.setDisponible(false);
				buf.notifyAll();
				
			}
		}
		
		
	}

}
