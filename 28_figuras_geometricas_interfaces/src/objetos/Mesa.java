package objetos;

import auxiliares.Operaciones;

public class Mesa implements Operaciones{
	private int altura;
	private int longitud;
	
	
	public Mesa(int altura, int longitud) {
		super();
		this.altura = altura;
		this.longitud = longitud;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public void girar(int grados) {
		altura=altura+grados;
		System.out.println("Girando la mesa");
		
	}
	@Override
	public void invertir() {
		System.out.println("Invirtiendo la mesa");
		
	}
	
}
