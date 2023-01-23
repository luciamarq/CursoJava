package herenciaEquipos;

public abstract class Profesion {
	
	 private int id;
	 private String nombre;
	 private String apellidos;
	 private int edad;
	 
	 
	 //Constructor de la clase padre:
	public Profesion(int id, String nombre, String apellidos, int edad) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEdad(edad);
	}

	//GETTERS ANS SETTERS:
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	//toSTRING:
	public String toString() {
		return "Profesion [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	
	//METODOS COMUNES EN LAS CLASES HIJAS:
	public void concentrarse() {
		
		System.out.println(getNombre() + " ESTA CONCENTRADO...");
			
	}
	
	public void viajar() {
		System.out.println(getNombre()+ " ESTA VIAJANDO");
	}
	
	
	
	
	
	
	
	
	 
	 
	
	
	
	 
	

}
