package br.com.alura.design.calculadora;

public class Orcamento {

	public Orcamento(double valor) {
		this.valor = valor;
	}
	
	private double valor;
	
	private String prazo;
	
	private String nome;
	
	private String sobrenome;
	
	
	public double getValor() {
		return valor;
	}

	public String getPrazo() {
		return prazo;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public void cadastraPrazo(String dias) {
		this.prazo = dias;
	}

}

