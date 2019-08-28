package br.com.alura.design;

public class TesteDeInvestimento {
	
	public static void main(String[] args) {
		Investimento arrojado = new Arrojado();
		Investimento moderado = new Moderado();
		Investimento conservador = new Conservador();
		
		Conta conta = new Conta();
		conta.deposita(2000.0);
		
		RealizadorDeInvestimentos rs = new RealizadorDeInvestimentos();
		rs.realizaInvestimento(conta, arrojado);
		rs.realizaInvestimento(conta, moderado);
		rs.realizaInvestimento(conta, conservador);
		
	}

}
