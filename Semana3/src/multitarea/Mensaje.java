package multitarea;

public class Mensaje extends Thread {
	
	private String mensaje;
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}
	
	@Override
	public void run() {
		for (int i =0; i<100; i++) {
			System.out.println(i + "-" + mensaje);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
