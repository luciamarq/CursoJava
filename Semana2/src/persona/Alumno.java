package persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno extends Persona {
	
	private int curso;
	
	private List<String> asignaturas = new ArrayList<String>();
	
	/*
	 * Dejamos el constructor sin añadir necesariamente el array de asignaturas
	 * ya que se añadiran posteriormente en el main:
	 */
	public Alumno(String codPersona, String nombre, int edad, String num_telf, int curso) {
		super(codPersona, nombre, edad, num_telf);
		setCurso(curso);
	}

	
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/*
	 * Le pasamos como parametro una String con el nombre de la asignatura que añadiremos al array de 
	 * asiganturas. 
	 */
	public void setAsignaturas(String asignatura) {
		this.asignaturas = asignaturas;
		asignaturas.add(asignatura);
	}

	
	@Override
	public String toString() {
		return "Alumno " + super.toString() + " [curso=" + curso + ", asignaturas=" + asignaturas + "]";
	}
	
	
	/*
	 *  Muestra los atributos propios de cada clase hija:
	 */
	void mostrar() {
		System.out.println("Atributos especificos de alumno: " + " curso, asignatura");
		
	}






	
	
	
	
	
	
	
	
	
	


}
