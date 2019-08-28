package br.com.alura.design;

public class RealizadorDeInvestimentos {
	
	public void realizaInvestimento(Conta conta, Investimento investimento) {
		double valor = investimento.calculaResgate(conta);
		
		conta.deposita(valor * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}

}
