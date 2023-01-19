package DatosVariablesConstantes;

public class DatosArray2 {

	public static void main(String[] args) {

		/*
		 * Ahora rellenamos automaticamente con un bucle
		 */
		int nuevoArray2[][]=new int[5][7];
		int contador=0;
		
		/*
		 * i es la posicion del primer array y j la subposicion dentro del primero: 
		 */
		
		for(int i=0; i<nuevoArray2.length; i++) {
			for (int j=0; j<nuevoArray2[i].length; j++){
				if(contador <=31 ) {
					nuevoArray2[i][j]=++contador;
				}
			}
		}

	}

}
