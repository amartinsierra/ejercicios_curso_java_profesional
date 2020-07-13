package principal;

import implementaciones.Ciudad;
import implementaciones.Punto;
import service.Utilidades;

public class Presentacion {

	public static void main(String[] args) {
		Utilidades util=new Utilidades();
		util.generador(new Ciudad("AS",40));
		util.generador(new Punto(2,8));
		

	}

}
