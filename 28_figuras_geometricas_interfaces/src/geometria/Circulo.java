package geometria;

import auxiliares.Operaciones;

public class Circulo extends Figura implements Operaciones{
	private int radio;
	
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double superficie() {
		return Math.PI*radio*radio;
	}

	@Override
	public void girar(int grados) {
		radio=radio+grados;
		System.out.println("Se gira el Circulo");	
	}

	@Override
	public void invertir() {
		System.out.println("Se invierte el Circulo");	
	}

}
