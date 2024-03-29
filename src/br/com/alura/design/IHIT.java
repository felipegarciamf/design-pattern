package br.com.alura.design;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicinal {
	
	
	
	
	private boolean possuiDoisItensIguais(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		
		for (Item item : orcamento.getItens()) {
			if(noOrcamento.contains(item.getNome())) return true;
			else noOrcamento.add(item.getNome());
		}
		return false;
	}
	
	
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}
	


	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return possuiDoisItensIguais(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	
	
}
