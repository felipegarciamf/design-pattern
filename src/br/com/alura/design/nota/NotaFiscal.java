package br.com.alura.design.nota;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cpnj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDatNota> itens;
	private String observacoes;
	
	public NotaFiscal(String razaoSocial, String cpnj, Calendar dataDeEmissao, double valorBruto, double impostos,
			List<ItemDatNota> itens, String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cpnj = cpnj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCpnj() {
		return cpnj;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemDatNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}


}
