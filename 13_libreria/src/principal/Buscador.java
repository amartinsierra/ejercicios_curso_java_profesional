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
		System.out.println("1. A�adir nuevo t�tulo");
		System.out.println("2. Buscar t�tulos");
		System.out.println("3. Eliminar t�tulos");
		System.out.println("4. Mostrar t�tulos");
		System.out.println("5. Salir");
	}
	
	static void nuevo(StringBuilder titulos) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nuevo t�tulo ");
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
		System.out.println("Introduce palabra de b�squeda");
		palabra=sc.nextLine();
		for(String n:todos) {
			//si la palabra est� contenida en el t�tulo
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
		posIni=titulos.indexOf(titulo); //buscamos posici�n inicial de borrado
		if(posIni!=-1) {
			titulos.delete(posIni, posIni+titulo.length());
		}else {
			System.out.println("Ese t�tulo no existe");
		}
	}
	
	static void mostrarTitulos(StringBuilder titulos) {
		System.out.println(titulos);
	}
	
}
