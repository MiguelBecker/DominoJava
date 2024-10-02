package br.edu.cesarschool.poo.cc.domino;

import java.util.List;
import java.util.Scanner;

public class Turno {
    private Jogador jogador;
    private Tabuleiro tabuleiro;
    private VerificadorPeca verificador;

    public Turno(Jogador jogador, Tabuleiro tabuleiro) {
        this.jogador = jogador;
        this.tabuleiro = tabuleiro;
        this.verificador = new VerificadorPeca(tabuleiro);
    }

    public void iniciarTurno() {
        System.out.println("É a vez do Jogador " + jogador.getId());
        apresentarOpcoes();
    }

    private void apresentarOpcoes() {
        List<PecaDomino> mao = jogador.getMao();
        System.out.println("Suas peças: ");
        for (int i = 0; i < mao.size(); i++) {
            System.out.println(i + ": " + mao.get(i));
        }
        System.out.println("Opções:");
        System.out.println("1. Jogar uma peça");
        System.out.println("2. Passar a vez");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                jogarPeca(scanner);
                break;
            case 2:
                System.out.println("Jogador " + jogador.getId() + " passou a vez.");
                break;
            default:
                System.out.println("Escolha inválida.");
        }
    }
    
    private void jogarPeca(Scanner scanner) {
        List<PecaDomino> mao = jogador.getMao();
        System.out.println("Escolha o índice da peça que deseja jogar:");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < mao.size()) {
            PecaDomino peca = mao.get(indice);
            System.out.println("Escolha o lado para jogar (0 para A, 1 para B):");
            int lado = scanner.nextInt();
            
            if (verificador.jogarPeca(peca, lado)) {
                jogador.jogarPeca(indice);
                System.out.println("Jogador " + jogador.getId() + " jogou a peça: " + peca);
            }
        } else {
            System.out.println("Índice inválido. Tente novamente.");
            jogarPeca(scanner);
        }
    }
}
