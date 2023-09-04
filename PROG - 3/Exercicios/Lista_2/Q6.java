package Exercicios.Lista_2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int vetor1[] = new int[5];
        int vetor2[] = new int[3];
        int verifica = 0;
        System.out.println("Digite 10 valores:");
        for (int a = 0; a < vetor1.length; a++)
            vetor1[a] = read.nextInt();
        System.out.println("Digite 3 valores:");
        for (int b = 0; b < vetor2.length; b++) {
            vetor2[b] = read.nextInt();
        }

        for (int a = 0; a < vetor2.length; a++) {
            for (int b = 0; b < vetor1.length; b++) {
                if (vetor2[a] == vetor1[b])
                    verifica++;
            }
        }
        if (verifica == 3) {
            System.out.println("Vetor 2 está contido em vetor 1");
        } else {
            System.out.println("Vetor 2 não está contido em vetor 1");
        }
        read.close();
    }
}
