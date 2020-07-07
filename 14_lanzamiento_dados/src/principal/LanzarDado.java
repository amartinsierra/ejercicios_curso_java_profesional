package principal;

public class LanzarDado {

	public static void main(String[] args) {
		int dado;
		//int dado=(int)(Math.random()*6+1);
		//System.out.println("El lanzamiento es "+dado);
		//Lanzar 10000 veces el dado, y mostrar los porcentajes 
		//de cada número obtenido
		int [] numeros=new int[6];
		for(int i=1;i<=100000;i++) {
			dado=(int)(Math.random()*6+1);
			numeros[dado-1]++;
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Porcentaje de "+(i+1)+" : "+numeros[i]/1000.0);
		}
	}

}
