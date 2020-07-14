package service;

import java.util.ArrayList;

public class Pila<E> {
	/*
	 Se trata de crear una clase que funcione como una pila, es decir, que permita añadir
	 nuevos objetos y al la hora de extraer objetos, el ultimo en entrar será
	 el primero en salir
	 Será una clase de tipo genérico, es decir, que se puedan crear objetos Pila
	 para tratar con cualquier objeto Java
	 Tendrá los siguiente métodos:
	 -agregar. Añade un nuevo elemento a la pila
	 -quitar. Extrae el elemento de salida y lo devuelve. Si la pila está vacía, devuelve null
	 -contains. Recibe un Object y nos dice si ese objeto existe en la pila
	 */
	ArrayList<E> lista=new ArrayList<>();
	
	public boolean agregar(E elemento) {
		return lista.add(elemento);
	}
	
	public E quitar() {
		return lista.size()>0?lista.remove(lista.size()-1):null;
	}
	
	public boolean contains(Object obj) {
		for(E n:lista) {
			if(n.equals(obj)) {
				return true;
			}
		}
		return false;
	}
	
}
