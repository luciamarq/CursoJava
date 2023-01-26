package interfaces;

public interface Interface1 {
	

	/*
	 * Interfaz funcional con lambdas:
	 */
	
	/*
	 * Asume x defecto que es abatracto:
	 */
	public int cuenta (int a , int b);
	
	/*
	 * default para metodos ya resueltos en la interfaz:
	 */
	public default int resuelto(int a) {
		return a*2;
	}
	
}
