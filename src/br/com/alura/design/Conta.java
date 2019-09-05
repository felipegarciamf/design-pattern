package br.com.alura.design;

import java.util.Calendar;

public class Conta {
	
	private String titular;
	private double saldo;
	private String agencia;
	private String conta;
	private String numeroConta;
	private Calendar dataAbertura;
	
	public Conta() {
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta(String titular, double saldo, String agencia, String conta, String numeroConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;
		this.numeroConta = numeroConta;
	}
	
	
	public Conta(String titular, double saldo, String agencia, String conta, String numeroConta, Calendar dataAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;
		this.numeroConta = numeroConta;
		this.dataAbertura = dataAbertura;
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

	public String getAgencia() {
		return agencia;
	}

	public String getConta() {
		return conta;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}

}
