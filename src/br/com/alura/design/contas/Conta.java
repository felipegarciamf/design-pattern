package br.com.alura.design.contas;

public class Conta {

	private String nome;
	
	private String endereco;
	

	public Conta(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}
	
}
