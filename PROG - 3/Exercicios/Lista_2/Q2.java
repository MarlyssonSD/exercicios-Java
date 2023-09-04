package Exercicios.Lista_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam, acima_media = 0, abaixo_media = 0;
        float valores = 0, media = 0;

        System.out.print("Digite o tamanho do vetor: ");
        tam = read.nextInt();
        float[] vetor = new float[tam];

        System.out.println("Digite os valores para o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            valores = read.nextFloat();
            vetor[i] = valores;
            media += valores;
        }
        media = media / tam;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media)
                acima_media++;
            else if (vetor[i] < media)
                abaixo_media++;
        }
        System.out.printf("Média = %.2f\n", media);
        System.out.printf("Abaixo da media: %d\n", abaixo_media);
        System.out.printf("Acima da media: %d\n", acima_media);
        read.close();
    }

}
