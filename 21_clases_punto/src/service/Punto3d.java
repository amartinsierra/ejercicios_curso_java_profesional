package service;

public class Punto3d extends Punto{
	private int z;
	public Punto3d(int z) {
		//super(); //llamada al constructor sin parámetros de la superclase
		/*super(30,6);//llamamos al constructor de Punto que recibe dos enteros
		this.z=z;*/
		this(30,6,z);
		//Punto3d(30,6,z); error, el constructor no es un método
	}
	public Punto3d(int x, int y, int z) {
		super(x,y);
		this.z=z;		
	}
	@Override
	public void imprimir() {
		System.out.println(getX()+":"+getY()+":"+z);
	}
	@Override
	public void desplazar(int v) {		
		this.z+=v;
		super.desplazar(v);//llamada a versión original del método de la superclase
	}
	
	
}
