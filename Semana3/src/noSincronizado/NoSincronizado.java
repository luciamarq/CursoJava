package noSincronizado;

public class NoSincronizado implements Runnable {
	
	static Integer n = 1;
	
	private String mensaje;
	
	public void setmensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public void run() {
		for (int i =0; i<10; i++) {
			System.out.println(mensaje + " " + n);
			n++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		
			}	
		}
	}

}
