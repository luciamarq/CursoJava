package herenciaEquipos;

public class Entrenador extends Profesion {
	
	//Atributos:
	private String idFederacion;
	
	/*
	 * Constructor:
	 */
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		setIdFederacion(idFederacion);
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		return "Entrenador: " + super.toString() + " [idFederacion=" + idFederacion + "]";
	}
	
	
	public void dirigirPartido() {
		System.out.println(super.getNombre() + " dirigiendo el partido...");
		
	}
	
	
	public void dirigirEntrenamiento() {
		System.out.println(super.getNombre() + " dirigiendo el entrenamiento...");
		
	}
	
	
	

}
