package principal;
interface Inter1{
	static void otro() {
		System.out.println("est�tico de interfaz");
	}
}
class Clase1{
	public static void met() {
		System.out.println("est�tico de Clase1");
	}
	public void my() {
		System.out.println("my de Clase1");
	}
	
}
class Clase2 extends Clase1 implements Inter1{
	public static void met() {
		System.out.println("est�tico de Clase2");
	}
	public void my() {
		System.out.println("my de Clase2");
	}
}

public class Test {

	public static void main(String[] args) {
		//Clase2.met();
		Clase1 c1=new Clase2();
		c1.met(); //llamada a el est�tico de Clase1
		c1.my(); //llamada al m�todo del objeto de Clase2
	}

}
