package Exercicios.Lista_1;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int inicial = 0, quant = 0, soma = 0;

        System.out.println("Digite o valor inicial da soma:");
        inicial = read.nextInt();
        System.out.println("Digite a quantidade de números que somará após o valor inicial:");
        quant = read.nextInt();

        for (int x = 0; x < quant; x++) {
            soma += inicial;
            inicial++;
        }
        System.out.println(soma);
        read.close();
    }

}
