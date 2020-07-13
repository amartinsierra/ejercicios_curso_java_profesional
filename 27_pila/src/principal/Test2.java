package principal;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		Object obj=new String("40");
		String str=(String)obj;
		Integer in=(Integer)obj; //ClassCastException
		System.out.println(str+":"+in);
		ArrayList<Object> objs=new ArrayList<String>(); //la herencia no se trasmite a las colecciones
		//Object[] objetos=new String[10];
	}

}
