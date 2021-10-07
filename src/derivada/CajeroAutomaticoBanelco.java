package derivada;

import base.CajeroAutomatico;

public class CajeroAutomaticoBanelco extends CajeroAutomatico {
	
	private double saldo;
	
	public CajeroAutomaticoBanelco(double saldo) {
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
			
			if (cliente.getRed().equalsIgnoreCase("BANELCO")) {
				nuevoSaldoCliente = cliente.getSaldo() + saldo;
				
				cliente.setSaldo(nuevoSaldoCliente);
				
				mensaje = "La operación se ha realizado con éxito";
			}else {
				nuevoSaldoCliente = cliente.getSaldo() + (saldo * 0.85);
				
				cliente.setSaldo(nuevoSaldoCliente);
				
				mensaje = "La operación se ha realizado con éxito";
			}
			
		}
			
		return mensaje;
	}

	@Override
	public String transferirDinero() {
		
		return null;
	}

}
