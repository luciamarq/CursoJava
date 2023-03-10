package figuras;

public class MainFiguras {

	public static void main(String[] args) {
		
		Figura f = new Rectangulo(2,5);
		 
		System.out.println(f.dibujar());
		System.out.println("El area de este RECTANGULO es " + f.cacularArea());
		
		
		
		Figura triangulo = new Triangulo(5,10);
		
		System.out.println(triangulo.dibujar());
		System.out.println("El area de este TRIANGULO es " + triangulo.cacularArea());
		
		
		Figura circulo = new Circulo(9,7);
		
		
		/*
		 * Ahora vamos a probar los puntos y el metodo invertir:
		 * 
		 */
		
		Punto punto = new Punto(3,6);
		punto.inverse();
		System.out.println(punto.toString());
		
		System.out.println(circulo.dibujar());
		System.out.println("El area de este CIRCULO es " + circulo.cacularArea());
		

	}

}
