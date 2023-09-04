package Exercicios.Lista_1;

import java.util.Scanner;
import java.lang.Math;

public class Q23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int rand = 0, acertou = 0;
        rand = (int) (Math.random() * 100) + 1;
        do {
            System.out.print("Tente acertar um número: ");
            acertou = read.nextInt();
            if (acertou < rand) {
                System.out.println("O número é maior que " + acertou);
            } else if (acertou > rand) {
                System.out.println("O número é menor que " + acertou);
            } else {
                System.out.println("Acertou!");
            }

        } while (acertou != rand);
        read.close();
    }

}
