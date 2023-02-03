package es.rf.tienda.exception;

@SuppressWarnings("serial")
public class DomainException extends Exception {
	
	public DomainException() {
		super("Error DomainException");
	}
	
	public DomainException(String mensaje) {
		super("DAO " + mensaje);
	}
	
	
	
	

}
