package br.com.alura.design;

public class Conservador implements Investimento {

	@Override
	public double calculaResgate(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
