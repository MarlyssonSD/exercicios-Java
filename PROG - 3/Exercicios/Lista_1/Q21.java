package Exercicios.Lista_1;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias");
        int dias = read.nextInt();
        System.out.println("Informe o volume desejado");
        float volume_desejado = read.nextFloat();
        for (int a = 0; a < dias; a++) {
            volume_desejado = volume_desejado / 2.0f;
        }
        System.out.printf("%.3f de volume é o valor inicial.", volume_desejado);
        read.close();
    }

}