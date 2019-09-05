package br.com.alura.design;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	
	protected Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
	}
	
	public abstract List<Conta> filtra(List<Conta> conta);
	
	protected List<Conta> filtroDaOutraCondicao(List<Conta> conta) {
		if(outroFiltro != null) return outroFiltro.filtra(conta);
		return new ArrayList<Conta>();
	}
	
	
	
}
