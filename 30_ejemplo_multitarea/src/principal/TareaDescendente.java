package principal;

public class TareaDescendente extends Thread{
	@Override
	public void run() {
		for(int i=100;i>=1;i--) {
			System.out.println("Descendente "+i);
		}
	}
	
}
