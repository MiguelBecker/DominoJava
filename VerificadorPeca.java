package br.edu.cesarschool.poo.cc.domino;

import java.util.List;

public class VerificadorPeca {
    private Tabuleiro tabuleiro;

    public VerificadorPeca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean podeJogar(PecaDomino peca) {
    }


    public boolean jogarPeca(PecaDomino peca, int lado) {
        if (!podeJogar(peca)) {
            System.out.println("A peça não pode ser jogada.");
            return false;
        }
        tabuleiro.adicionarPeca(peca);
        if (lado == 0) {
            if (peca.getCabeca1().getValor() == tabuleiro.getPecasJogadas().get(0).getCabeca1().getValor() ||
                peca.getCabeca1().getValor() == tabuleiro.getPecasJogadas().get(0).getCabeca2().getValor()) {
                System.out.println("Jogador jogou a peça no lado A.");
            } else {
                System.out.println("Jogador jogou a peça no lado A, nova extremidade: " + peca.getCabeca2().getValor());
            }
        } else {
            if (peca.getCabeca2().getValor() == tabuleiro.getPecasJogadas().get(tabuleiro.getPecasJogadas().size() - 1).getCabeca1().getValor() ||
                peca.getCabeca2().getValor() == tabuleiro.getPecasJogadas().get(tabuleiro.getPecasJogadas().size() - 1).getCabeca2().getValor()) {

                System.out.println("Jogador jogou a peça no lado B.");
            } else {
                System.out.println("Jogador jogou a peça no lado B, nova extremidade: " + peca.getCabeca1().getValor());
            }
        }
        return true;
    }
}
