package edu.yan.desafiobanco;

public class Main {
	public static void main(String[] args) {
		Cliente ze = new Cliente("Zé");
		Cliente jao = new Cliente("Jão");
		
		ContaCorrente contaZe = new ContaCorrente(123, 1000.00, ze);
		ContaPoupanca contaJao = new ContaPoupanca(123, 299.00, jao);
		
		try {
			contaZe.transferir(100.59, contaJao);
		} catch (SistemaBancarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(contaJao.getSaldo());
		
		contaZe.exibirExtrato();
		contaJao.exibirExtrato();
		
		Banco bancoExemplo = new Banco();
		bancoExemplo.adicionarConta(contaZe);
		bancoExemplo.adicionarConta(contaJao);
		
		bancoExemplo.exibirContasVinculadasAoBanco();
	}
}
