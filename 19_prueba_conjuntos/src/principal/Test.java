package principal;

import java.util.HashSet;

import model.Contacto;

public class Test {

	public static void main(String[] args) {
		HashSet<Contacto> contactos=new HashSet<Contacto>();
		contactos.add(new Contacto("contacto1","c1@gmail.com",11));
		contactos.add(new Contacto("contacto2","c2@gmail.com",22));
		contactos.add(new Contacto("contacto3","c3@gmail.com",33));
		contactos.add(new Contacto("contacto3","c3@gmail.com",33));
		//recorremos conjunto
		for(Contacto c:contactos) {
			System.out.println(c.getNombre());
		}
		HashSet<Integer> numeros;
	}

}
