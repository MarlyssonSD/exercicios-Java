package Exercicios.Lista_1;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, soma = 0;
        System.out.print("Digite um número: ");
        num = read.nextInt();
        do {
            soma += num % 10;
            num = num / 10;
        } while (num != 0);
        System.out.println("A soma dos digitos é: " + soma);
        read.close();
    }

}
