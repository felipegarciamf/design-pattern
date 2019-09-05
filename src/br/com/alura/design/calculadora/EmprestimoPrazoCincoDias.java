package br.com.alura.design.calculadora;

public class EmprestimoPrazoCincoDias implements Emprestimo {

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getPrazo().equals("5")) {
			return orcamento.getValor() * 0.30;
		}
		return orcamento.getValor();
	}
	
	
}
