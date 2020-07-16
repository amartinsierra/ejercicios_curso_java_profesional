package service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import model.Persona;

public class PersonasService {
	
	
	
	public void imprimir(List<Persona> personas,Predicate<Persona> condicion) {
		for (Persona persona : personas) {
			if (condicion.test(persona)) {
				System.out.println(persona.getNombre());
			}
		}

	}
	
	//por cada persona que cumple la condición del predicado, imprime el resultado
	//de transformar esa persona en un String
	public void imprimir(List<Persona> personas,
			Predicate<Persona> condicion,
			Function<Persona,String> transformacion) {
		for (Persona persona : personas) {
			if (condicion.test(persona)) {
				System.out.println(transformacion.apply(persona));
			}
		}
	}
	
	
	//Procesa cada persona de la colección, que cumpla la condición
	public void procesar(List<Persona> personas,
			Predicate<Persona> condicion,
			Consumer<Persona> procesado) {
		for (Persona persona : personas) {
			if (condicion.test(persona)) {
				procesado.accept(persona);
			}
		}
	}
	
 
}
