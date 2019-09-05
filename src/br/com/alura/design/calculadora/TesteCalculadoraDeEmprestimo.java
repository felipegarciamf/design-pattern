package br.com.alura.design.calculadora;

public class TesteCalculadoraDeEmprestimo {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(200.0);
		orcamento.cadastraPrazo("5");
		
		Emprestimo ep1 = new EmprestimoPrazoCincoDias();
		Emprestimo ep2 = new EmprestimoPrazoDezDias();
		Emprestimo ep3 = new EmprestimoPrazoVinteDias();
		
		CalculadoraDeEmprestimo calc = new CalculadoraDeEmprestimo();
		calc.realizaCalculo(orcamento, ep1);
		calc.realizaCalculo(orcamento, ep2);
		calc.realizaCalculo(orcamento, ep3);
		
	}
	

}
