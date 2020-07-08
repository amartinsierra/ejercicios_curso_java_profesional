package principal;

import java.util.ArrayList;
import java.util.Scanner;

import model.Ciudad;

public class Temperaturas {

	
	public static void main(String[] args) {
		ArrayList<Ciudad> temperaturas=new ArrayList<>();
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
                   System.out.println("ciudad con temperatura más alta: "+mayor(temperaturas).getNombre());
                   System.out.println("ciudad con temperatura más baja: "+menor(temperaturas).getNombre());
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
    private static void agregarTemperatura( ArrayList<Ciudad> temperaturas){
    	Ciudad ciudad=new Ciudad();
    	double tmp;
    	String nombreCiudad;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Temperatura:");
        tmp=Double.parseDouble(sc.nextLine());
        System.out.println("Nombre ciudad:");
        nombreCiudad=sc.nextLine();
        if(!comprobar(temperaturas,nombreCiudad)) {
	        ciudad.setNombre(nombreCiudad);
	        ciudad.setTemperatura(tmp);
	        //guardamos en el ArrayList el objecto Ciudad
	        temperaturas.add(ciudad);
        }else {
        	System.out.println("Ciudad ya registrada ");
        }
        
    }
    private static void media(ArrayList<Ciudad> temperaturas){
        double m=0;
        for(Ciudad c:temperaturas){
            m+=c.getTemperatura();
        }
        System.out.println( m/temperaturas.size());
    }
    private static Ciudad mayor(ArrayList<Ciudad> temperaturas){
        double max=temperaturas.get(0).getTemperatura(); //inicializamos
        Ciudad ciudad=temperaturas.get(0);
        for(Ciudad c:temperaturas){
        	if(c.getTemperatura()>max) {
        		max=c.getTemperatura();
        		ciudad=c;
        	}
        }
        return ciudad;
    }
    private static Ciudad menor(ArrayList<Ciudad> temperaturas){
        double min=temperaturas.get(0).getTemperatura(); //inicializamos
        Ciudad ciudad=temperaturas.get(0);
        for(Ciudad c:temperaturas){
        	if(c.getTemperatura()<min) {
        		min=c.getTemperatura();
        		ciudad=c;
        	}
        }
        return ciudad;
    }
    private static void mostrarTemperaturas(ArrayList<Ciudad> temperaturas) {
    	for(Ciudad c:temperaturas){
            System.out.println(c.getNombre()+","+c.getTemperatura());
        }
    	System.out.println("\n");
    }
    
    static boolean comprobar(ArrayList<Ciudad> temperaturas,String nombre) {
    	/*boolean resultado=false;
    	for(Ciudad c:temperaturas) {
    		if(c.getNombre().equalsIgnoreCase(nombre)) {
    			resultado=true;
    			break;
    		}
    	}
    	return resultado;*/
    	for(Ciudad c:temperaturas) {
    		if(c.getNombre().equalsIgnoreCase(nombre)) {
    			return true;
    		}
    	}
    	return false;
    }

}
