package br.com.alura.design;

public class DescontoPorVendaCasada implements Desconto {

	Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if(aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
		
	}
	
	public boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return orcamento.contemItemDeNome("CANETA") && orcamento.contemItemDeNome("LAPIS");
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;	
	}

}
