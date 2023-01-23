package herenciaEquipos;

public class Futbolista extends Profesion {
	
	//Atributos:
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		setDorsal(dorsal);
		setDemarcacion(demarcacion);
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	
	
	
	
	
	//metodos de la propia clase hija:
	
	@Override
	public String toString() {
		return "Futbolista"+  super.toString()+" [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}

	public void jugarPartido() {
		System.out.println("El futbolista con dorsal " + getDorsal() + " esta jugando un partido");
		
	}
	
	public void entrenar () {
		System.out.println(super.getNombre() + " esta entrenando");
	}
	
	
	
	
	
	

}
