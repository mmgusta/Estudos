package br.com.estudos.model;

public class ContaCorrente extends Conta {
	
	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

}
