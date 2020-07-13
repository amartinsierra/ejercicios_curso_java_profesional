package principal;

import service.Pila;

public class TestPila {

	public static void main(String[] args) {
		Pila<Integer> pila=new Pila<>();
		pila.agregar(200);
		pila.agregar(350);
		System.out.println(pila.quitar());
		if(pila.contains("hello")) {
			
		}
		mostrarPila(pila);
		Pila<String> pila2=new Pila<>();
		pila2.agregar("hello");
		//mostrarPila(pila2);
	}
	
	public static void mostrarPila(Pila<? extends Number> pila) {
		
	}
	
	
	
}
