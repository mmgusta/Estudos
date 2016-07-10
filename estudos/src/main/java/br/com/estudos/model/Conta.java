package br.com.estudos.model;

public abstract class Conta {
	
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
	
	public abstract void atualiza(double taxa);

}
