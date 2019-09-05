package br.com.alura.design;

import java.util.Date;
import java.util.List;

public class GeraRelatorioComplexo extends Relatorios{

	@Override
	public void cabecalho() {
		System.out.println("SANTANDER");
		System.out.println("RUA DOIDERA");
		System.out.println("11959592");
		
	}
	
	@Override
	public void rodape() {
		System.out.println("email@teste.com");
		System.out.println(new Date().getDate());	
	}

	@Override
	public void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " " + conta.getAgencia() + " " + conta.getNumeroConta() + " " + conta.getSaldo());
		}
	}

}
