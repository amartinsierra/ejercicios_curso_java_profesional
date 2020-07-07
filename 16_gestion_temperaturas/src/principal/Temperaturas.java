package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperaturas {

	
	public static void main(String[] args) {
		ArrayList<Double> temperaturas=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int op;//opcion elegida
        do{
           menu();
           op=sc.nextInt();
           switch(op){
               case 1:                  
                   agregarTemperatura(temperaturas);
                   break;
               case 2:
                   media(temperaturas);
                   break;
               case 3:
                   System.out.println("temperatura más alta: "+mayor(temperaturas));
                   System.out.println("temperatura más baja: "+menor(temperaturas));
                   break;
               case 4:
            	   mostrarTemperaturas(temperaturas);
                   break;
               case 5:
            	   break;
               default:
                   System.out.println("debes escribir una opción válida");
           }
        }while(op!=5);
    }
	static void menu() {
		System.out.println("1.- Nueva temperatura");
        System.out.println("2.- Temperatura Media");
        System.out.println("3.- Extremas");
        System.out.println("4.- Mostrar todas");
        System.out.println("5.- Salir");
	}
    private static void agregarTemperatura( ArrayList<Double> temperaturas){
    	System.out.println("Temperatura:");
    	Scanner sc=new Scanner(System.in);
        temperaturas.add(sc.nextDouble()); 
    }
    private static void media(ArrayList<Double> temperaturas){
        double m=0;
        for(Double n:temperaturas){
            m+=n;
        }
        System.out.println( m/temperaturas.size());
    }
    private static double mayor(ArrayList<Double> temperaturas){
        double max=temperaturas.get(0); //inicializamos
        for(Double tp:temperaturas){
        	max=Math.max(tp, max);
        }
        return max;
    }
    private static double menor(ArrayList<Double> temperaturas){
        double min=temperaturas.get(0); //inicializamos
        for(Double tp:temperaturas){
            min=Math.min(tp, min);
        }
        return min;
    }
    private static void mostrarTemperaturas(ArrayList<Double> temperaturas) {
    	for(Double tp:temperaturas){
            System.out.print(tp+",");
        }
    	System.out.println("\n");
    }

}
