package service;

import java.util.ArrayList;

import model.Movimiento;

public class CuentaServiceMovimientos extends CuentaLimiteService {
	private ArrayList<Movimiento> movimientos=new ArrayList<Movimiento>();
	
	
	public CuentaServiceMovimientos(double saldo, double limite) {
			
		super(saldo, limite);
	}
	@Override
	public double ingresar(double cantidad) {
		double resultado=super.ingresar(cantidad);
		movimientos.add(new Movimiento(resultado,"Ingreso"));
		return resultado;
	}



	@Override
	public double extraer(double cantidad) {
		double resultado=super.extraer(cantidad);
		movimientos.add(new Movimiento(resultado,"Extraer"));
		return resultado;
	}



	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}
}
