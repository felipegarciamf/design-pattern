package br.com.alura.design.calculadora;

public class EmprestimoPrazoVinteDias implements Emprestimo {

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getPrazo().equals("20")) {
			return orcamento.getValor() * 0.10;
		}
		return orcamento.getValor();
	}

}
