package Exercicios.Lista_2;

import java.util.Scanner;

public class Q5 {
    private static final int tam = 30;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char nome_char[] = new char[tam];
        System.out.println("Digite um nome:");
        String nome = scan.next();

        nome_char = nome.toCharArray();
        for (int i = 0; i < nome.length(); i++) {
            System.out.print(nome_char[i]);
        }
        scan.close();
    }
}
