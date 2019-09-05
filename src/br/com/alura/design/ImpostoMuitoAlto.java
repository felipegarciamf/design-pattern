package br.com.alura.design;

public class ImpostoMuitoAlto extends Imposto {
	

	public ImpostoMuitoAlto() {
		// TODO Auto-generated constructor stub
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}
	
	
	

}
