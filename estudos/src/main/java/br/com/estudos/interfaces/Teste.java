package br.com.estudos.interfaces;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel b = new Ciruclo(2.9);
		System.out.println(b.calculaArea());
	}

}
