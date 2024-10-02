package br.edu.cesarschool.poo.cc.domino;

import java.util.List;
import java.util.ArrayList;

public class Jogador {
    private List<PecaDomino> mao;
    private int id;

    public Jogador(int id, List<PecaDomino> maoInicial) {
        this.id = id;
        this.mao = new ArrayList<>(maoInicial);
    }

    public List<PecaDomino> getMao() {
        return mao;
    }

    public void jogarPeca(int n) {
        if (n >= 0 && n < mao.size()) {
            mao.remove(n);
        } else {
            System.out.println("Índice inválido! Não é possível jogar essa peça.");
        }
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Jogador " + id + " com peças: " + mao;
    }
}
