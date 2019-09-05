package br.com.alura.design;

public class TesteDeImpostosComplexos {
	

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500);
		double calcula = iss.calcula(orcamento);
		System.out.println(calcula);

	}

	

}
