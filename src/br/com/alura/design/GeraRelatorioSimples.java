package br.com.alura.design;

import java.util.List;

public class GeraRelatorioSimples extends Relatorios{


	@Override
	public void cabecalho() {
		System.out.println("SAFRA");
	}

	@Override
	public void rodape() {
		System.out.println("11-968683252");

	}

	@Override
	public void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " " + conta.getSaldo());
		}

	}

	
	

	

}
