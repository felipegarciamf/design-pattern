package br.com.alura.design;

public class FormatoDeCSV implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else if (proxima != null) {
			proxima.responde(req, conta);
		} else {
			throw new RuntimeException("Formato de Resposta não encontrado");
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
		
	}

	
}
