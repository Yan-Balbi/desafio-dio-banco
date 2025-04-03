package edu.yan.desafiobanco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, double saldo, Cliente cliente) {
		super(agencia, saldo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("_________Extrato Conta Poupança_________");
		super.exibirInformacoesBasicasDeUmaConta();
	}

}
