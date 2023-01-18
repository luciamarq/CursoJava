package buclesCadenas;

public class Vuelta {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		
		String salida="";
		String salida2="";
		for(String ele: args) {
			salida2 = salida2 + ele + " ";
			//salida = "" + " " + ele + salida; 
		}
		
		String[] palabras = salida2.split(" ");
		int fin= palabras.length;
		
		
		
		//Recorremos el bucle desde la ultima posicion:
		for(int i=fin-1; i>=0; i--) {
			salida=salida+palabras[i] + " ";
		}
		System.out.println("*FASE 1......");
		System.out.println(salida2); //Mensaje normal
		
		System.out.println("*FASE 2: IMPRIMIR AL REVES PALABRA A PALABRA");
		System.out.println(salida);//Mensaje del reves
		System.out.println("*FASE 3: IMPRIMIR AL REVES CARACTER A CARACTER:");
		
		String salida3="";
		
		int caracter=salida2.length();
		for(int i=caracter-1; i>=0;i--) {
			salida3+=salida2.charAt(i);
		}
		System.out.println(salida3);
		
		
		System.out.println("FASE 4 INTERCAMBIAR LETRAS POR NUMEROS:");
		
		String salida4=" ";
		
		int ls=salida2.length();
		for(int i=ls-1; i>=0;i--) {
			char c = salida2.charAt(i);
			switch(c) {
			case 'a':
				salida4+=4;
				break;
			case 'e': 
			case 'E':
				salida4+=3;
				break;
			case 'i':
				salida4+=1;
				break;
			case 'o':
				salida4+=0;
				break;
			case 'u':
				salida4+=9;
				break;
			default:
				salida4+=c;
			
			}
		}
		System.out.println(salida4);
		
		
		System.out.println("FASE 5: DAR LA VUELTA A LA CADENA CON CARACTERES ESPECIALES");
		//Primero imprimimos la frase normal:
		char c1=salida2.charAt(0);
		String salida5="";
		
		//System.out.println(c1);
		for(int i = 1; (salida2+c1).charAt(i)!=c1; i++) { //se hace la comparativa entre el chart y el caracter especial. 
			salida5=salida2.charAt(i)+ salida5;
			
			
		}
		System.out.println(salida5);
		
	
		System.out.println("FASE 6: SIN UTILIZAR LA LONGITUD Y SIN DELIMITACION");
		salida2+=(char)0;
		int pos= 0;
		String salida6="";
		while(salida2.charAt(pos)!=(char)0) {
			salida6=salida2.charAt(pos++)+salida6;
			
		}
		
		System.out.println(salida6);
		
	}
	
	
	
	

}
