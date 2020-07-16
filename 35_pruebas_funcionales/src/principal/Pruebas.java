package principal;

import java.util.function.Predicate;

import service.TestingPares;
import service.TestingPrimos;

public class Pruebas {

	public static void main(String[] args) {
		int[] numeros= {6,25,8,11,14,17,13};
		
		//comprobaciones(numeros,new TestingPares(),new TestingPrimos());
		Predicate<Integer> tpares=(Integer i)->i%2==0;
		Predicate<Integer> tprimos=(Integer t)->{for(int i=2;i<t;i++) {
														if(t%i==0) {
															return false;
														}
													}
													return true;
												};
		comprobaciones(numeros,tpares,tprimos);								
		
	}
	
	private static void comprobaciones(int[] numeros,Predicate<Integer> tpares, Predicate<Integer> tprimos ) {
		for(int n:numeros) {
			System.out.println(n+" par "+tpares.test(n));
			System.out.println(n+" primo "+tprimos.test(n));
		}
	}

}
