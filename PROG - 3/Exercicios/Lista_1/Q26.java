package Exercicios.Lista_1;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int num1, num2, aux = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o número a ser elevado: ");
        num1 = read.nextInt();
        aux = num1;
        System.out.println("Digite o expoente do número que deseja elevar: ");
        num2 = read.nextInt();
        while (num2 > 1) {
            num1 *= aux;
            num2--;

        }
        System.out.println(num1);
        read.close();
    }

}
