package buffer2;

public class PresentaNumero2 implements Runnable {
	
	Buffer buf;
	public void setBuff(Buffer buf) {
		this.buf = buf;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(buf.getNumero());
		}
		
	}
	

}
