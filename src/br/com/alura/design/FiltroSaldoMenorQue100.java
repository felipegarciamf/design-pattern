package br.com.alura.design;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenorQue100 extends Filtro {

	
	public FiltroSaldoMenorQue100(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMenorQue100() {
	}
	
	@Override
	public List<Conta> filtra(List<Conta> conta) {
		List<Conta> novaLista = new ArrayList<Conta>();
		for (Conta c : conta) {
			if (c.getSaldo() < 100) novaLista.add(c);	
		}
		novaLista.addAll(filtroDaOutraCondicao(conta));
		return novaLista;
	}

}
