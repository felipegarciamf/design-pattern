package br.com.alura.design.nota;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {
	
	public static void main(String[] args) {
		
	NotaFiscalBuilder builder = new NotaFiscalBuilder();
	builder.paraEmpresa("Silas")
	.comCNPJ("540654")
	.comItem(new ItemDatNota("item1"	, 200.0))
	.comItem(new ItemDatNota("item2"	, 300.0))
	.comItem(new ItemDatNota("item3"	, 400.0))
	.comObservacoes("observacoes")
	.dataDeHoje();
	
	NotaFiscal nf = builder.constroi();
	
	System.out.println(nf.getValorBruto());
	
	}

}
