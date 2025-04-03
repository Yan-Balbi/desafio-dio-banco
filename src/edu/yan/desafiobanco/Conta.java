package edu.yan.desafiobanco;

public abstract class Conta implements IConta{
	
	private static int ID_SEQUENCIAL_CONTA = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int agencia, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.numero = ID_SEQUENCIAL_CONTA++;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void sacar(double valor) throws SistemaBancarioException {
		// TODO Auto-generated method stub
		if(this.saldo > valor)
			this.saldo -= valor;
		else
			throw new SistemaBancarioException();
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) throws SistemaBancarioException {
		// TODO Auto-generated method stub
		if(this.saldo > valor) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
		} else {
			throw new SistemaBancarioException();
		}
	}
	

	public void exibirInformacoesBasicasDeUmaConta() {
		System.out.println("Titular: "+this.cliente.getNome());
		System.out.println("Agencia: "+this.getAgencia());
		System.out.println("Numerod da conta: "+this.getNumero());
		System.out.println("Saldo: "+this.getSaldo());	
	}
}
