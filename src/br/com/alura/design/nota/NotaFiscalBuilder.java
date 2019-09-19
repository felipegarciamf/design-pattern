package br.com.alura.design.nota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDatNota> todosItens = new ArrayList<ItemDatNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDatNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacao) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder dataDeHoje() {
		this.data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}
	
}
