package Exercicios.Lista_2;

import java.util.Scanner;

public class Q10 {
    private static final int tam_vetor = 5;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0, impar = 0, par = 0;
        int vetor_impar[] = new int[tam_vetor];
        int vetor_par[] = new int[tam_vetor];

        for (int a = 0; a < 15; a++) {
            System.out.println("Digite um numero: ");
            num = read.nextInt();

            if (num % 2 == 0)
                vetor_par[par++] = num;
            if (num % 2 == 1)
                vetor_impar[impar++] = num;
            if (par == 5) {
                System.out.println("Vetor de pares: ");
                for (int i = 0; i < tam_vetor; i++)
                    System.out.print(vetor_par[i] + " ");
                System.out.println();
                par = 0;
            } else if (impar == 5) {
                System.out.println("Vetor de ímpares: ");
                for (int i = 0; i < tam_vetor; i++)
                    System.out.print(vetor_impar[i] + " ");
                System.out.println();
                impar = 0;

            }
        }
        System.out.println("Vetor de pares: ");
        for (int i = 0; i < tam_vetor; i++)
            System.out.print(vetor_par[i] + " ");
        System.out.println("\nVetor de ímpares: ");
        for (int i = 0; i < tam_vetor; i++)
            System.out.print(vetor_impar[i] + " ");
        read.close();
    }

}
