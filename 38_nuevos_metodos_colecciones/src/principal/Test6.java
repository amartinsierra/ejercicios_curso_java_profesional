package principal;

import java.util.HashMap;

import model.Persona;

public class Test6 {

	public static void main(String[] args) {
		HashMap<String,Persona> listaPersonas=new HashMap<>();
		listaPersonas.put("bn3", new Persona("Juan","alfd@gg.com",55555,20));
		listaPersonas.put("qw43",new Persona("Elena","al@gg.es",42332,17));
		listaPersonas.put("9iud",new Persona("Marta","alaaoi@gg.com",121,34));
		listaPersonas.put("rrk8",new Persona("Lucas","alert@gg.org",6667,14));
		listaPersonas.put("xc6",new Persona("Alicia","sdfl@gg.com",2121,35));
		//sustitución de personas por el siguiente criterio:
		//Las personas que tengan una clave con más de tres caracteres, serán sustituidas
		//por nuevas personas con edad 10 años mayor que las anteriores. Las que que tengan
		//clave d de tres o menos caracteres, se añade su edad actual al nombre
		listaPersonas.replaceAll( (k, v) -> k.length()>3 
	               ? new Persona(v.getNombre(), v.getEmail(), v.getTelefono(), v.getEdad()+ 10) 
	               : new Persona(v.getNombre() + " " + v.getEdad(), v.getEmail(), v.getTelefono(), v.getEdad() ));

		
		listaPersonas.forEach((k,v)->System.out.println(k+":"+v.getNombre()));
	}

}
