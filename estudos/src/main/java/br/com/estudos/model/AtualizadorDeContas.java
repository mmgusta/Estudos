package br.com.estudos.model;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        // aqui você imprime o saldo anterior
    	System.out.println("Saldo anterior -> " + c.getSaldo());
    	
        // atualiza a conta com a taxa selic,
    	c.atualiza(this.selic);
    	
        // e depois imprime o saldo final
    	System.out.println("Saldo final -> " + c.getSaldo());
    	
        // lembrando de somar o saldo final ao atributo saldoTotal
    	saldoTotal += c.getSaldo();
    }

    // outros métodos
    
    public double getSaldoTotal() {
    	return this.saldoTotal;
    }
}
