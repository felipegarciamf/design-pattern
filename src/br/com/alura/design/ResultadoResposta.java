package br.com.alura.design;

public class ResultadoResposta {

	public void escreve(Requisicao req, Conta conta) {
		Resposta r1 = new FormatoDeXml();
		Resposta r2 = new FormatoDeCSV();
		Resposta r3 = new FormatoDePorcento();

		
		
		r1.setProxima(r2);
		r2.setProxima(r3);

		
		r1.responde(req, conta);
	}
	
	


	
	

}
