package interfaces;

public class MainInterface {
	

	public static void main(String[] args) {
		Interface1 objeto= (a,b) -> a + b;
		
		
		System.out.println(objeto.cuenta(3, 9));
		System.out.println(objeto.resuelto(5));
	}

}
