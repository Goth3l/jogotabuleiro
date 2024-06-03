package Tabuleiropjt;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiropjt01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int posicaoJogador1 = 0;
        int posicaoJogador2 = 0;
        int jogadorAtual = 1;

        while (posicaoJogador1 < 49 && posicaoJogador2 < 49) {
            System.out.println("Jogador " + jogadorAtual + ", deseja rolar o dado? (sim/não)");
            String resposta = leia.next();

            if (resposta.equals("nao")) {
                break;
            }

            int numeroDado = (int) (Math.random() * 6) + 1;

            if (jogadorAtual == 1) {
                posicaoJogador1 += numeroDado;
                System.out.println("Jogador 1 tirou " + numeroDado + " e avançou para a casa " + posicaoJogador1);
                posicaoJogador1 = verificarEventos(posicaoJogador1);
            } else {
                posicaoJogador2 += numeroDado;
                System.out.println("Jogador 2 tirou " + numeroDado + " e avançou para a casa " + posicaoJogador2);
                posicaoJogador2 = verificarEventos(posicaoJogador2);
            }

           
            jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
        }

        if (posicaoJogador1 >= 49) {
            System.out.println("Jogador 1 ganhou!!!");
        } else if (posicaoJogador2 >= 49) {
            System.out.println("Jogador 2 ganhou!!!");
        }
    }

    public static int verificarEventos(int posicao) {
        switch (posicao) {
            case 3:
                posicao += 3;
                System.out.println("Você acaba de avançar mais 3 casas e está na casa " + posicao);
                break;
            case 5:
                posicao -= 2;
                System.out.println("Você acaba de voltar 2 casas e está na casa " + posicao);
                break;
            case 7:
                posicao += 15;
                System.out.println("Você acaba de dar um salto estrelar!!! e avançou mais 15 casas " + posicao);
                break;
            case 8:
                posicao -= 2;
                System.out.println("Você acaba de voltar 2 casas e está na casa " + posicao);
                break;
            case 10:
                posicao += 5;
                System.out.println("Você acaba de avançar 5 casas e está na casa " + posicao);
                break;
            case 12:
                posicao -= 3;
                System.out.println("Você acaba de voltar 3 casas e está na casa " + posicao);
                break;
            case 14:
                posicao = 3;
                System.out.println("Você pisou em um buraco negro, acaba de voltar para a casa 3");
                break;
            case 17:
                posicao += 2;
                System.out.println("Você acaba de avançar 2 casas e está na casa " + posicao);
                break;
            case 19:
                posicao -= 4;
                System.out.println("Você acaba de voltar 4 casas e está na casa " + posicao);
                break;
            case 22:
                posicao += 2;
                System.out.println("Você acaba de avançar 2 casas e está na casa " + posicao);
                break;
            case 26:
                posicao -= 5;
                System.out.println("Você acaba de voltar 5 casas e está na casa " + posicao);
                break;
            case 28:
                posicao = 42;
                System.out.println("Você pegou um cometa!! avance para a casa 42");
                break;
            case 30:
                System.out.println("Você ganhou!!!");
                break; 
            case 33:
                posicao -= 3;
                System.out.println("Você acaba de voltar 3 casas e está na casa " + posicao);
                break;
            case 35:
                posicao = 18;
                System.out.println("Você caiu em uma nebulosa!! volte para a casa 18");
                break;
            case 40:
                posicao += 3;
                System.out.println("Você acaba de avançar 3 casas e está na casa " + posicao);
                break;
            case 45:
                posicao -= 3;
                System.out.println("Você acaba de voltar 3 casas e está na casa " + posicao);
                break;
            case 47:
                posicao = 0;
                System.out.println("Você acabou de voltar ao início!!");
                break;
        }
        return posicao;
    }
}