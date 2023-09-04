package Exercicios.Lista_1;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        while (num != 0) {

            if (Math.sqrt(num) == (float) (Math.sqrt(num))) {
                System.out.println("Quadrado perfeito");
            }else{
                System.out.println("Não é perfeito");
            }

            num = sc.nextDouble();
        }

        sc.close();
    }

}
