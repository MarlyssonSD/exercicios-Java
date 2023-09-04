package Exercicios.Lista_1;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 4;
        // System.out.println("Digite um número: ");
        // num = read.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // for (int i = 1; i < num;) {
        //     for (int j = 1; j < num; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //     num--;
        // }
        read.close();
    }

}
