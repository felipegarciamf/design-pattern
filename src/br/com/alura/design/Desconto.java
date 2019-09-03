package br.com.alura.design;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
