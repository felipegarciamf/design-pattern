package br.com.alura.design.nota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorDeNotaFiscal {

	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDatNota> todosItens = new ArrayList<ItemDatNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	

	public void paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void comCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void comItem(ItemDatNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
	}
	
	public void comObservacoes(String observacao) {
		this.observacoes = observacoes;
	}
	
	public void dataDeHoje() {
		this.data = Calendar.getInstance();
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}
	
}
