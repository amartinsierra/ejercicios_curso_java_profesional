package service;

public class CuentaLimiteService extends CuentaService {
	private double limite;

	public CuentaLimiteService(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	@Override
	public void ingresar(double cantidad) {
		if(cantidad<limite) {
			super.ingresar(cantidad);
		}else {
			super.ingresar(limite);
		}
	}

	@Override
	public void extraer(double cantidad) {
		if(cantidad<limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
