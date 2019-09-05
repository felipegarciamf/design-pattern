package br.com.alura.design;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteFiltroDeConta {

	
	public static void main(String[] args) throws ParseException {
		
		
		String data = "16/09/2018";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(data));
		
		
		
		Conta conta = new Conta("Silas",50000, "232","123","21421", cal);
		Conta conta2 = new Conta("Silas", 500, "232","123","21421", Calendar.getInstance());
		Conta conta3 = new Conta("Silas", 200, "232","123","21421", Calendar.getInstance());
		
		List<Conta> listaDeContas = new ArrayList<Conta>();
		listaDeContas.add(conta);
		listaDeContas.add(conta2);
		listaDeContas.add(conta3);
		
		Filtro f1 = new FiltroSaldoMaiorQue500Mil(new FiltroDataDeAberturaMesAtual());
	/*	Filtro f2 = new ContaSaldoMenorQue100();
		Filtro f3 = new ContaDataDeAberturaMesAtual();*/
		
		FiltroDeConta filtroDeConta = new FiltroDeConta();
		filtroDeConta.realizaFiltro(listaDeContas, f1);
		
	
		
		
		
		
		
	}
	
}
