package br.edu.cesarschool.poo.cc.domino;

public class CabecaPeca {
	private ValorCabeca valor;
	
	public CabecaPeca(ValorCabeca valor) {
		this.valor = valor;
	}
	
	public ValorCabeca getValor() {
		return valor;
	} 
	
	public String toString() {
	    return valor.name();
	}
}
