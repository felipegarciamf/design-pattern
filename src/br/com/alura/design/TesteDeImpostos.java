package br.com.alura.design;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		
		Imposto iss = new ISS(new ICMS());
		Imposto icms = new ICMS();
		Imposto ipva = new IPVA();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.realizaCalculo(orcamento, icms);
		calc.realizaCalculo(orcamento, iss);
		calc.realizaCalculo(orcamento, ipva);
		calc.realizaCalculo(orcamento, iccc);
		
	}	
	
}
