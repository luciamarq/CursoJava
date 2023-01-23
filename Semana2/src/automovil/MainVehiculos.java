package automovil;

public class MainVehiculos {

	public static void main(String[] args) {
		
		
		Coche coche1 = new Coche (5, 240,6,4, 5, "Rojo", "SEAT");
		Camion camion = new Camion (5, 180, 6, 5, 15000, 400000);
		Moto moto = new Moto(5,220, 6, 0, 6);
		
		/*
		 * Cambiamos el estado del metodo a true;
		 */
		coche1.activarReductor(true);
		
		/*
		 * Imprimimos por pantalla los datos de cada uno de los objetos
		 */
		System.out.println(coche1.toString());
		System.out.println(camion.toString());
		System.out.println(moto.toString());
		

	}

}
