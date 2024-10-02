package br.edu.cesarschool.poo.cc.domino;

public class PecaDomino {
	private CabecaPeca cabeca1;
	private CabecaPeca cabeca2;	
	
	public PecaDomino(CabecaPeca cabeca1, CabecaPeca cabeca2) {
		this.cabeca1 = cabeca1;
		this.cabeca2 = cabeca2;
	}
	public CabecaPeca getCabeca1() {
		return cabeca1;
	}
	public CabecaPeca getCabeca2() {
		return cabeca2;
	}
	public String toString() {
	    return "[" + cabeca1.getValor() + "|" + cabeca2.getValor() + "]";
	}

}