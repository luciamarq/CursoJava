package herenciaEquipos;

import java.util.ArrayList;
import java.util.List;

public class MainProfesiones {

	public static void main(String[] args) {
		
		//Creamos varios objetos de cada clase:
		
		Profesion futbolista1 = new Futbolista(1, "Lucia", "Marquez Garcia", 24, 57, "Delantero");
		Profesion futbolista2 = new Futbolista(2, "Maria", "Malo Martinez", 23, 135, "Portera");
		
		
		Profesion entrenador1 = new Entrenador (3, "Aitor", "Garcia Malo", 25, "FIFA");
		Profesion entrenador2 = new Entrenador (4, "Antonio", "Galvez Lozano", 25, "Copa del rey");
		
		Profesion masajista1= new Masajista (5, "Paula", "Requena Solis", 30, "Fisioterapeuta", 2);
		Profesion masajista2= new Masajista (6, "Andrea", "Poveda Sabuco", 23, "Fisioterapeuta", 8);
		
		//Creamos el array donde meteremos los objetos creados:
		
		List<Profesion> lista = new ArrayList<Profesion>();
		
		/*
		 * Y los añadimos:
		 */
		
		lista.add(futbolista1);
		lista.add(futbolista2);
		lista.add(entrenador1);
		lista.add(entrenador2);
		lista.add(masajista1);
		lista.add(masajista2);
		
		
		/*
		 * Recorro mi ArrayList de profesionales invocando los metodos comunes:
		 */
		for (Profesion profesional: lista) {
			profesional.concentrarse();
			profesional.viajar();
			
			/*
			 * Y depende del tipo, invocamos los metodos propios de las
			 * clases hijas:
			 */
			
			if(profesional instanceof Futbolista) {
				((Futbolista)profesional).jugarPartido();
				((Futbolista)profesional).entrenar();
			}
			if(profesional instanceof Entrenador) {
				((Entrenador) profesional).dirigirPartido();
				((Entrenador) profesional).dirigirEntrenamiento();
			}
			
			if(profesional instanceof Masajista) {
				((Masajista) profesional).darMasaje();
			}
			
		}
	
	}	
	
	

}
