package persona;

public abstract class Persona {
	
	private String codPersona;
	private String nombre;
	private int edad;
	private String num_telf;
	
	//Constructor:
	public Persona(String codPersona, String nombre, int edad, String num_telf) {
		super();
		setCodPersona(codPersona);
		setNombre(nombre);
		setEdad(edad);
		setNum_telf(num_telf);
	}
	public String getCodPersona() {
		return codPersona;
	}
	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNum_telf() {
		return num_telf;
	}
	public void setNum_telf(String num_telf) {
		this.num_telf = num_telf;
	}
	@Override
	public String toString() {
		return " [codPersona=" + codPersona + ", nombre=" + nombre + ", edad=" + edad + ", num_telf=" + num_telf
				+ "]";
	}
	
	abstract void mostrar();
	
	
	
	
	

}
