package noSincronizado;

public class MainNoSincronizado {

	public static void main(String[] args) {
		NoSincronizado s1 = new NoSincronizado();
		s1.setmensaje("Desde 1 ->");
		Thread thr1 = new Thread(s1);
		
		NoSincronizado s2 = new NoSincronizado();
		s2.setmensaje("Desde 2 ->");
		Thread thr2 = new Thread(s2);
		
		thr1.start();
		thr2.start();

	}

}
