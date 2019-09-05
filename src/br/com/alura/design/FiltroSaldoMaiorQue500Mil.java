package br.com.alura.design;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMaiorQue500Mil extends Filtro {
	
	
	public FiltroSaldoMaiorQue500Mil(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMaiorQue500Mil() {
	}
	
	@Override
	public List<Conta> filtra(List<Conta> conta) {
		List<Conta> novaLista = new ArrayList<Conta>();
		for (Conta c : conta) {
			if(c.getSaldo() > 5000) novaLista.add(c);
		}
		novaLista.addAll(filtroDaOutraCondicao(conta));
		return novaLista;
	}

}
