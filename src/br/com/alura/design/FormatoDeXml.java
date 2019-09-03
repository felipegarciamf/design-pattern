package br.com.alura.design;

public class FormatoDeXml implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
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
