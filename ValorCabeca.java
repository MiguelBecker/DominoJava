package br.edu.cesarschool.poo.cc.domino;

public enum ValorCabeca {
	NU(0),
	PIU(1),
	DUQUE(2),
	TERNO(3),
	QUADRA(4),
	QUINA(5),
	SENA(6);
	
	private int valor;
	private ValorCabeca(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}