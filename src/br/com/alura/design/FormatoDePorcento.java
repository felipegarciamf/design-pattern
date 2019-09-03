package br.com.alura.design;

public class FormatoDePorcento implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
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
