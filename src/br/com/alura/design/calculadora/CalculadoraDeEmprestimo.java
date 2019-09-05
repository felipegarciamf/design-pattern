package br.com.alura.design.calculadora;

public class CalculadoraDeEmprestimo {
	public void realizaCalculo(Orcamento orcamento, Emprestimo emprestimo) {
		double resultado = emprestimo.calcula(orcamento);
		System.out.println(resultado);
	}

}
