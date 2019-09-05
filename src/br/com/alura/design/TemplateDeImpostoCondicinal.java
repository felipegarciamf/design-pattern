package br.com.alura.design;

public abstract class TemplateDeImpostoCondicinal extends Imposto{

	public TemplateDeImpostoCondicinal(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicinal() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public final double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

}
