package buclesSaltos;

public class DibujarCuadrado {

	public static void main(String[] args) {
		
		/* 
		 * Diujar un cuadrado con * semejante al ejemplo. 
		 */
		
		int pos=8; 
		int fila; 
		int columna;
		
		for(fila=1; fila<=pos; fila++) {
			for(columna=1; columna <=pos; columna++) {
				System.out.print("*  "); //print sin salto de linea 
			}
			System.out.println(""); //Ahora si va con salto de linea. 
		}

	}

}
