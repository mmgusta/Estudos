package br.com.estudos.interfaces;

public class Ciruclo implements AreaCalculavel{

	private double raio;
	
	public Ciruclo(double raio) {
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
