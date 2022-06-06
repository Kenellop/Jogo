import java.util.Random;
import java.util.Scanner;

public class Jogo {
    static Scanner console = new Scanner(System.in);
    static Random sorteador = new Random();
    static final byte[][] REGRAS_DO_JOGO = {
            {0, -1, 1, 1, -1},
            {1, 0, -1, -1, 1},
            {-1, 1, 0, 1, -1},
            {-1, 1, -1, 0, 1},
            {1, -1, 1, -1, 0}
    };
    static final String[] opcoes = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock"};

    static final byte GANHOU = 1;
    static final byte EMPATOU = 0;
    static final byte PERDEU = -1;

    static int obterOpcaoComputador(){
        return sorteador.nextInt(REGRAS_DO_JOGO.length);
    }
    static int lerOpcaoJogador() {
        System.out.println("[0] Pedra");
        System.out.println("[1] Papel");
        System.out.println("[2] Tesoura");
        System.out.println("[3] Lagarto");
        System.out.println("[4] Spock");
        System.out.print("Opção: ");

        return console.nextInt();
    }



    public static void main(String[]args){
        int jogador = lerOpcaoJogador();
        int computador = obterOpcaoComputador();

        System.out.printf("Jogador: %s", opcoes[jogador]);
        System.out.print("\n");
        System.out.printf("Computador: %s", opcoes[computador]);
        System.out.println("\n");

        if (REGRAS_DO_JOGO[jogador][computador] == GANHOU) {
            System.out.println("Parabéns, você ganhou!");
        }else if (REGRAS_DO_JOGO[jogador][computador] == EMPATOU){
            System.out.println("Houve um empate :c");
        }else if (REGRAS_DO_JOGO[jogador][computador] == PERDEU) {
            System.out.println("O computador ganhou");
        }
    }
}
