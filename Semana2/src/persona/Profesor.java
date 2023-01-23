package persona;

public class Profesor extends Persona {
	
	private float salario;
	private String fecha_contratacion;
	
	
	public Profesor(String codPersona, String nombre, int edad, String num_telf, float salario,
			String fecha_contratacion) {
		super(codPersona, nombre, edad, num_telf);
		setSalario(salario);
		setFecha_contratacion(fecha_contratacion);
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getFecha_contratacion() {
		return fecha_contratacion;
	}
	public void setFecha_contratacion(String fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}
	@Override
	public String toString() {
		return "Profesor" + super.toString() + "[salario=" + salario + ", fecha_contratacion=" + fecha_contratacion + "]";
	}
	@Override
	
	/*
	 * Muestra los atributos propios de cada clase hija:
	 */
	void mostrar() {
		System.out.println("Atributos especificos de profesor: " + " salario, fecha de contratacion");
		
	}
	
	
	
	
	
	

}
