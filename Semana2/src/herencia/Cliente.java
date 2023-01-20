package herencia;

public class Cliente extends Persona {
	
	/*
	 * Atributos propios de la clase hijo:
	 */
	private String numeroCliente;
	private String fechaAlta;
	
	/*
	 * Constructor de la clase que posee todos los metodos y atributos de Persona. 
	 */
	
	public Cliente(String nombre, String direccion, String correoElectronico, String numeroCliente, String fechaAlta) {
		super(nombre, direccion, correoElectronico);
		
		this.fechaAlta=fechaAlta;
		this.numeroCliente=numeroCliente;
	}
	
	/*
	 * Para que en ClienteExportacion obligatoriamente tenga esos atributos como param en el constructor.
	 */
	public Cliente(String nombre, String direccion, String correoElectronico) {
		
	}
	
	/*
	 * Para que en ClienteNacional no haga falta ningun campo obligatorio.
	 */
	public Cliente() {
		
	}
	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public void verFechaAlta() {
		System.out.println("Obteniendo fecha de Alta del cliente....");
	}
	
	/*
	 * Sobreescribimos el metodo abstracto de la clase Persona:
	 */
	
	@Override
	public String aString() {
		super.borrar();
		return "Cliente: " + getNombre();
	}
	
	

}
