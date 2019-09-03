package br.com.alura.design;

public class Conta {
	
	private String titular;
	private double saldo;
	
	
	public Conta() {
		
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;	
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}


}
