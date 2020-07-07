package principal;

import java.util.Scanner;

public class Invertir {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String texto,textoFinal;
		System.out.println("Introduce un texto");
		texto=sc.nextLine();
		textoFinal=""; //inicializamos la variable auxiliar a cadena vacía
		for(int i=texto.length()-1;i>=0;i--) {
			textoFinal+=texto.charAt(i);
		}
		System.out.println("Invertido: "+textoFinal);
		
	}

}
