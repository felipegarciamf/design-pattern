package br.com.alura.design.calculadora;

public class EmprestimoPrazoDezDias implements Emprestimo {

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getPrazo().equals("10")) {
			return orcamento.getValor() * 0.20;
		} 
		return orcamento.getValor();
	}

}
