package principal;

import service.Punto3d;

public class Test {

	public static void main(String[] args) {
		Punto3d p3d=new Punto3d(10,4,7);
		p3d.desplazar(6);
		p3d.imprimir();
	}

}
