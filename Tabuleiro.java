package br.edu.cesarschool.poo.cc.domino;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private List<PecaDomino> pecasJogadas;

    public Tabuleiro() {
        pecasJogadas = new ArrayList<>();
    }

    public void adicionarPeca(PecaDomino peca) {
        pecasJogadas.add(peca);
    }

    public List<PecaDomino> getPecasJogadas() {
        return pecasJogadas;
    }
}
