package br.com.alura.design;

public class IKCV extends TemplateDeImpostoCondicinal {
	

	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IKCV() {
		// TODO Auto-generated constructor stub
	}
	
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculoDoOutroImposto(orcamento);
	}
	
	
	
}
