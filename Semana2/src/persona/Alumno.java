package persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno extends Persona {
	
	private int curso;
	private String  [] asignaturas;
	
	
	public Alumno(String codPersona, String nombre, int edad, String num_telf, int curso) {
		super(codPersona, nombre, edad, num_telf);
		this.curso = curso;
		this.asignaturas=asignaturas;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String[] getAsignaturas() {
		return asignaturas;
		
	}
	public void setAsignaturas() {
		this.asignaturas=asignaturas;
		
		
	}
	

	@Override
	public String toString() {
		return "Alumno" + super.toString() + " [curso=" + curso + ", asignaturas=" + Arrays.toString(asignaturas) + "]";
	}

	@Override
	/*
	 *  Muestra los atributos propios de cada clase hija:
	 */
	void mostrar() {
		System.out.println("Atributos especificos de alumno: " + " curso, asignatura");
		
	}


	
	
	
	
	
	
	
	
	
	


}
