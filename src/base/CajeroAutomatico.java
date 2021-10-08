package base;

import derivada.Cliente;

public abstract class CajeroAutomatico {
	
	public abstract String extraerDinero(Cliente cliente, double saldo);
	
	public abstract String transferirDinero(Cliente cliente, double saldo, Cliente clienteDestino);
}
