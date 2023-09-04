package Exercicios.Lista_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tam = read.nextInt();
        boolean x = 1 < 3;
        int vetor[] = new int[tam];

        System.out.println("Digite os valores:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++)
                if (vetor[i] > vetor[j])
                    x = false;
            if (x == false)
                break;
        }
        if (x)
            System.out.println("Está organizado!");
        else {
            System.out.println("Não está organizado!");
            read.close();
        }
    }
}
