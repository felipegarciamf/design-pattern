package br.com.alura.design.nota;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {
	
	public static void main(String[] args) {
		
	CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal();
	criador.paraEmpresa("Silas");
	criador.comCNPJ("540654");
	criador.comItem(new ItemDatNota("item1"	, 200.0));
	criador.comItem(new ItemDatNota("item2"	, 300.0));
	criador.comItem(new ItemDatNota("item3"	, 400.0));
	criador.comObservacoes("observacoes");
	criador.dataDeHoje();
	
	NotaFiscal constroi = criador.constroi();
	
	
	}

}
