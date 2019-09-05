package br.com.alura.design;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroDataDeAberturaMesAtual extends Filtro {

	
	public FiltroDataDeAberturaMesAtual(Filtro outroFiltro) {
		super(outroFiltro);
	}
	public FiltroDataDeAberturaMesAtual() {
	}
	
	@Override
	public List<Conta> filtra(List<Conta> conta) {
		List<Conta> novaLista = new ArrayList<Conta>();	
		for (Conta c : conta) {
			if(c.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) && 
		            c.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) novaLista.add(c);
		}
		novaLista.addAll(filtroDaOutraCondicao(conta));
		return novaLista;
	}

}
