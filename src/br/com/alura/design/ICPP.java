package br.com.alura.design;

public class ICPP extends TemplateDeImpostoCondicinal {


	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}
