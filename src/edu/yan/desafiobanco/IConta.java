package edu.yan.desafiobanco;

public interface IConta {
	
	public void sacar(double valor) throws SistemaBancarioException;
	
	public void depositar(double valor);
	
	public void transferir(double valor, Conta contaDestino) throws SistemaBancarioException;
	
	public void exibirExtrato();
	
}
