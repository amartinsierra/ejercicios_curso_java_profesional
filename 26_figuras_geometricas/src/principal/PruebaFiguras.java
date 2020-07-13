package principal;

import geometria.Circulo;
import geometria.Figura;
import geometria.Triangulo;

public class PruebaFiguras {

	public static void main(String[] args) {
		/*Circulo circulo=new Circulo("verde", 5);
		Triangulo triangulo=new Triangulo("amarillo",10,3);*/
		/*Sin polimorfismo
		System.out.println("El color es: "+circulo.getColor());
		System.out.println("Superficie  es: "+circulo.superficie());
		System.out.println("El color es: "+triangulo.getColor());
		System.out.println("Superficie  es: "+triangulo.superficie());
		*/
		mostrarDatos(new Circulo("verde", 5));
		mostrarDatos(new Triangulo("amarillo",10,3));
	}
	
	private static void mostrarDatos(Figura figura) {
		System.out.println("El color es: "+figura.getColor());
		System.out.println("Superficie  es: "+figura.superficie());
	}

}
