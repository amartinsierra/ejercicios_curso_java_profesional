package principal;

interface MyInterface1{
	default void met() {
		System.out.println("met  de interfaz1");
	}
}
interface MyInterface2{
	default void met() {
		System.out.println("met  de interfaz2");
	}
}
class Clase1 implements MyInterface1,MyInterface2{

	public void met() {
		//System.out.println("met  de clase1");
		MyInterface1.super.met(); //llamariamos a la versi�n default de MyInterface1
	}
	
}

public class Test {

	public static void main(String[] args) {
		Clase1 c1=new Clase1();
		c1.met();

	}

}
