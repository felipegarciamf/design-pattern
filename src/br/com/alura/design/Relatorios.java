package br.com.alura.design;

import java.util.List;

public abstract class Relatorios {
	

	public final void imprime(List<Conta> conta) {
		cabecalho();
		corpo(conta);
		rodape();
	}
	
	
	public abstract void cabecalho();
	
	public abstract void rodape();
	
	public abstract void corpo(List<Conta> conta);
	
	
	

}
