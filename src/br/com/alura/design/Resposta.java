package br.com.alura.design;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);

}
