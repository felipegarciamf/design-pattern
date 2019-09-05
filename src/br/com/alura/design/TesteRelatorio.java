package br.com.alura.design;

import java.util.ArrayList;
import java.util.List;

public class TesteRelatorio {
	
	public static void main(String[] args) {
		
		List<Conta> listaConta = new ArrayList<Conta>();
		
		
		Conta conta = new Conta("Silas", 200.0, "285", "4125", "412");
		Conta conta2 = new Conta("Sila2s", 200.0, "285", "4125", "412");
		Conta conta3 = new Conta("Silas213", 200.0, "285", "4125", "412");
		
		listaConta.add(conta);
		listaConta.add(conta2);
		listaConta.add(conta3);
		
		Relatorios normal = new GeraRelatorioSimples();
		Relatorios complexo = new GeraRelatorioComplexo();
		
		
		normal.imprime(listaConta);
		//complexo.imprime(listaConta);
		
		
	}

}
