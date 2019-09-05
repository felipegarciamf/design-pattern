package br.com.alura.design;

public class ICCC extends Imposto {
	
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICCC() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;	
		} else if (orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;	
		} else {
			return orcamento.getValor() * 0.08 + 30;	
		}	
	}

}
