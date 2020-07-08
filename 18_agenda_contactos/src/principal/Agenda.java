package principal;

import java.util.Scanner;

import model.Contacto;
import service.AgendaService;

public class Agenda {
	static AgendaService service=new AgendaService();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int op;
		do {
			menu();
			op=Integer.parseInt(sc.nextLine());
			switch(op) {
				case 1:
					agregarContacto();
					break;
				case 2:
					buscarContacto();
					break;
				case 3:
					eliminarContacto();
					break;
				case 4:
					mostrarContactos();
					break;
			}
		}while(op!=5);
	}
	private static void menu() {
		System.out.println("1.- Agregar contacto: ");
		System.out.println("2.- Buscar contacto: ");
		System.out.println("3.- Eliminar contacto: ");
		System.out.println("4.- Mostrar todas: ");
		System.out.println("5.- Salir: ");
	}
	private static void agregarContacto() {
		//Scanner sc=new Scanner(System.in);
		int tel;
		String nom,email;
		System.out.println("Dame nombre: ");
		nom=sc.nextLine();
		System.out.println("Dame email: ");
		email=sc.nextLine();
		System.out.println("Dame un teléfono: ");
		tel=Integer.parseInt(sc.nextLine());
		//creamos objeto con sus datos
		Contacto per=new Contacto(nom,email,tel);
		
		if(service.agregarContacto(per)) {
			System.out.println("Contacto añadido");
		}else {
			System.out.println("Email repetido, pruebe otra opción");
		}	
	}
	private static void mostrarContactos() {
		Contacto[] datos=service.recuperarContactos();
		for(Contacto p:datos) {
			System.out.println(p.getNombre()+" - "+p.getTelefono()+" - "+p.getEmail());
		}
		
	}
	private static void buscarContacto() {
		String email;
		
		System.out.println("Dame un email: ");
		email=sc.nextLine();
		Contacto p=service.buscarContacto(email);
		
		if(p==null) {
			System.out.println("No existe");
		}else {
			System.out.println("La persona es "+p.getNombre()+" - "+p.getEmail()+" - "+p.getTelefono());
		}
	}
	private static void eliminarContacto() {
		String email;
		
		System.out.println("Dame un email: ");
		email=sc.nextLine();
		if(service.eliminarContacto(email)) {
			System.out.println("Contacto eliminado con éxito");
		}else {
			System.out.println("El contacto no existe y no se ha podido eliminar");
		}
	}

}




