package principal;

import java.util.Arrays;
import static java.lang.Math.*;
public class Loteria {

	public static void main(String[] args) {
		int[] combinacion=new int[6];
		int total=0; //cuenta los números que se han generado hasta el momento
		int generado;
		while(total<6) {
			generado=generarNumero();
			if(!existente(combinacion,total,generado)) {
				combinacion[total]=generado;
				total++; //tenemos uno más
			}
		}
		ordenarArray(combinacion);
		mostrarCombinacion(combinacion);

	}
	
	static int generarNumero() {
		return (int)(random()*49+1);
	}

	static boolean existente(int[] combinacion, int total,int generado) {
		for(int i=0;i<total;i++) {
			if(combinacion[i]==generado) {
				return true;
			}
		}
		return false; 
	}
	static void ordenarArray(int[] combinacion) {
		Arrays.sort(combinacion);
	}
	static void mostrarCombinacion(int[] combinacion) {
		for(int numero:combinacion) {
			System.out.print(numero+", ");
		}
	}
	
}
