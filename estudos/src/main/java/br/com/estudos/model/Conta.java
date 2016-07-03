package br.com.estudos.model;

public class Conta {
	
	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double saca(double valor) {
		return this.saldo -= valor;
	}
	
	public void atualiza(double taxa) {
		this.saldo *= taxa + 1;
	}

}
