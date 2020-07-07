package principal;

import java.util.Scanner;


public class Buscador {

	public static void main(String[] args) {
		StringBuilder titulos=new StringBuilder("");
		Scanner sc=new Scanner(System.in);
		int op;
		do {
			menu();
			op=sc.nextInt();
			switch(op) {
				case 1:
					nuevo(titulos);
					break;
				case 2:
					buscarTitulo(titulos);
					break;
					
				case 3:
					eliminarTitulo(titulos);
					break;
				case 4:
					mostrarTitulos(titulos);
					break;
			}
		}while(op!=5);
		
		

	}
	
	static void menu() {
		System.out.println("1. Añadir nuevo título");
		System.out.println("2. Buscar títulos");
		System.out.println("3. Eliminar títulos");
		System.out.println("4. Mostrar títulos");
		System.out.println("5. Salir");
	}
	
	static void nuevo(StringBuilder titulos) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nuevo título ");
		titulos.append(sc.nextLine());
		titulos.append(",");
		
	}
	static void buscarTitulo(StringBuilder titulos) {
		String palabra;
		Scanner sc=new Scanner(System.in);
		
		String[] todos=titulos
				.delete(titulos.length()-1, titulos.length())
				.toString()
				.split(",");
		System.out.println("Introduce palabra de búsqueda");
		palabra=sc.nextLine();
		for(String n:todos) {
			//si la palabra está contenida en el título
			//el resultado de indexOf es distinto a -1
			if(n.toLowerCase().indexOf(palabra.toLowerCase())!=-1) {
				System.out.println(n);
			}
		}
	}
	static void eliminarTitulo(StringBuilder titulos) {
		String titulo;
		int posIni;
		Scanner sc=new Scanner(System.in);
		titulo=sc.nextLine()+",";
		posIni=titulos.indexOf(titulo); //buscamos posición inicial de borrado
		if(posIni!=-1) {
			titulos.delete(posIni, posIni+titulo.length());
		}else {
			System.out.println("Ese título no existe");
		}
	}
	
	static void mostrarTitulos(StringBuilder titulos) {
		System.out.println(titulos);
	}
	
}
