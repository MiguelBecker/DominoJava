package br.edu.cesarschool.poo.cc.domino;

public class InicializarPecas {
	private PecaDomino[] baralho;
	
    public InicializarPecas() {
        baralho = new PecaDomino[28];
        int index = 0;

        for (ValorCabeca cabeca1 : ValorCabeca.values()) {
            for (ValorCabeca cabeca2 : ValorCabeca.values()) {
                if (cabeca1.getValor() >= cabeca2.getValor()) {
                    baralho[index++] = new PecaDomino(new CabecaPeca(cabeca1), new CabecaPeca(cabeca2));
                }
            }
        }
    }
	
	public PecaDomino[] getBaralho() {
        return baralho;
    }
}
