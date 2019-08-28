package br.com.alura.design;

import java.util.Random;

public class Moderado implements Investimento{

	private Random random;
	
	
	public Moderado() {
		random = new Random();
	}
	
	@Override
	public double calculaResgate(Conta conta) {
		if(random.nextInt(2) == 0) return conta.getSaldo() * 0.0025;
		else return conta.getSaldo() * 0.007;
	}

	
	
}
