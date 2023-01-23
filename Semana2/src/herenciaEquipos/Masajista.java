package herenciaEquipos;

public class Masajista extends Profesion {
	//Atributos:
	private String titulacion;
	private int aniosExperiencia;
	
	//Constructor:
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosEperiencia) {
		super(id, nombre, apellidos, edad);
		setAniosExperiencia(aniosEperiencia);
		setTitulacion(titulacion);
	}
	
	//getters and setters:
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	
	//toString:
	@Override
	public String toString() {
		return "Masajista" + super.toString()+ " [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}
	
	//metodos propios de la clase:
	public void darMasaje() {
		System.out.println(super.getNombre() + " dando un masaje ahora mismo...");
	}
	
	
	
	
	
	
	
	
	
}
