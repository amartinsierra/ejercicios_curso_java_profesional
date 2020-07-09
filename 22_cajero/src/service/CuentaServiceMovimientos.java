package service;

import java.util.ArrayList;

import model.Movimiento;

public class CuentaServiceMovimientos extends CuentaLimiteService {
	private ArrayList<Movimiento> movimientos=new ArrayList<Movimiento>();
	
	
	public CuentaServiceMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad>getLimite()?getLimite():cantidad,"Ingreso"));
		super.ingresar(cantidad);
	}



	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad>getLimite()?getLimite():cantidad,"Extraer"));
		super.extraer(cantidad);
	}



	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}
}
