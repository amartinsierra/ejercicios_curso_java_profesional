package principal;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=sc.nextInt();
		System.out.println("Tienes "+edad+ " años");
		
		System.out.println("Introduce tu nombre");
		String nombre=sc.nextLine();
		System.out.println("Te llamas "+nombre);
		
		
	}
}
