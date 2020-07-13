package implementaciones;

import service.Item;

public class Ciudad implements Item{
	private String nombre;
	private double temperatura;
	
	
	public Ciudad(String nombre, double temperatura) {
		this.nombre = nombre;
		this.temperatura = temperatura<50?temperatura:0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	@Override
	public boolean activo() {
		return !nombre.equals("");
	}
	@Override
	public void procesar() {
		System.out.println(nombre+"-"+temperatura);
	}	
}
