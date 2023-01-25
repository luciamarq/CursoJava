package persona;

public class MainPersona {

	public static void main(String[] args) {
		
		/*
		 * Creamos un objeto de cada clase para testear el programa:
		 */
		
		Alumno alumno = new Alumno("45097767W", "Lucia", 12, "896781827",6);
		/*
		 * Añadimos la asignatura mates al alumno 
		 */
		alumno.setAsignaturas("Mates");
		alumno.setAsignaturas("Historia");
		System.out.println(alumno.toString());
		
		Profesor profesor = new Profesor("46076655D", "Luis", 47, "456890976", 1200, "6/9/2001");		
		profesor.mostrar();
		System.out.println(profesor);
		
		
		
		
	}

}
