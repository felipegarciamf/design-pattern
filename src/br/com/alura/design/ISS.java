package br.com.alura.design;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
	
	
}