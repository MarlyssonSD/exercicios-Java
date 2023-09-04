package Exercicios.Lista_1;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int voto = 0;
        int opcoes[] = new int[7];
        // inicia as votações com 0
        for (int a = 0; a < 7; a++) {
            opcoes[a] = 0;
        }
        System.out.println("Faça a votação:1 2 3 ou 4, 5 para nulo e 6 para branco:");
        do {
            voto = read.nextInt();
            if (voto < 7 && voto > -1)
                opcoes[voto] += 1;
        } while (voto != 0);
        for (int a = 1; a < 7; a++) {
            if (a <= 4)
                System.out.printf("Quantidade que votaram no candidato %d: %d\n", a, opcoes[a]);
            else if (a == 5)
                System.out.printf("Quantidade que votaram branco: %d\n", opcoes[a]);
            else if (a == 6) {
                System.out.printf("Quantidade que votaram nulo: %d\n", opcoes[a]);
            }
        }
        read.close();
    }
}
