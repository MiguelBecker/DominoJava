package br.edu.cesarschool.poo.cc.domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InicializarPartidaDomino {
    private List<PecaDomino> baralho;
    
    public InicializarPartidaDomino() {
        InicializarPecas inicializador = new InicializarPecas();
        PecaDomino[] pecasArray = inicializador.getBaralho();
        baralho = new ArrayList<>();
        Collections.addAll(baralho, pecasArray);
        Collections.shuffle(baralho);
    }
    
    public List<List<PecaDomino>> distribuirPecas() {
        List<List<PecaDomino>> distribuicao = new ArrayList<>();
        int numJogadores = 4;
        int pecasPorJogador = 7;
        for (int i = 0; i < numJogadores; i++) {
            List<PecaDomino> mao = new ArrayList<>();
            for (int j = 0; j < pecasPorJogador; j++) {
                mao.add(baralho.remove(0));
            }
            distribuicao.add(mao);
        }
        return distribuicao;
    }
    
    public List<Jogador> gerarJogadores() {
        List<List<PecaDomino>> distribuicao = distribuirPecas();
        List<Jogador> jogadores = new ArrayList<>();
        
        for (int i = 0; i < distribuicao.size(); i++) {
            Jogador jogador = new Jogador(i + 1, distribuicao.get(i));
            jogadores.add(jogador);
        }

        return jogadores;
    }

    public List<PecaDomino> getBaralho() {
        return baralho;
    }
}
