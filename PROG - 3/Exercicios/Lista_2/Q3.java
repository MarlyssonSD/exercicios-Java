package Exercicios.Lista_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o tamanho dos vetores: ");
        int tam = read.nextInt();
        int vetor1[] = new int[tam];
        int vetor2[] = new int[tam];

        System.out.println("Digite os valores do vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = read.nextInt();
        }
        System.out.println("Digite os valores do vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = read.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf(vetor1[i] + vetor2[i] + " ");
        }
        read.close();
    }

}
