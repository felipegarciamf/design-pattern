package br.com.alura.design;

public class TesteImpostoTemplateMethod {
	
	
	public static void main(String[] args) {
		TemplateDeImpostoCondicinal ti1 = new ICPP();
		TemplateDeImpostoCondicinal ti2 = new IKCV();
		TemplateDeImpostoCondicinal ti3 = new IHIT();
		
		Orcamento orcamento = new Orcamento(200.0);
		
		
		orcamento.adicionaItem(new Item("LAPIS", 200.0));
		orcamento.adicionaItem(new Item("CANETA", 200.0));
		orcamento.adicionaItem(new Item("LAPIS", 200.0));
		
		double calcula = ti1.calcula(orcamento);
		double calcula2 = ti2.calcula(orcamento);
		double calcula3 = ti3.calcula(orcamento);
		
		System.out.println(calcula);
		System.out.println(calcula2);
		System.out.println(calcula3);
	}

}
