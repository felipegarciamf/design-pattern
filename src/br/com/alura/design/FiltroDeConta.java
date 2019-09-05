package br.com.alura.design;

import java.util.List;

public class FiltroDeConta {
	
	
	public void realizaFiltro(List<Conta> conta, Filtro filtro) {
		
		List<Conta> lista = filtro.filtra(conta);
		for (Conta c : lista) {
			System.out.println(c.getTitular() + " " + c.getAgencia() + " " + c.getConta() + " " + c.getDataAbertura());
		}
		
	}

}
