package principal;

public class Test {
	private int a;
	{
		a++;
	}
	public Test() {
		System.out.println(a);
	}
	
	public static void main(String [] args) {
		Test t1=new Test();
		Test t2=new Test();
	}
}
