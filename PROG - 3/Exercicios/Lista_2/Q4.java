package Exercicios.Lista_2;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vetor[] = new int[5];
        int i = 0;

        System.out.println("PROGRESSÃO ARITMÉTICA");
        System.out.println("Digite um valor para a razão");
        int raz = ler.nextInt();
        System.out.println("Digite um valor inicial para a P.A");
        int inicial = ler.nextInt();

        ler.close();

        for (i = 0; i < vetor.length; i++) { // Salvando valores dentro do vetor
            vetor[i] = raz * i + inicial;
            System.out.println("Vetor termo - [" + (i + 1) + "] = " + vetor[i]);

        }
        ler.close();

    }

}
