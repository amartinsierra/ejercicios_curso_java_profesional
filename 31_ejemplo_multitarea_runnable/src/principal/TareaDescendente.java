package principal;

public class TareaDescendente implements Runnable{
	@Override
	public void run() {
		for(int i=100;i>=1;i--) {
			System.out.println("Descendente "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
