package br.com.alura.design;

public class IPVA extends Imposto {

	public IPVA() {
		// TODO Auto-generated constructor stub
	}
	
	public IPVA(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20;
	}

}
