package br.com.alura.design;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double icms = imposto.calcula(orcamento);
		System.out.println(icms);
		
	}
	
}
