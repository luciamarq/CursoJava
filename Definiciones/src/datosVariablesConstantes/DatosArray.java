package datosVariablesConstantes;

public class DatosArray {

	public static void main(String[] args) {
		
		int nuevoArray[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int nuevoArray2[][]=new int[5][7];
		int contador=0;
		
		for(int i=0; i<nuevoArray2.length; i++) {
			for (int j=0; j<nuevoArray2[i].length; j++){
				if(contador <=31 ) {
					nuevoArray2[i][j]=++contador;
					//System.out.println(nuevoArray2);
				}
			}
		}
		
		
	
		/*
		nuevoArray2[0][0]=1;
		nuevoArray2[0][1]=2;
		nuevoArray2[0][2]=3;
		nuevoArray2[0][3]=4;
		nuevoArray2[0][4]=5;
		nuevoArray2[0][5]=6;
		nuevoArray2[0][6]=7;
		nuevoArray2[1][0]=8;
		nuevoArray2[1][1]=9;
		nuevoArray2[1][2]=10;
		nuevoArray2[1][3]=11;
		nuevoArray2[1][4]=12;
		nuevoArray2[1][5]=13;
		nuevoArray2[1][6]=14;
		nuevoArray2[2][0]=15;
		nuevoArray2[2][1]=16;
		nuevoArray2[2][2]=17;
		nuevoArray2[2][3]=18;
		nuevoArray2[2][4]=19;
		nuevoArray2[2][5]=20;
		nuevoArray2[2][6]=21;
		nuevoArray2[3][0]=22;
		nuevoArray2[3][1]=1;
		*/
		//ETC...
		
		
		
		
		

	}

}
