package principal;

import java.util.Scanner;


public class Buscador_bk {

	public static void main(String[] args) {
		String palabra;
		String titulos="La biblia de Java, Python básico, Angular en un día,programación Web con Java EE, Spring Boot, Fundamentos de Python, Java y Spring, la biblia de php";
		Scanner sc=new Scanner(System.in);
		//String[] todos=titulos.split("(, |,)");
		String[] todos=titulos.replace(", ", ",").split(",");
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
	
}
