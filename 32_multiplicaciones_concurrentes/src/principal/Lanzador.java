package principal;

import java.util.Scanner;

import recurso.Acumulador;
import tareas.TareaMultiplicacion;

public class Lanzador {

	public static void main(String[] args) {
		final int tareas=5;
		int nums[]=new int[tareas];
		//creamos el recurso compartido
		Acumulador acumulador=new Acumulador();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<tareas;i++) {
			System.out.println("Introduce un número ");
			nums[i]=Integer.parseInt(sc.nextLine());
		}
		for(int n:nums) {
			//pasamos el recurso compartido a cada tarea
			//para que lo use
			lanzador(new TareaMultiplicacion(n,acumulador));
		}
	}
	//Lanzamos las tareas
	private static void lanzador(Runnable t) {
		new Thread(t).start();
	}
}
