package br.com.alura.design;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		
		Imposto iss = new ISS(new ICMS());
		Imposto icms = new ICMS();
		Imposto ipva = new IPVA();
		Imposto iccc = new ICCC();
		Imposto impostoAlto = new ImpostoMuitoAlto(new ICMS());
		Imposto icpp = new ICPP(new IKCV());
		Imposto ikcv = new IKCV(new ICPP());
		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		/*calc.realizaCalculo(orcamento, icms);
		calc.realizaCalculo(orcamento, iss);
		calc.realizaCalculo(orcamento, ipva);
		calc.realizaCalculo(orcamento, iccc);*/
		calc.realizaCalculo(orcamento, icpp);
		calc.realizaCalculo(orcamento, ikcv);
		
	}	
	
}
