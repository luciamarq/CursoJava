package multitarea;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * Main que prueba la clase mensajes
		 */
		Mensaje m1 = new Mensaje();
		Mensaje m2 = new Mensaje();
		
		m1.setMensaje("Este mensaje es desde m1");
		m2.setMensaje("Este mensaje es desde m2");
		
		m1.start();
		m2.start();
		
		m2.setMensaje("************************");
		
	}


}
