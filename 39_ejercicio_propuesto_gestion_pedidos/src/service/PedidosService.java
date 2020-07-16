package service;

import java.util.ArrayList;
import java.util.List;

import model.Pedido;

public class PedidosService {
	private List<Pedido> pedidos=new ArrayList<>();
	private double facturacion=0;
	public boolean agregarPedido(Pedido pedido) {
		if(!existePedido(pedido)) {
			return pedidos.add(pedido);
		}
		return false;
	}
	
	private boolean existePedido(Pedido pedido) {
		return pedidos.contains(pedido);
	}
	
	public Pedido procesarPedido() {
		return pedidos.size()>0?pedidos.remove(0):null;
	}
	
	public Pedido priorizarPedido(int numeroPedido) {
		Pedido pedido,aux;
		pedido=obtenerPedido(numeroPedido);
		if(pedido!=null) {
			int pos=pedidos.indexOf(pedido);
			//se intercambia con el anterior, si no es el primero
			if(pos>0) {
				//intercambiamos el pedido por el de la
				//posición anterior
				aux=pedidos.get(pos-1);
				pedidos.set(pos-1, pedido);
				pedidos.set(pos, aux);
			}
		}
		return pedido;
		
	}
	private Pedido obtenerPedido(int numeroPedido) {
		for(Pedido p:pedidos) {
			if(p.getNumeroPedido()==numeroPedido) {
				return p;
			}
		}
		return null;
	}
	
	public double facturacionPendiente() {
		facturacion=0;
		pedidos.forEach((Pedido p)->facturacion+=p.getPrecio());
		return facturacion;
	}
	//elimina todos los pedidos, cuyo nombre de producto
	//contenga ese texto
	public void eliminarPedidos(String producto) {
		pedidos.removeIf(p->p.getProducto().contains(producto));
	}
	
	public List<Pedido> pedidosPendientes() {
		return pedidos;
	}
}
