package Exercicios.Lista_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tam = read.nextInt();
        int vetor[] = new int[tam];

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextInt();
        }
        int vetor_copia[] = vetor;
        for (int i = 0; i < vetor_copia.length; i++) {
            System.out.printf(" %d", vetor_copia[i]);
        }
        System.out.println();
        read.close();
    }

}
