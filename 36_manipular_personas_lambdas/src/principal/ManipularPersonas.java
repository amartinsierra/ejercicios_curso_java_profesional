package principal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Persona;
import service.PersonasService;

public class ManipularPersonas {

	public static void main(String[] args) {
		List<Persona> varias=Arrays.asList(new Persona("Alex","al@gg.com",55555,20),				
				new Persona("Juan","alfd@gg.com",55555,20),
				new Persona("Elena","al@gg.es",42332,17),
				new Persona("Marta","alaaoi@gg.com",121,34),
				new Persona("Lucas","alert@gg.org",6667,14),
				new Persona("Alicia","sdfl@gg.com",2121,35));
		PersonasService service=new PersonasService();
		Scanner sc = new Scanner(System.in);
		//parte 1: imprime los nombres de las personas mayores de edad
		service.imprimir(varias, (Persona p)->p.getEdad()>=18);
		
		
		//parte 3: Solicita la introducción de un teléfono
		//y muestra los nombres de las personas, cuyo numero sea menor que el introducido
		System.out.println("Introduce telefono: ");
		int tel=Integer.parseInt(sc.nextLine());
		service.imprimir(varias, (Persona p)->p.getTelefono()<=tel);
		
		
		//parte 2: solicita la introducción de un dominio, y muestra las personas
		//cuya dirección de email sean de ese dominio
		System.out.println("Introduce dominio: ");
		
		
		
		String dominio = sc.nextLine();
		
		service.imprimir(varias, (Persona p) ->p.getEmail().endsWith(dominio));

		
		//parte 4: muestra el email de las personas cuya edad
		//esté comprendida entre 20 y 40
		
		service.imprimir(varias, p->p.getEdad()>=20&&p.getEdad()<=40,p->p.getEmail());
		
		//parte 4: guarda en un fichero, las personas cuyo nombre empiece por "a"
		
		service.procesar(varias, 
				p->p.getNombre().startsWith("a"),
				p->System.out.println(p));
		
	}

}
