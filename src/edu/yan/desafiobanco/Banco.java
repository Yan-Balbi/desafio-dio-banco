package edu.yan.desafiobanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removerConta(Conta conta) {
		contas.remove(conta);
	}
	
	public void exibirContasVinculadasAoBanco() {
		
		System.out.println("\nExibindo conta vinculadas ao banco: \n");
		
		contas.stream().forEach(conta -> System.out.println("=======\nTitular: "+conta.getCliente().getNome()+"\nNumero de conta: "+conta.getNumero()+"\n======="));
	}
	
}
