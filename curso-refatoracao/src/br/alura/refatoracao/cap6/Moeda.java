package br.alura.refatoracao.cap6;

public enum Moeda {
	
	EURO(3.7),DOLAR(3.2);
	
	private double valor;

	private Moeda(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

}
