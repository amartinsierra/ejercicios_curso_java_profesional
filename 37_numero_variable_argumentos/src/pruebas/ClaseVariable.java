package pruebas;

public class ClaseVariable {
	public void mostrar(String... datos) {
		for(String s:datos) {
			System.out.println(s);
		}
	}
	public void mostrar2(String texto, int...nums) {
		
	}
	/*El parámetro con número variable de argumentos siempre el último
	 * public void mostrar3(int... datos, long p) {
		
	}*/
	
}

class Prueba{
	void test() {
		ClaseVariable c=new ClaseVariable();
		c.mostrar();
		c.mostrar("hola");
		c.mostrar("hola","qe","tal");
		c.mostrar(new String[3]);
		c.mostrar2("hello", 3,7,1);
	}
	
}