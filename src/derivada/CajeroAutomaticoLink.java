package derivada;

import base.CajeroAutomatico;

public class CajeroAutomaticoLink extends CajeroAutomatico {
	
	private double saldo;
	
	public CajeroAutomaticoLink(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String extraerDinero(Cliente cliente, double saldo) {
		String mensaje;
		double nuevoSaldoCliente;
		
		if (this.saldo < saldo) {
			mensaje = "El cajero no tiene saldo disponible";
		}else {
			this.saldo = this.saldo - saldo;
			
			if (cliente.getRed().equalsIgnoreCase("LINK")) {
				nuevoSaldoCliente = cliente.getSaldo() + saldo;
				
				cliente.setSaldo(nuevoSaldoCliente);
				
				mensaje = "La operación se ha realizado con éxito";
			}else {
				nuevoSaldoCliente = cliente.getSaldo() + (saldo * 0.90);
				
				cliente.setSaldo(nuevoSaldoCliente);
				
				mensaje = "La operación se ha realizado con éxito";
			}
			
		}
			
		return mensaje;
	}

	@Override
	public String transferirDinero(Cliente cliente, double saldo, Cliente clienteDestino) {
		String mensaje;
		double nuevoSaldoCliente;
		double nuevoSaldoClienteDestino;
		
		if (cliente.getRed() != clienteDestino.getRed()) {
			mensaje = "La red del cliente origen y/o cliente destino no son LINK";
		}else {
			if (cliente.getSaldo() < saldo) {
				mensaje = "El cliente de origen no tiene saldo suficiente para realizar la transferencia";
			}else {
				nuevoSaldoCliente = cliente.getSaldo() - saldo;
				cliente.setSaldo(nuevoSaldoCliente);
				
				nuevoSaldoClienteDestino = clienteDestino.getSaldo() + saldo;
				clienteDestino.setSaldo(nuevoSaldoClienteDestino);
				
				mensaje = "La transferencia se ha realizado con éxito";
			}
		}
		
		
		return mensaje;
	}

}
