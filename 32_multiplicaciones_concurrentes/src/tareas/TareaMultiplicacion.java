package tareas;

import recurso.Acumulador;

public class TareaMultiplicacion implements Runnable {
	private int n;
	private Acumulador acumulador;
	public TareaMultiplicacion(int n,Acumulador acumulador) {
		this.n=n;
		this.acumulador=acumulador;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);		
			synchronized(acumulador) {
				int valor=acumulador.getValor();
				valor++;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				acumulador.setValor(valor);
			}
		}

		System.out.println("Valor actual del acumulador "+acumulador.getValor());
	}

}
