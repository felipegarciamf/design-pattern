package br.com.alura.design;

public class TesteDeResposta {
	
	
	public static void main(String[] args) {
	
		Conta conta = new Conta("Jorge", 200.0);
		Requisicao req = new Requisicao(Formato.CSV);
		
		ResultadoResposta rr = new ResultadoResposta();
		rr.escreve(req, conta);
		
		
	}
	

}
