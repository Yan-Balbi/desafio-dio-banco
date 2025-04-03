package edu.yan.desafiobanco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int agencia, double saldo, Cliente cliente) {
		super(agencia, saldo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("_________Extrato Conta Corrente_________");
		super.exibirInformacoesBasicasDeUmaConta();
	}
}
